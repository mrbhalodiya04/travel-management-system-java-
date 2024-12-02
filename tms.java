import java.util.Scanner;

public class TAMS {

    // Static scanner object to read user input
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int userChoice;

        // Loop until user chooses to exit
        do {
            // Display the main menu
            System.out.println("-------------------------------------------------");
            System.out.println("----*/Welcome To The Khodiyar Travel Agency/*----");
            System.out.println("-------------------------------------------------");
            System.out.println("1 - Show the national tour packages.");
            System.out.println("2 - Show the international tour packages.");
            System.out.println("3 - Exit the program.");
            System.out.println("-------------------------------------------------");

            System.out.print("Enter the number regarding this choice: ");

            // Continuously prompt the user until they enter a valid integer
            while (!sc.hasNextInt()) {
                // Inform the user that their input is invalid
                System.out.println("Please enter a valid number.");
                // Discard the invalid input and move to the next token
                sc.next();
            }

            userChoice = sc.nextInt();

            // Switch based on user's choice
            switch (userChoice) {
                case 1:
                    // Show national tour packages
                    showNationalPackages();
                    break;
                case 2:
                    // Show international tour packages
                    showInternationalPackages();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Please enter a valid choice.");
            }
        } while (userChoice != 3);

        // Close the scanner
        sc.close();
    }

    // Method to show national packages menu
    private static void showNationalPackages() {
        int packChoice;

        // Display national tour packages
        System.out.println("-------------------------------------------------");
        System.out.println("1 - Golden Packages.");
        System.out.println("2 - Platinum Packages.");
        System.out.println("-------------------------------------------------");

        System.out.print("Enter the choice: ");
        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            sc.next();
        }
        packChoice = sc.nextInt();

        // Switch based on user's package choice
        switch (packChoice) {
            case 1:
                // Show Golden package details
                showGoldenPackage();
                break;
            case 2:
                // Show Platinum package details
                showPlatinumPackage();
                break;
            default:
                System.out.println("Please enter a valid choice.");
        }
    }

    // Method to show details and options for Golden package
    private static void showGoldenPackage() {
        String showPackage;

        // Display Golden package details
        System.out.println("-------------------------------------------------");
        System.out.println("Details of Golden Packages.");
        System.out.println("-------------------------------------------------");
        System.out.println("1 - Stay in 3/4 days and 2/3 nights.");
        System.out.println("2 - Hotels & Restaurant.");
        System.out.println("3 - Transportation.");
        System.out.println("-------------------------------------------------");

        System.out.print("Enter 'Y' / 'y' to show the packages: ");
        showPackage = sc.next();

        if (showPackage.equalsIgnoreCase("Y")) {
            // Display Golden package options
            System.out.println("-------------------------------------------------");
            System.out.println("1 -> Dwarka : 4400");
            System.out.println("2 -> Rajasthan : 6000");
            System.out.println("3 -> Mathura : 7500");
            System.out.println("4 -> Agra : 10800");
            System.out.println("5 -> Jaipur : 9000");
            System.out.println("6 -> Delhi : 10000");
            System.out.println("7 -> Mumbai : 6680");
            System.out.println("8 -> Pune : 5000");
            System.out.println("9 -> chennai : 10000");
            System.out.println("10 -> Kerala : 8000");
            System.out.println("-------------------------------------------------");

            System.out.print("Enter the place you want to visit: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
            }
            int place = sc.nextInt();

            // Switch based on user's place choice
            switch (place) {
                case 1:
                    showBill("Dwarka", 4400);
                    break;
                case 2:
                    showBill("Rajasthan", 6000);
                    break;
                case 3:
                    showBill("Mathura", 7500);
                    break;
                case 4:
                    showBill("Agra", 10800);
                    break;
                case 5:
                    showBill("Jaipur", 9000);
                    break;
                case 6:
                    showBill("Delhi", 10000);
                    break;
                case 7:
                    showBill("Mumbai", 6680);
                    break;
                case 8:
                    showBill("Pune", 5000);
                    break;
                case 9:
                    showBill("chennai", 10000);
                    break;
                case 10:
                    showBill("Kerala", 8000);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    // Method to show details and options for Platinum package
    private static void showPlatinumPackage() {
        String showPackage;

        // Display Platinum package details
        System.out.println("-------------------------------------------------");
        System.out.println("Details of Platinum Packages.");
        System.out.println("-------------------------------------------------");
        System.out.println("1 - Stay in 6/7 days and 5/6 nights.");
        System.out.println("2 - Hotels & Restaurant.");
        System.out.println("3 - Transportation.");
        System.out.println("4 - Including food.");
        System.out.println("-------------------------------------------------");

        System.out.print("Enter 'Y' / 'y' to show the packages: ");
        showPackage = sc.next();

        if (showPackage.equalsIgnoreCase("Y")) {
            // Display Platinum package options
            System.out.println("-------------------------------------------------");
            System.out.println("1 -> Goa : 12000");
            System.out.println("2 -> Kerala : 15000");
            System.out.println("3 -> Kashmir : 20000");
            System.out.println("4 -> Sikkim : 25000");
            System.out.println("5 -> Darjeeling : 30000");
            System.out.println("6 -> Ladakh : 35000");
            System.out.println("7 -> Manali : 40000");
            System.out.println("8 -> Shimla : 45000");
            System.out.println("9 -> Ooty : 50000");
            System.out.println("10 -> Munnar : 55000");
            System.out.println("-------------------------------------------------");

            System.out.print("Enter the place you want to visit: ");

            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                sc.next();
            }
            int place = sc.nextInt();

            // Switch based on user's place choice
            switch (place) {
                case 1:
                    showBill("Goa", 12000);
                    break;
                case 2:
                    showBill("Kerala", 15000);
                    break;
                case 3:
                    showBill("Kashmir", 20000);
                    break;
                case 4:
                    showBill("Sikkim", 25000);
                    break;
                case 5:
                    showBill("Darjeeling", 30000);
                    break;
                case 6:
                    showBill("Ladakh", 35000);
                    break;
                case 7:
                    showBill("Manali", 40000);
                    break;
                case 8:
                    showBill("Shimla", 45000);
                    break;
                case 9:
                    showBill("Ooty", 50000);
                    break;
                case 10:
                    showBill("Munnar", 55000);
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    // Method to show international packages menu and handle user selection
    private static void showInternationalPackages() {
        System.out.println("-------------------------------------------------");
        System.out.println("1 - London : 100000");
        System.out.println("2 - Paris : 120000");
        System.out.println("3 - Singapore : 150000");
        System.out.println("4 - Switzerland : 180000");
        System.out.println("5 - Dubai : 200000");
        System.out.println("6 - New York : 250000");
        System.out.println("7 - Sydney : 300000");
        System.out.println("8 - Tokyo : 350000");
        System.out.println("9 - Hong Kong : 400000");
        System.out.println("10 - Bangkok : 450000");
        System.out.println("-------------------------------------------------");

        System.out.print("Enter the place you want to visit: ");

        while (!sc.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            sc.next();
        }
        int place = sc.nextInt();

        // Switch based on user's place choice
        switch (place) {
            case 1:
                showBill("London", 100000);
                break;
            case 2:
                showBill("Paris", 120000);
                break;
            case 3:
                showBill("Singapore", 150000);
                break;
            case 4:
                showBill("Switzerland", 180000);
                break;
            case 5:
                showBill("Dubai", 200000);
                break;
            case 6:
                showBill("New York", 250000);
                break;
            case 7:
                showBill("Sydney", 300000);
                break;
            case 8:
                showBill("Tokyo", 350000);
                break;
            case 9:
                showBill("Hong Kong", 400000);
                break;
            case 10:
                showBill("Bangkok", 450000);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    // Method to show bill details for a selected package
    private static void showBill(String placeName, int costPerPerson) {
        System.out.println("-------------------------------------------------");
        System.out.print("Enter how many persons are coming: ");

        int persons = sc.nextInt();
        sc.nextLine(); // Consume the newline

        // Collect and display details for each person
        for (int i = 1; i <= persons; i++) {
            System.out.println("-------------------------------------------------");
            System.out.print("Enter your name: ");
            String name = sc.nextLine();

            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume the newline

            System.out.print("Enter your gender: ");
            String gender = sc.nextLine();

            System.out.print("Enter your address: ");
            String address = sc.nextLine();

            System.out.print("Enter your phone number: ");
            String phone = sc.nextLine();
            System.out.println("-------------------------------------------------");

            // Display user details
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("Gender : " + gender);
            System.out.println("Address : " + address);
            System.out.println("Phone No. : " + phone);
            System.out.println("-------------------------------------------------");
        }

        // Calculate and display the total cost
        int totalCost = costPerPerson * persons;
        System.out.println("Total Person : " + persons);
        System.out.println("Package Name : " + placeName);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("-------------------------------------------------");
        System.out.println("Your Package is Booked Successfully.");
        System.out.println("-------------------------------------------------");
        System.exit(0);
    }
}
