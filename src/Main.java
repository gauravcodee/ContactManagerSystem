import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContactManager manager = new ContactManager();

        while (true){
            System.out.println("\n1 Add Contact");
            System.out.println("2 View Contact");
            System.out.println("3 Search Contact");
            System.out.println("4 Delete Contact");
            System.out.println("5 Exit");
            System.out.print("Choose: ");

            int choice;
            try{
                choice = scanner.nextInt();
                scanner.nextLine();
            }catch (Exception e){
                System.out.println("Invalid input. Enter number only");
                scanner.nextLine();
                continue;

            }

            switch (choice){
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    manager.addContact(name,phone,email);
                    break;
                case 2:
                    System.out.println("--------------------");
                    manager.viewContact();
                    System.out.println("--------------------");
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    manager.searchContact(scanner.nextLine());
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    manager.deleteContact(scanner.nextLine());
                    break;

                case 5:
                    System.out.println("Exit.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. ");
            }
        }



    }

}
