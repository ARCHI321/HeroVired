package BasicsOFJava.Oops.Graded;

import java.util.*;
import java.util.Scanner;

class inventory {
    private HashMap<String, List<String>> storedb = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    inventory() {
        storedb.put("101", Arrays.asList("Mobile", "50000", "10",
                "Dual Sim | Battery Life - 7000mAH | Memory Card supported | 4GB RAM | 64GB inbuilt"));
        storedb.put("102",
                Arrays.asList("Laptop", "70000", "4", "Processor - AMD Ryzen 5 2600X Six Core Processor | RAM - 16GB"));
        storedb.put("103", Arrays.asList("Tablet", "100000", "5",
                "Battery - 4500mAh | Storage - 16GB | Display - 8inch | RAM - 2GB"));
        storedb.put("104", Arrays.asList("Portable HDD", "12000", "12", "Capacity : 2TB | Format - NTFS"));
        storedb.put("105", Arrays.asList("Bluetooth Headphone", "30000", "15", "Capacity : 2TB | Format - NTFS"));
        storedb.put("106", Arrays.asList("Smart-watch", "2000", "15",
                "Compatibility - ios and Android | Water Resistance | Battery Life - 2days | GPS, fitness tracking, sleep monitoring, step counting, and more"));
        storedb.put("107", Arrays.asList("Digital Camera", "56000", "5",
                "Compatibility - ios and Android | Water Resistance | Battery Life - 2days |"));
        storedb.put("108", Arrays.asList("Portable Power bank", "10000", "10",
                "Compatibility - ios and Android | Water Resistance | Battery Life - 2days |"));
        storedb.put("109", Arrays.asList("Printer", "20000", "10",
                "Compatibility - ios and Android | Water Resistance | Battery Life - 2days |"));
        storedb.put("110", Arrays.asList("Wireless Router", "25000", "10",
                "Compatibility - ios and Android | Water Resistance | Battery Life - 2days |"));
    }

    public void displayAllProducts() {
        System.out.println("----------------------LIST OF ALL PRODUCTS-------------------------");
        for (String k : storedb.keySet()) {
            System.out.println(storedb.get(k) + "\n");
        }
        System.out.println("-------------------------------------------------------------------");
    }

    public void getCountProduct(String prod_id) {
        if (storedb.keySet().contains(prod_id)) {
            System.out.println("----------------------COUNT OF PRODUCT-------------------------");
            String count = storedb.get(prod_id).get(2);
            System.out.println("Count of available " + storedb.get(prod_id).get(0) + " is " + count);
            System.out.println("-------------------------------------------------------------------");
        } else {
            System.out.println("Product not available");
        }
    }

    public void getProductDetails(String prod_id) {
        if (storedb.keySet().contains(prod_id)) {
            System.out.println("----------------------DETAILS OF PRODUCT-------------------------");
            System.out.println("Product ID" + " : " + prod_id);
            System.out.println("Name of Product" + " : " + storedb.get(prod_id).get(0));
            System.out.println("Price of Product" + " : " + storedb.get(prod_id).get(1));
            System.out.println("Count of Product" + " : " + storedb.get(prod_id).get(2));
            System.out.println("Specifications of Product" + " : " + storedb.get(prod_id).get(3));

            System.out.println("-------------------------------------------------------------------");
        } else {
            System.out.println("Product not available");
        }
    }

    public void setProductDetails(String prod_id) {
        if (storedb.keySet().contains(prod_id)) {
            System.out.println("----------------------DETAILS OF PRODUCT-------------------------");
            System.out.println("Product ID" + " : " + prod_id);
            System.out.println("Name of Product" + " : " + storedb.get(prod_id).get(0));
            System.out.println("Price of Product" + " : " + storedb.get(prod_id).get(1));
            System.out.println("Count of Product" + " : " + storedb.get(prod_id).get(2));
            System.out.println("Specifications of Product" + " : " + storedb.get(prod_id).get(3));

            System.out.println("-------------------------------------------------------------------");
            System.out.println("1.Name  2.Price  3.Specifications");
            System.out.print("Enter which details to be updated : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter new product name : ");
                    String p_name = sc.nextLine();
                    storedb.get(prod_id).set(0, p_name);
                    break;
                case 2:
                    System.out.print("Enter new product price : ");
                    String p_price = sc.nextLine();
                    storedb.get(prod_id).set(1, p_price);
                    break;
                case 3:
                    System.out.print("Enter new product specifications : ");
                    String p_specs = sc.nextLine();
                    storedb.get(prod_id).set(3, p_specs);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
            System.out.println("----------------------UPDATED DETAILS OF PRODUCT-------------------------");
            System.out.println("Product ID" + " : " + prod_id);
            System.out.println("Name of Product" + " : " + storedb.get(prod_id).get(0));
            System.out.println("Price of Product" + " : " + storedb.get(prod_id).get(1));
            System.out.println("Count of Product" + " : " + storedb.get(prod_id).get(2));
            System.out.println("Specifications of Product" + " : " + storedb.get(prod_id).get(3));

            System.out.println("-------------------------------------------------------------------");
        } else {
            System.out.println("Product not available");
        }
    }

    public void setProductCount(String prod_id) {
        if (storedb.keySet().contains(prod_id)) {
            System.out.println("----------------------COUNT OF PRODUCT-------------------------");
            System.out.println("Product ID" + " : " + prod_id);
            System.out.println("Count of Product" + " : " + storedb.get(prod_id).get(2));

            System.out.println("-------------------------------------------------------------------");
            System.out.print("Enter new product count : ");
            String p_count = sc.nextLine();
            storedb.get(prod_id).set(2, p_count);
            System.out.println("----------------------UPDATED COUNT OF PRODUCT-------------------------");
            System.out.println("Product ID" + " : " + prod_id);
            System.out.println("Count of Product" + " : " + storedb.get(prod_id).get(2));

            System.out.println("-------------------------------------------------------------------");

        } else {
            System.out.println("Product not available");
        }
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        inventory obj = new inventory();
        obj.displayAllProducts();
        obj.getCountProduct("102");
        obj.getProductDetails("102");
        obj.setProductDetails("102");
        obj.setProductCount("102");
    }
}
