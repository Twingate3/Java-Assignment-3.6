public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        // Input weight, height in feet, and inches
        System.out.println("Enter weight in pounds: "); // Example: 140
        double weight = Double.parseDouble(System.console().readLine());

        System.out.println("Enter feet: "); // Example: 5
        int feet = Integer.parseInt(System.console().readLine());

        System.out.println("Enter inches: "); // Example: 10
        int inches = Integer.parseInt(System.console().readLine());

        // Convert height to meters and weight to kilograms
        double heightInMeters = ((feet * 12) + inches) * 0.0254; // Example height: 5 feet 10 inches = 1.778 meters
        double weightInKilograms = weight * 0.45359237; // Example weight: 140 pounds = 63.503 kilograms

        // Calculate BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters); // Example BMI = 63.503 / (1.778^2) = 20.09

        // Output BMI and category
        System.out.println("BMI is " + bmi); // Example output: BMI is 20.087702275404553
        System.out.println(
            bmi < 18.5 ? "Underweight" :
            bmi < 25 ? "Normal" :
            bmi < 30 ? "Overweight" : "Obese"
        ); // Example output: Normal
    }
}
