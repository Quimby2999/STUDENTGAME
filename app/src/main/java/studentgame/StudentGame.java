/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package studentgame;

import java.util.Scanner;

public class StudentGame {
    
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        while (!student.hasJob()) {
            System.out.println("\nYour current status: ");
            System.out.printf("Knowledge level: %d\n", student.getKnowledgeLevel());
            System.out.println("Experience Level: " + student.getExperienceLevel());
            System.out.printf("Energy Level: %d\n", student.getEnergyLevel());

            System.out.println("\n What would you like to do?");
            System.out.println("1. Study");
            System.out.println("2. Practice");
            System.out.println("3. Rest");
            System.out.println("4. Apply for a Job");
            System.out.println("5. Quit Game.");
            System.out.println("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                student.study();
                if (student.getEnergyLevel() <= 0) {
                    System.out.println("You're too tired to study more. Get some rest.");
                } else {
                System.out.println("You studied hard.");
                }
                break;
                case 2:
                student.practice();
                System.out.println("You practiced some Exercism.");
                break;
                case 3:
                student.rest();
                System.out.println("You took a power nap.");
                break;
                case 4:
                student.applyForJob();
                if (student.hasJob()) {
                    System.out.println("Congratulations, you Win!!!");
                    System.exit(0);
                } else {
                    System.out.println("Sorry, you're not hired.");
                }
                break;
                case 5:
                student.quit();
                default:
                System.out.println("Invalid Choice.  Please Try Again.");
            }
        }
        scanner.close();
    }
}