/*Author: Vignesh Sudhan Valvaikar
Roll no: 54
Start Date:
Modified Date: 23/07/2024
*/

import java.util.Scanner;

public class Main {
    private static LokSabha lokSabha;
    private static RajyaSabha rajyaSabha;
    private static President president;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            do {
                System.out.println("Main Menu:");
                System.out.println("1. Lok Sabha Menu");
                System.out.println("2. Rajya Sabha Menu");
                System.out.println("3. President Menu");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> lokSabhaMenu(scanner);
                    case 2 -> rajyaSabhaMenu(scanner);
                    case 3 -> presidentMenu(scanner);
                    case 4 -> System.out.println("Exiting...");
                    default -> System.out.println("Invalid choice. Please try again.");
                }
            } while (choice != 4);
        }
    }

    private static void lokSabhaMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\nLok Sabha Menu:");
            System.out.println("1. Create Lok Sabha");
            System.out.println("2. Display Info");
            System.out.println("3. Pass Bill");
            System.out.println("4. Debate");
            System.out.println("5. Adjourn Session");
            System.out.println("6. Add Member");
            System.out.println("7. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter number of members: ");
                    int numberOfMembers = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter speaker name: ");
                    String speakerName = scanner.nextLine();
                    lokSabha = new LokSabha(numberOfMembers, speakerName);
                }
                case 2 -> {
                    if (lokSabha != null) {
                        lokSabha.displayInfo();
                    } else {
                        System.out.println("No Lok Sabha object created yet.");
                    }
                }
                case 3 -> {
                    if (lokSabha != null) {
                        System.out.print("Enter bill name: ");
                        String billName = scanner.nextLine();
                        lokSabha.passBill(billName);
                    } else {
                        System.out.println("No Lok Sabha object created yet.");
                    }
                }
                case 4 -> {
                    if (lokSabha != null) {
                        System.out.print("Enter debate topic: ");
                        String topic = scanner.nextLine();
                        lokSabha.debate(topic);
                    } else {
                        System.out.println("No Lok Sabha object created yet.");
                    }
                }
                case 5 -> {
                    if (lokSabha != null) {
                        lokSabha.adjournSession();
                    } else {
                        System.out.println("No Lok Sabha object created yet.");
                    }
                }
                case 6 -> {
                    if (lokSabha != null) {
                        System.out.print("Enter MP name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter constituency: ");
                        String constituency = scanner.nextLine();
                        System.out.print("Enter party: ");
                        String party = scanner.nextLine();
                        MP mp = new MP(name, constituency, party);
                        lokSabha.addMember(mp);
                    } else {
                        System.out.println("No Lok Sabha object created yet.");
                    }
                }
                case 7 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }

    private static void rajyaSabhaMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\nRajya Sabha Menu:");
            System.out.println("1. Create Rajya Sabha");
            System.out.println("2. Display Info");
            System.out.println("3. Pass Bill");
            System.out.println("4. Debate");
            System.out.println("5. Adjourn Session");
            System.out.println("6. Add Member");
            System.out.println("7. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter number of members: ");
                    int numberOfMembers = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter chairman name: ");
                    String chairmanName = scanner.nextLine();
                    rajyaSabha = new RajyaSabha(numberOfMembers, chairmanName);
                }
                case 2 -> {
                    if (rajyaSabha != null) {
                        rajyaSabha.displayInfo();
                    } else {
                        System.out.println("No Rajya Sabha object created yet.");
                    }
                }
                case 3 -> {
                    if (rajyaSabha != null) {
                        System.out.print("Enter bill name: ");
                        String billName = scanner.nextLine();
                        rajyaSabha.passBill(billName);
                    } else {
                        System.out.println("No Rajya Sabha object created yet.");
                    }
                }
                case 4 -> {
                    if (rajyaSabha != null) {
                        System.out.print("Enter debate topic: ");
                        String topic = scanner.nextLine();
                        rajyaSabha.debate(topic);
                    } else {
                        System.out.println("No Rajya Sabha object created yet.");
                    }
                }
                case 5 -> {
                    if (rajyaSabha != null) {
                        rajyaSabha.adjournSession();
                    } else {
                        System.out.println("No Rajya Sabha object created yet.");
                    }
                }
                case 6 -> {
                    if (rajyaSabha != null) {
                        System.out.print("Enter MP name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter constituency: ");
                        String constituency = scanner.nextLine();
                        System.out.print("Enter party: ");
                        String party = scanner.nextLine();
                        MP mp = new MP(name, constituency, party);
                        rajyaSabha.addMember(mp);
                    } else {
                        System.out.println("No Rajya Sabha object created yet.");
                    }
                }
                case 7 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }

    private static void presidentMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("\nPresident Menu:");
            System.out.println("1. Create President");
            System.out.println("2. Display Info");
            System.out.println("3. Appoint Prime Minister");
            System.out.println("4. Sign Bill into Law");
            System.out.println("5. Declare Emergency");
            System.out.println("6. Address Nation");
            System.out.println("7. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter president name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter term start: ");
                    String termStart = scanner.nextLine();
                    System.out.print("Enter term length (years): ");
                    int termLength = scanner.nextInt();
                    president = new President(name, termStart, termLength);
                }
                case 2 -> {
                    if (president != null) {
                        president.displayInfo();
                    } else {
                        System.out.println("No president object created yet.");
                    }
                }
                case 3 -> {
                    if (president != null) {
                        System.out.print("Enter Prime Minister name: ");
                        String pmName = scanner.nextLine();
                        president.appointPrimeMinister(pmName);
                    } else {
                        System.out.println("No president object created yet.");
                    }
                }
                case 4 -> {
                    if (president != null) {
                        System.out.print("Enter bill name: ");
                        String billName = scanner.nextLine();
                        president.signBill(billName);
                    } else {
                        System.out.println("No president object created yet.");
                    }
                }
                case 5 -> {
                    if (president != null) {
                        president.declareEmergency();
                    } else {
                        System.out.println("No president object created yet.");
                    }
                }
                case 6 -> {
                    if (president != null) {
                        System.out.print("Enter message: ");
                        String message = scanner.nextLine();
                        president.addressNation(message);
                    } else {
                        System.out.println("No president object created yet.");
                    }
                }
                case 7 -> System.out.println("Returning to Main Menu...");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
    }
}
