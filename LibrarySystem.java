import java.util.Scanner;

class Employee {
    private String name;
    private int age;
    private String cnic;
    protected String book;
    private int username;
    private String texts;

    Employee(Scanner input, int choice) {
        this.username = choice;
        System.out.println("------------------------------------------------------------");
        System.out.println("                 DETAILS BEFORE YOU PROCEED                 ");
        System.out.println("------------------------------------------------------------");

        System.out.print("Enter Name of the Person: ");
        name = input.nextLine();

        System.out.print("Enter Age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.print("Enter CNIC: ");
        cnic = input.nextLine();

        System.out.println("------------------------------------------------------------");
        System.out.println("                 LIBRARY SYSTEM MENU                        ");
        System.out.println("------------------------------------------------------------");
        System.out.println("1. PURCHASE A BOOK");
        System.out.println("2. RENT A BOOK");
        System.out.println("3. SELL A BOOK");
        System.out.println("------------------------------------------------------------");
    }

    void display() {
        System.out.println("\n------------------------------------------------------------");
        System.out.println("                   PERSON DETAILS                           ");
        System.out.println("------------------------------------------------------------");
        System.out.println("NAME : " + name);
        System.out.println("AGE  : " + age);
        System.out.println("CNIC : " + cnic);

        if (username == 1) {
            texts = "PURCHASED";
        } else if (username == 2) {
            texts = "RENT";
        } else if (username == 3) {
            texts = "SOLD";
        } else {
            texts = "UNKNOWN";
        }
        System.out.println("PURPOSE: " + texts);
        System.out.println("------------------------------------------------------------");
    }
}

class Receipt {
    private Scanner input;

    Receipt(Scanner input) {
        this.input = input;
    }

    void checkBookAvailability(String[][] books) {
        System.out.print("Enter your book name: ");
        String book = input.nextLine();

        boolean found = false;
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books[i].length; j++) {
                if (books[i][j].equalsIgnoreCase(book)) {
                    System.out.println("The book is available");
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }

        if (!found) {
            System.out.println("The book is not available");
            System.out.println("");
        }
    }
}

class Purchase {
    private Scanner input;

    Purchase(Scanner input) {
        this.input = input;
    }

    void processPurchase(String[][] books) {
        System.out.println("\nBOOK PURCHASE PROCESS");
        System.out.println("------------------------------------------------------------");

        System.out.println("Available Books for Purchase:");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < books.length; i++) {
            System.out.printf("%-30s %-30s %-30s%n", books[i][0], books[i][1], books[i][2]);
        }
        System.out.println("------------------------------------------------------------");

        System.out.print("Enter the name of the book you want to purchase: ");
        String bookName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        input.nextLine();

        double pricePerBook = 500.0;
        double totalPrice = quantity * pricePerBook;

        System.out.println("------------------------------------------------------------");
        System.out.println("                 PURCHASE RECEIPT                           ");
        System.out.println("------------------------------------------------------------");
        System.out.printf("Book Name: %s%n", bookName);
        System.out.printf("Quantity: %d%n", quantity);
        System.out.printf("Price per book: Rs. %.2f%n", pricePerBook);
        System.out.printf("Total Amount: Rs. %.2f%n", totalPrice);
        System.out.println("------------------------------------------------------------");
        System.out.println("Thank you for your purchase!");
        System.out.println("------------------------------------------------------------");
    }
}

class Sell {
    private Scanner input;

    Sell(Scanner input) {
        this.input = input;
    }

    void processSell() {
        System.out.println("\nBOOK SELLING PROCESS");
        System.out.println("------------------------------------------------------------");

        System.out.print("Enter the name of the book you want to sell: ");
        String bookName = input.nextLine();

        System.out.print("Enter author name: ");
        String author = input.nextLine();

        System.out.print("Enter publication year: ");
        int year = input.nextInt();
        input.nextLine();

        System.out.print("Enter book condition (New/Good/Fair): ");
        String condition = input.nextLine();

        System.out.print("Enter your asking price: Rs. ");
        double price = input.nextDouble();
        input.nextLine();

        System.out.println("------------------------------------------------------------");
        System.out.println("                 SELLING RECEIPT                            ");
        System.out.println("------------------------------------------------------------");
        System.out.printf("Book Name: %s%n", bookName);
        System.out.printf("Author: %s%n", author);
        System.out.printf("Publication Year: %d%n", year);
        System.out.printf("Condition: %s%n", condition);
        System.out.printf("Asking Price: Rs. %.2f%n", price);
        System.out.println("------------------------------------------------------------");
        System.out.println("We will contact you soon for the selling process!");
        System.out.println("------------------------------------------------------------");
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║                 WELCOME TO THE LIBRARY OF FLORIDA        ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.println("HERE YOU WILL FIND THE BOOKS AVAILABLE IN OUR LIBRARY.");
        System.out.println("LET'S CHOOSE WHAT YOU WANT TO READ OR BUY!");
        System.out.println("============================================================");

        String[][] books = {
                { "Seerat un Nabi", "Islam aur Science", "History of Islam" },
                { "Al-Bidaya wal Nihaya", "Khutbat-e-Bahawalpur", "The Decline of Muslim Ummah" },
                { "Riyadh-us-Saliheen", "Tafseer Ibn Kathir", "The Crusades" },
                { "Fazail-e-Amaal", "Nahjul Balagha", "The Ottoman Empire" },
                { "Iqbal ka Shaheen", "Tareekh-e-Tabari", "World History by H.G. Wells" },
                { "Minhaj ul Abideen", "Islam at the Crossroads", "A Short History of Time" },
                { "Kitab al-Tawheed", "Islamic History by Akbar Shah Khan", "Modern World History" },
                { "Forty Hadith of Nawawi", "Life of Muhammad", "Medieval History" },
                { "Tafseer As-Sa'di", "History of Baghdad", "History of Europe" }
        };

        System.out.print("\nEnter Your Choice (1 = Purchase, 2 = Rent, 3 = Sell): ");
        int choice = input.nextInt();
        input.nextLine();

        Employee employee = new Employee(input, choice);

        System.out.print("Do you want to see the list of books? (YES/NO): ");
        String response = input.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.println("\n------------------------------------------------------------");
            System.out.println("                   AVAILABLE BOOKS                          ");
            System.out.println("------------------------------------------------------------");
            for (int i = 0; i < books.length; i++) {
                System.out.printf("%-30s %-30s %-30s%n", books[i][0], books[i][1], books[i][2]);
            }
            System.out.println("------------------------------------------------------------");
        }

        System.out.println("------------------------------------------------------------");

        if (choice == 1) {
            Purchase purchase = new Purchase(input);
            purchase.processPurchase(books);
        } else if (choice == 2) {
            Receipt receipt = new Receipt(input);
            receipt.checkBookAvailability(books);
        } else if (choice == 3) {
            Sell sell = new Sell(input);
            sell.processSell();
        } else {
            System.out.println("Invalid choice!");
        }

        System.out.println("------------------------------------------------------------");

        employee.display();
        input.close();

        System.out.println("\n╔══════════════════════════════════════════════════════════╗");
        System.out.println("║             THANK YOU FOR USING OUR LIBRARY SYSTEM!       ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}
