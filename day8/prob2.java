package day8;

import java.util.ArrayList;
import java.util.Scanner;

class Hotel {
    private ArrayList<String> hotelList;

    public Hotel() {
        hotelList = new ArrayList<>();
    }

    public void getItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the hotel: ");
        String hotelName = scanner.nextLine();
        hotelList.add(hotelName);
        showHotels();
        scanner.close();
    }

    public void showHotels() {
        System.out.println("Current list of hotels:");
        for (int i = 0; i < hotelList.size(); i++) {
            System.out.println((i + 1) + ". " + hotelList.get(i));
        }
    }

    public void insertNewHotel() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the new hotel: ");
        String newHotelName = scanner.nextLine();
        hotelList.add(newHotelName);
        showHotels();
        scanner.close();
    }

    public void changeList() {
        if (hotelList.size() > 3) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the new name for the hotel at index 3: ");
            String newName = scanner.nextLine();
            hotelList.set(3, newName);
            showHotels();
            scanner.close();
        } else {
            System.out.println("There are not enough hotels to change the one at index 3.");
        }
    }

    public void removeList() {
        if (hotelList.size() > 2) {
            hotelList.remove(2);
            showHotels();
        } else {
            System.out.println("There are not enough hotels to remove the one at index 2.");
        }
    }

    public static void main(String[] args) {
        Hotel hotelManager = new Hotel();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Hotel");
            System.out.println("2. Insert New Hotel");
            System.out.println("3. Change Hotel at Index 3");
            System.out.println("4. Remove Hotel at Index 2");
            System.out.println("5. Show Hotels");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    hotelManager.getItem();
                    break;
                case 2:
                    hotelManager.insertNewHotel();
                    break;
                case 3:
                    hotelManager.changeList();
                    break;
                case 4:
                    hotelManager.removeList();
                    break;
                case 5:
                    hotelManager.showHotels();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}