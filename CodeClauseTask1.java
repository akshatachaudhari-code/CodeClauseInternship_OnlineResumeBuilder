import java.util.Scanner;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Online Resume Builder!");
        System.out.println("Please enter your personal information:");

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Address: ");
        String address = scanner.nextLine();

        System.out.println("
Please enter your educational background:");

        System.out.print("Degree: ");
        String degree = scanner.nextLine();

        System.out.print("University: ");
        String university = scanner.nextLine();

        System.out.print("Year of Graduation: ");
        int graduationYear = scanner.nextInt();
        scanner.nextLine();

        System.out.println("
Please enter your work experience:");

        System.out.print("Company: ");
        String company = scanner.nextLine();

        System.out.print("Position: ");
        String position = scanner.nextLine();

        System.out.print("Start Date: ");
        String startDate = scanner.nextLine();

        System.out.print("End Date: ");
        String endDate = scanner.nextLine();

        System.out.println("
Generating Resume...
");

        System.out.println("--------------------------------------------------");
        System.out.println("                    RESUME                        ");
        System.out.println("--------------------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("
Education:");
        System.out.println("Degree: " + degree);
        System.out.println("University: " + university);
        System.out.println("Year of Graduation: " + graduationYear);
        System.out.println("
Work Experience:");
        System.out.println("Company: " + company);
        System.out.println("Position: " + position);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + endDate);
        System.out.println("--------------------------------------------------");

        scanner.close();
    }
}
