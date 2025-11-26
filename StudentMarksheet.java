//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String student_name1;
        String student_name2;
        String student_name3;
        String student_name4;
        String student_name5;

        String student_registration_number1;
        String student_registration_number2;
        String student_registration_number3;
        String student_registration_number4;
        String student_registration_number5;

        int ccs_2206_1, ccs_2206_2, ccs_2206_3, ccs_2206_4, ccs_2206_5;
        int ccs_2207_1, ccs_2207_2, ccs_2207_3, ccs_2207_4, ccs_2207_5;
        int ccs_2208_1, ccs_2208_2, ccs_2208_3, ccs_2208_4, ccs_2208_5;
        int ccs_2209_1, ccs_2209_2, ccs_2209_3, ccs_2209_4, ccs_2209_5;
        int ccs_2210_1, ccs_2210_2, ccs_2210_3, ccs_2210_4, ccs_2210_5;
        int ccs_2211_1, ccs_2211_2, ccs_2211_3, ccs_2211_4, ccs_2211_5;
        int ccs_2212_1, ccs_2212_2, ccs_2212_3, ccs_2212_4, ccs_2212_5;

        // Student 1 Input
        System.out.print("Enter Student Name: ");
        student_name1 = sc.nextLine();
        System.out.print("Enter Student Registration Number: ");
        student_registration_number1 = sc.nextLine();
        System.out.print("Enter CCS 2206 Score: ");
        ccs_2206_1 = sc.nextInt();
        System.out.print("Enter CCS 2207 Score: ");
        ccs_2207_1 = sc.nextInt();
        System.out.print("Enter CCS 2208 Score: ");
        ccs_2208_1 = sc.nextInt();
        System.out.print("Enter CCS 2209 Score: ");
        ccs_2209_1 = sc.nextInt();
        System.out.print("Enter CCS 2210 Score: ");
        ccs_2210_1 = sc.nextInt();
        System.out.print("Enter CCS 2211 Score: ");
        ccs_2211_1 = sc.nextInt();
        System.out.print("Enter CCS 2212 Score: ");
        ccs_2212_1 = sc.nextInt();
        sc.nextLine();

        // Student 2 Input
        System.out.print("Enter Student Name: ");
        student_name2 = sc.nextLine();
        System.out.print("Enter Student Registration Number: ");
        student_registration_number2 = sc.nextLine();
        System.out.print("Enter CCS 2206 Score: ");
        ccs_2206_2 = sc.nextInt();
        System.out.print("Enter CCS 2207 Score: ");
        ccs_2207_2 = sc.nextInt();
        System.out.print("Enter CCS 2208 Score: ");
        ccs_2208_2 = sc.nextInt();
        System.out.print("Enter CCS 2209 Score: ");
        ccs_2209_2 = sc.nextInt();
        System.out.print("Enter CCS 2210 Score: ");
        ccs_2210_2 = sc.nextInt();
        System.out.print("Enter CCS 2211 Score: ");
        ccs_2211_2 = sc.nextInt();
        System.out.print("Enter CCS 2212 Score: ");
        ccs_2212_2 = sc.nextInt();
        sc.nextLine();

        // Student 3 Input
        System.out.print("Enter Student Name: ");
        student_name3 = sc.nextLine();
        System.out.print("Enter Student Registration Number: ");
        student_registration_number3 = sc.nextLine();
        System.out.print("Enter CCS 2206 Score: ");
        ccs_2206_3 = sc.nextInt();
        System.out.print("Enter CCS 2207 Score: ");
        ccs_2207_3 = sc.nextInt();
        System.out.print("Enter CCS 2208 Score: ");
        ccs_2208_3 = sc.nextInt();
        System.out.print("Enter CCS 2209 Score: ");
        ccs_2209_3 = sc.nextInt();
        System.out.print("Enter CCS 2210 Score: ");
        ccs_2210_3 = sc.nextInt();
        System.out.print("Enter CCS 2211 Score: ");
        ccs_2211_3 = sc.nextInt();
        System.out.print("Enter CCS 2212 Score: ");
        ccs_2212_3 = sc.nextInt();
        sc.nextLine();

        // Student 4 Input
        System.out.print("Enter Student Name: ");
        student_name4 = sc.nextLine();
        System.out.print("Enter Student Registration Number: ");
        student_registration_number4 = sc.nextLine();
        System.out.print("Enter CCS 2206 Score: ");
        ccs_2206_4 = sc.nextInt();
        System.out.print("Enter CCS 2207 Score: ");
        ccs_2207_4 = sc.nextInt();
        System.out.print("Enter CCS 2208 Score: ");
        ccs_2208_4 = sc.nextInt();
        System.out.print("Enter CCS 2209 Score: ");
        ccs_2209_4 = sc.nextInt();
        System.out.print("Enter CCS 2210 Score: ");
        ccs_2210_4 = sc.nextInt();
        System.out.print("Enter CCS 2211 Score: ");
        ccs_2211_4 = sc.nextInt();
        System.out.print("Enter CCS 2212 Score: ");
        ccs_2212_4 = sc.nextInt();
        sc.nextLine();

        // Student 5 Input
        System.out.print("Enter Student Name: ");
        student_name5 = sc.nextLine();
        System.out.print("Enter Student Registration Number: ");
        student_registration_number5 = sc.nextLine();
        System.out.print("Enter CCS 2206 Score: ");
        ccs_2206_5 = sc.nextInt();
        System.out.print("Enter CCS 2207 Score: ");
        ccs_2207_5 = sc.nextInt();
        System.out.print("Enter CCS 2208 Score: ");
        ccs_2208_5 = sc.nextInt();
        System.out.print("Enter CCS 2209 Score: ");
        ccs_2209_5 = sc.nextInt();
        System.out.print("Enter CCS 2210 Score: ");
        ccs_2210_5 = sc.nextInt();
        System.out.print("Enter CCS 2211 Score: ");
        ccs_2211_5 = sc.nextInt();
        System.out.print("Enter CCS 2212 Score: ");
        ccs_2212_5 = sc.nextInt();

        // Calculate Totals
        double Total1 = ccs_2206_1 + ccs_2207_1 + ccs_2208_1 + ccs_2209_1 + ccs_2210_1 + ccs_2211_1 + ccs_2212_1;
        double Total2 = ccs_2206_2 + ccs_2207_2 + ccs_2208_2 + ccs_2209_2 + ccs_2210_2 + ccs_2211_2 + ccs_2212_2;
        double Total3 = ccs_2206_3 + ccs_2207_3 + ccs_2208_3 + ccs_2209_3 + ccs_2210_3 + ccs_2211_3 + ccs_2212_3;
        double Total4 = ccs_2206_4 + ccs_2207_4 + ccs_2208_4 + ccs_2209_4 + ccs_2210_4 + ccs_2211_4 + ccs_2212_4;
        double Total5 = ccs_2206_5 + ccs_2207_5 + ccs_2208_5 + ccs_2209_5 + ccs_2210_5 + ccs_2211_5 + ccs_2212_5;

        // Calculate Averages
        double Average1 = Total1 / 7;
        double Average2 = Total2 / 7;
        double Average3 = Total3 / 7;
        double Average4 = Total4 / 7;
        double Average5 = Total5 / 7;

        // Display Results
        System.out.println("\n          Dedan Kimathi University of Technology          ");
        System.out.println("            School of Computer Science and IT          ");
        System.out.println("              Department of Computer Science           ");
        System.out.println("           STUDENT MARKSHEET(SECOND YEAR RESULTS)          ");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-15s %-20s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "Reg No.", "Full Name", "CS2206", "CS2207", "CS2208", "CS2209", "CS2210", "CS2211", "IGS2212", "TOTALS", "AVERAGE", "STATUS", "GRADE");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-15s %-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10s %-10s%n",
                student_registration_number1, student_name1, ccs_2206_1, ccs_2207_1, ccs_2208_1, ccs_2209_1, ccs_2210_1, ccs_2211_1, ccs_2212_1, Total1, Average1, "", "");

        System.out.printf("%-15s %-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10s %-10s%n",
                student_registration_number2, student_name2, ccs_2206_2, ccs_2207_2, ccs_2208_2, ccs_2209_2, ccs_2210_2, ccs_2211_2, ccs_2212_2, Total2, Average2, "", "");

        System.out.printf("%-15s %-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10s %-10s%n",
                student_registration_number3, student_name3, ccs_2206_3, ccs_2207_3, ccs_2208_3, ccs_2209_3, ccs_2210_3, ccs_2211_3, ccs_2212_3, Total3, Average3, "", "");

        System.out.printf("%-15s %-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10s %-10s%n",
                student_registration_number4, student_name4, ccs_2206_4, ccs_2207_4, ccs_2208_4, ccs_2209_4, ccs_2210_4, ccs_2211_4, ccs_2212_4, Total4, Average4, "", "");

        System.out.printf("%-15s %-20s %-10d %-10d %-10d %-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10s %-10s%n",
                student_registration_number5, student_name5, ccs_2206_5, ccs_2207_5, ccs_2208_5, ccs_2209_5, ccs_2210_5, ccs_2211_5, ccs_2212_5, Total5, Average5, "", "");

        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        sc.close();
    }
}