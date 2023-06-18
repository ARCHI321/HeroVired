package BasicsOFJava.PracticePrograms.Basic;

import java.util.Scanner;

public class InventoryManagement {

  public static void printAllProducts(String[][] products) {
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");
    System.out.println("List of all Products");
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");
    System.out.println("ProductID" + " " + "Product Name");
    for (int i = 0; i < products.length; i++) {
      if (!products[i][3].equals("0"))
        System.out.println(products[i][0] + " \t " + products[i][1]);

    }
  }

  public static void findCount(String[][] products, int pid) {
    int flag = 0;
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");

    for (int i = 0; i < products.length; i++) {
      int p = Integer.parseInt(products[i][0]);
      if (p == pid) {
        System.out.println(products[i][0] + " " + products[i][1]);
        System.out.println("Total available count : " + products[i][3]);
        flag = 1;
        break;
      }

    }

    if (flag == 0) {
      System.out.println("Product not found");
    }
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");

  }

  public static void viewSpecifications(String[][] products, int pid) {
    int flag = 0;
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");

    for (int i = 0; i < products.length; i++) {
      int p = Integer.parseInt(products[i][0]);
      if (p == pid) {
        System.out.println(products[i][0] + " " + products[i][1]);
        System.out.println("Total available count : " + products[i][3]);
        System.out.println(products[i][4]);
        flag = 1;
        break;
      }

    }
    if (flag == 0) {
      System.out.println("Product not found");
    }
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");
  }

  public static void editSpecifications(String[][] products, int pid) {
    int flag = 0;
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");

    for (int i = 0; i < products.length; i++) {

      Scanner sc = new Scanner(System.in);
      int p = Integer.parseInt(products[i][0]);
      if (p == pid) {
        System.out.println("1.Product Name  2. Product Details");
        System.out.print("What do you want to change (1/2) ? ");
        int change = sc.nextInt();
        flag = 1;
        if (change == 1) {
          sc.nextLine();
          System.out.print("Enter a new product name : ");
          String newPNAme = sc.nextLine();
          products[i][1] = newPNAme;
          System.out.println(products[i][0] + " " + products[i][1]);
        }
        if (change == 2) {
          sc.nextLine();
          System.out.print("Enter a new Specifications : ");
          String newDetails = sc.nextLine();
          products[i][4] = newDetails;
          System.out.println(products[i][0] + " " + products[i][1] + " " + products[i][4]);
        }
        break;
      }

    }
    if (flag == 0) {
      System.out.println("Product not found");
    }
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");
  }

  public static void updateInventory(String[][] products, int pid) {
    int flag = 0;
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");

    for (int i = 0; i < products.length; i++) {
      Scanner sc = new Scanner(System.in);
      int p = Integer.parseInt(products[i][0]);
      if (p == pid) {

        System.out.println("1.Add inventory   2. Subtract inventory");
        System.out.print("Please choose an option from the above menu:  ? ");
        int change = sc.nextInt();
        System.out.println("Current available inventory for Smart-watch " + products[i][3]);
        flag = 1;
        if (change == 1) {
          System.out.println("Please enter the count to be added: ");
          int count = sc.nextInt();
          int changedCount = Integer.parseInt(products[i][3]) + count;
          products[i][3] = Integer.toString(changedCount);
          System.out.println(
              "-----------------------------------------------------------------------------------------------------");
          System.out.println(products[i][0] + " " + products[i][1]);
          System.out.println("Total available count : " + products[i][3]);

          System.out.println(
              "-----------------------------------------------------------------------------------------------------");
        }
        if (change == 2) {
          System.out.println("Please enter the count to be subtracted: ");
          int count = sc.nextInt();
          int changedCount = Integer.parseInt(products[i][3]) - count;
          products[i][3] = Integer.toString(changedCount);
          System.out.println(
              "-----------------------------------------------------------------------------------------------------");
          System.out.println(products[i][0] + " " + products[i][1]);
          System.out.println("Total available count : " + products[i][3]);

          System.out.println(
              "-----------------------------------------------------------------------------------------------------");
        }
        break;

      }

    }
    if (flag == 0) {
      System.out.println("Product not found");
    }
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[][] products = {
        { "101", "Mobile", "50000", "10",
            "Dual Sim | Battery Life - 7000mAH | Memory Card supported | 4GB RAM | 64GB inbuilt" },
        { "102", "Laptop", "70000", "4", "Processor - AMD Ryzen 5 2600X Six Core Processor | RAM - 16GB" },
        { "103", "Tablet", "100000", "5", "Battery - 4500mAh | Storage - 16GB | Display - 8inch | RAM - 2GB" },
        { "104", "Portable HDD", "12000", "12", "Capacity : 2TB | Format - NTFS" },
        { "105", "Bluetooth Headphone", "30000", "15", "Capacity : 2TB | Format - NTFS" },
        { "106", "Smart-watch", "2000", "15",
            "Compatibility - ios and Android | Water Resistance | Battery Life - 2days | GPS, fitness tracking, sleep monitoring, step counting, and more" },
        { "107", "Digital Camera", "56000", "5",
            "Compatibility - ios and Android | Water Resistance | Battery Life - 2days |" },
        { "108", "Portable Power bank", "10000", "10",
            "Compatibility - ios and Android | Water Resistance | Battery Life - 2days |" },
        { "109", "Printer", "20000", "10",
            "Compatibility - ios and Android | Water Resistance | Battery Life - 2days |" },
        { "110", "Wireless Router", "25000", "10",
            "Compatibility - ios and Android | Water Resistance | Battery Life - 2days |" } };
    String ans;

    System.out.println(
        "-----------------------------------------------------------------------------------------------------");
    System.out.println("Welcome to the SmartPoint Electronics Store");
    System.out.println(
        "-----------------------------------------------------------------------------------------------------");
    do {
      System.out.println("1. View the complete list of our products");
      System.out.println("2. Check the available count for a specific product");
      System.out.println("3. View the specifications and details of a specific product");
      System.out.println("4. Modify the details of a specific product");
      System.out.println("5. Update the inventory for a specific product");
      System.out.println("6. Exit");
      System.out.print("Please choose an option from the above menu: ");
      int choice = sc.nextInt();
      int pid;
      switch (choice) {
        case 1:
          printAllProducts(products);
          break;
        case 2:
          System.out.print("Enter the product id : ");
          pid = sc.nextInt();
          findCount(products, pid);
          break;
        case 3:
          System.out.print("Enter the product id : ");
          pid = sc.nextInt();
          viewSpecifications(products, pid);
          break;
        case 4:
          System.out.print("Enter the product id : ");
          pid = sc.nextInt();
          editSpecifications(products, pid);
          break;
        case 5:
          System.out.print("Enter the product id : ");
          pid = sc.nextInt();
          updateInventory(products, pid);
          break;
        case 6:
          System.out.println("Thank you for visiting SmartPoint!");
          System.exit(1);

      }
      sc.nextLine();
      System.out.print("Enter Y to return to the main menu or N to Exit: : ");
      ans = sc.nextLine();
    } while (ans.equalsIgnoreCase("Y"));

    System.out.println("Thank you for visiting SmartPoint!");
  }
}
