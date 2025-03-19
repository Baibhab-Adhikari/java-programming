package day8;

import java.io.*;

class Item {
    String name;
    int quantity;
    double price;

    void getData() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the name of the item: ");
            name = br.readLine();
            System.out.print("Enter the quantity of the item: ");
            quantity = Integer.parseInt(br.readLine());
            System.out.print("Enter the price of the item: ");
            price = Double.parseDouble(br.readLine());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    void showData() {
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
    }

    double calPrice() {
        return quantity * price;
    }
}

public class prob1 {
    public static void main(String[] args) {
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();

        item1.getData();
        item2.getData();
        item3.getData();

        item1.showData();
        item2.showData();
        item3.showData();

        System.out.println("Total price of all items: " + (item1.calPrice() + item2.calPrice() + item3.calPrice()));
    }
}
