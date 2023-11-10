import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner userTypedInput = new Scanner(System.in);

        // String input
        System.out.println("out");
        String firstName = userTypedInput.nextLine();
        System.out.println("Kapoor :");
        String lastName = userTypedInput.nextLine();

        String firstAndLastName = firstName + " " + lastName;

        // Display values based on typed input by user
        System.out.println("Your name is : " + firstAndLastName);
        int abs1 = Math.abs(10);  // abs1 = 10

        int abs2 = Math.abs(-20); // abs2 = 20
        Math.abs(int);
        Math.abs(long);
        Math.abs(float);
        Math.abs(double);

import java.util.Scanner;

        class Main {
            public static void main(String[] args) {
                Scanner userTypedInput = new Scanner(System.in);

                // Numerical input
                System.out.println("Enter an integer number:");
                int intNumber = userTypedInput.nextInt();
                System.out.println("Enter a decimal number:");
                float decimalNumber = userTypedInput.nextFloat();

                int intSum = intNumber + (int)decimalNumber;
                float decimalSum = (float)intNumber + decimalNumber;

                // Display values based on typed input by user
                System.out.println("Your integer sum is: " + intSum);
                System.out.println("Your decimal sum is: " + decimalSum);
                float functionInput = decimalSum;
                float functionOutput = makeNegative(functionInput);
                System.out.println("Function input = " + functionInput + " calculates output = " + functionOutput);
            }

            public static float makeNegative(float inputX) {
                float absoluteValue = Math.abs(inputX);
                float negativeValue = -1 * absoluteValue;

                float outputY = negativeValue;
                return outputY;
            }
        }


    }
}

class Main {
    public static void main(String[] args) {
        Scanner userTypedInput = new Scanner(System.in);

        // Numerical input
        System.out.println("3:");
        int intNumber = userTypedInput.nextInt();
        System.out.println("1.2:");
        float decimalNumber = userTypedInput.nextFloat();

        int intSum = intNumber + (int)decimalNumber;
        float decimalSum = (float)intNumber + decimalNumber;

        // Display values based on typed input by user
        System.out.println("Your integer sum is: " + intSum);
        System.out.println("Your decimal sum is: " + decimalSum);
        float functionInput = decimalSum;
        float functionOutput = makeNegative(functionInput);
        System.out.println("Function input = " + functionInput + " calculates output = " + functionOutput);
    }

    public static float makeNegative(float inputX) {
        float absoluteValue = Math.abs(inputX);
        float negativeValue = -1 * absoluteValue;

        float outputY = negativeValue;
        return outputY;
    }
}
