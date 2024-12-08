import java.util.Scanner; // Import the Scanner class for user input

public class trying{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        // Display options to the user
        System.out.println("*********************************************");
        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("*********************************************");

        // Validates the user's input to ensure user chooses one or two
        while (true) {
            System.out.println("*********************************************");
            System.out.println("*********************************************");
            System.out.print("Enter your choice (1 or 2): ");
            choice = input.next();
            if ("1".equals(choice) || "2".equals(choice)) {
                break; // Exit loop if valid input
            
            
            }
            System.out.println("*********************************************");
            System.out.println("*********************************************");
            System.out.println("*********************************************");
            System.out.println("Invalid input. Please enter 1 or 2.");
        }

        // This actually performs the conversion of the input temperature
        if ("1".equals(choice)) {
            // Convert Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double temperature = input.nextDouble();
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("*********************************************");
            System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n", temperature, fahrenheit);
            System.out.println("*********************************************");       
        } else {
            // Convert Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double temperature = input.nextDouble();
            double celsius = (temperature - 32) * 5 / 9;

            System.out.println("*********************************************");
            System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n", temperature, celsius);
            System.out.println("*********************************************");   
        }

        input.close(); // Close the scanner to free up resources
    }
}




