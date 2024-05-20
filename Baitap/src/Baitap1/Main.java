package Baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { choice();}


    public static void choice() {
        Scanner sc = new Scanner(System.in);
        InfoController infoo = new InfoController();
        infoo.createInfo();
        while (true) {
            System.out.println("Enter your selection");
            System.out.println("1. Create Post");
            System.out.println("2. Show Post");
            System.out.println("3. Search Post");
            System.out.println("4. Delete Post");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    infoo.createInfo();
                    break;
                case 2:
                    infoo.showInfo();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

