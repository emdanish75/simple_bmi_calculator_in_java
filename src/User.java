import java.util.Scanner;

public class User {

        String name;
        int age;
        float height;
        float weight;
        float bmi;

        public float bmi(float height, float weight) {
                float bmiValue = weight / (height * height) * 10000;
                return (float) (Math.round(bmiValue * 10.0) / 10.0);
        }


        public void userInfo () {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your name: ");
                name = scanner.nextLine();

                System.out.print("Enter your age: ");
                age = scanner.nextInt();

                System.out.print("Enter your height in centimeters: ");
                height = scanner.nextFloat();

                System.out.print("Enter your weight in kilograms: ");
                weight = scanner.nextFloat();

                bmi = bmi(height, weight);
                System.out.println("Your BMI is: " + bmi);

                continuation();
        }

        public void continuation() {

                Scanner scanner = new Scanner(System.in);
                String user_input;

                while (true) {

                        System.out.print("Do you want to calculate again? (y/n) ");
                        user_input = scanner.nextLine();

                        if (user_input.equals("y") || user_input.equals("Y")) {
                                userInfo();
                        } else if (user_input.equals("n") || user_input.equals("N")) {
                                System.out.print("\nProgram ended. Thanks for using the BMI calculator.");
                                break;
                        } else {
                                System.out.println("\nInvalid input. Please make sure you are not using any character other than 'y' or 'n'.");
                                break;
                        }
                }
        }
}
