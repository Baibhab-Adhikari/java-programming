import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeManagementSystem extends JFrame {

    Connection con;

    JTextField nameField, designationField, salaryField;
    JTextField projectEmpIdField, projectNameField;

    DefaultTableModel empTableModel, projectTableModel;

    public EmployeeManagementSystem() {
        setTitle("Employee Management System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        connectDatabase();

        JTabbedPane tabbedPane = new JTabbedPane();

        // Employee Tab
        JPanel empPanel = new JPanel(new BorderLayout());
        empPanel.add(getEmployeeForm(), BorderLayout.NORTH);
        empPanel.add(getEmployeeTable(), BorderLayout.CENTER);

        // Project Tab
        JPanel projectPanel = new JPanel(new BorderLayout());
        projectPanel.add(getProjectForm(), BorderLayout.NORTH);
        projectPanel.add(getProjectTable(), BorderLayout.CENTER);

        tabbedPane.add("Employees", empPanel);
        tabbedPane.add("Projects", projectPanel);

        add(tabbedPane);

        setVisible(true);

        loadEmployeeData();
        loadProjectData();
    }

    void connectDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employee_db", "root", "password");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database connection failed!");
        }
    }

    JPanel getEmployeeForm() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));

        nameField = new JTextField();
        designationField = new JTextField();
        salaryField = new JTextField();
        JButton addEmpBtn = new JButton("Add Employee");

        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Designation:"));
        panel.add(designationField);
        panel.add(new JLabel("Salary:"));
        panel.add(salaryField);
        panel.add(new JLabel(""));
        panel.add(addEmpBtn);

        addEmpBtn.addActionListener(e -> addEmployee());

        return panel;
    }

    JScrollPane getEmployeeTable() {
        empTableModel = new DefaultTableModel(new String[] { "ID", "Name", "Designation", "Salary" }, 0);
        JTable table = new JTable(empTableModel);
        return new JScrollPane(table);
    }

    JPanel getProjectForm() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        projectEmpIdField = new JTextField();
        projectNameField = new JTextField();
        JButton addProjBtn = new JButton("Add Project");

        panel.add(new JLabel("Employee ID:"));
        panel.add(projectEmpIdField);
        panel.add(new JLabel("Project Name:"));
        panel.add(projectNameField);
        panel.add(new JLabel(""));
        panel.add(addProjBtn);

        addProjBtn.addActionListener(e -> addProject());

        return panel;
    }

    JScrollPane getProjectTable() {
        projectTableModel = new DefaultTableModel(new String[] { "Project ID", "Emp ID", "Project Name" }, 0);
        JTable table = new JTable(projectTableModel);
        return new JScrollPane(table);
    }

    void addEmployee() {
        String name = nameField.getText();
        String designation = designationField.getText();
        String salaryText = salaryField.getText();

        if (name.isEmpty() || designation.isEmpty() || salaryText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        try {
            PreparedStatement pst = con
                    .prepareStatement("INSERT INTO emp (name, designation, salary) VALUES (?, ?, ?)");
            pst.setString(1, name);
            pst.setString(2, designation);
            pst.setDouble(3, Double.parseDouble(salaryText));
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Employee added!");
            nameField.setText("");
            designationField.setText("");
            salaryField.setText("");
            loadEmployeeData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void addProject() {
        String empId = projectEmpIdField.getText();
        String projectName = projectNameField.getText();

        if (empId.isEmpty() || projectName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields.");
            return;
        }

        try {
            PreparedStatement pst = con.prepareStatement("INSERT INTO project (emp_id, project_name) VALUES (?, ?)");
            pst.setInt(1, Integer.parseInt(empId));
            pst.setString(2, projectName);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Project added!");
            projectEmpIdField.setText("");
            projectNameField.setText("");
            loadProjectData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void loadEmployeeData() {
        try {
            empTableModel.setRowCount(0);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
            while (rs.next()) {
                empTableModel.addRow(new Object[] {
                        rs.getInt("emp_id"),
                        rs.getString("name"),
                        rs.getString("designation"),
                        rs.getDouble("salary")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void loadProjectData() {
        try {
            projectTableModel.setRowCount(0);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM project");
            while (rs.next()) {
                projectTableModel.addRow(new Object[] {
                        rs.getInt("project_id"),
                        rs.getInt("emp_id"),
                        rs.getString("project_name")
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new EmployeeManagementSystem();
    }
}
