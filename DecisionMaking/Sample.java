public class Sample {

    public static void main(String[] args) {

        // =====================================================
        // JAVA PRIMITIVE DATA TYPES
        // =====================================================

        byte age = 20;                    // Stores whole numbers (-128 to 127).
        short year = 2025;                // Stores larger whole numbers
        int marks = 95;                   // Most commonly used integer type
        long population = 8000000000L;    // 'L' indicates long value

        float price = 99.99f;             // 'f' indicates float value
        double pi = 3.14159;              // Default type for decimal numbers

        char grade = 'A';                 // Stores a single character
        boolean isPassed = true;          // Stores true or false

        System.out.println("Age (byte)           : " + age);
        System.out.println("Current Year (short) : " + year);
        System.out.println("Student Marks (int)  : " + marks);
        System.out.println("Population (long)    : " + population);
        System.out.println("Product Price (float): " + price);
        System.out.println("Value of PI (double) : " + pi);
        System.out.println("Student Grade (char) : " + grade);
        System.out.println("Exam Result(boolean) : " + isPassed);



        // =====================================================
        // IF STATEMENT
        // Executes the block only when the condition is true.
        // =====================================================

        int voterAge = 20;

        if (voterAge >= 18) {
            System.out.println("\nEligible to vote because age is 18 or above.");
        }



        // =====================================================
        // IF-ELSE STATEMENT
        // Executes one block when condition is true,
        // otherwise executes the else block.
        // =====================================================

        int studentMarks = 45;

        if (studentMarks >= 50) {
            System.out.println("Student has PASSED the examination.");
        } else {
            System.out.println("Student has FAILED the examination.");
        }



        // =====================================================
        // IF-ELSE-IF LADDER
        // Used when multiple conditions need to be checked.
        // =====================================================

        int totalMarks = 95;

        if (totalMarks >= 90) {
            System.out.println("Grade Obtained : A");
        } else if (totalMarks >= 70) {
            System.out.println("Grade Obtained : B");
        } else if (totalMarks >= 50) {
            System.out.println("Grade Obtained : C");
        } else {
            System.out.println("Result : Fail");
        }



        // =====================================================
        // NESTED IF
        // One if statement inside another if statement.
        // =====================================================

        int ageLimit = 22;
        boolean hasLicense = true;

        if (ageLimit >= 18) {

            if (hasLicense) {
                System.out.println("Person is eligible to drive.");
            } else {
                System.out.println("Driving license is required.");
            }

        } else {
            System.out.println("Person is too young to drive.");
        }



        // =====================================================
        // SWITCH CASE
        // Used instead of multiple if-else statements.
        // =====================================================

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Day 1 represents Monday.");
                break;

            case 2:
                System.out.println("Day 2 represents Tuesday.");
                break;

            case 3:
                System.out.println("Day 3 represents Wednesday.");
                break;

            case 4:
                System.out.println("Day 4 represents Thursday.");
                break;

            case 5:
                System.out.println("Day 5 represents Friday.");
                break;

            default:
                System.out.println("Invalid day number.");
        }



        // =====================================================
        // ARRAY
        // Stores multiple values of the same data type.
        // Array index starts from 0.
        // =====================================================

        int[] numbers = {10, 20, 30};



        // =====================================================
        // FOR LOOP
        // Used when the number of iterations is known.
        // =====================================================

        System.out.println("\nPrinting array elements using normal for loop:");

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("Element at index " + i + " = " + numbers[i]);

        }



        // =====================================================
        // ENHANCED FOR LOOP (FOR-EACH LOOP)
        // Used to access each element directly.
        // =====================================================

        System.out.println("\nPrinting array elements using enhanced for loop:");

        for (int value : numbers) {

            System.out.println("Array Element = " + value);

        }



        // =====================================================
        // WHILE LOOP
        // Executes as long as the condition is true.
        // =====================================================

        System.out.println("\nPrinting numbers using while loop:");

        int count = 1;

        while (count <= 5) {

            System.out.println(count);

            count++;
        }



        // =====================================================
        // DO-WHILE LOOP
        // Executes at least one time even if condition is false.
        // =====================================================

        System.out.println("\nPrinting numbers using do-while loop:");

        int num = 1;

        do {

            System.out.println(num);

            num++;

        } while (num <= 5);



        // =====================================================
        // BREAK STATEMENT
        // Immediately exits from the loop.
        // =====================================================

        System.out.println("\nUsing break statement:");

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                System.out.println("Break encountered. Loop terminated.");
                break;
            }

            System.out.println(i);
        }



        // =====================================================
        // CONTINUE STATEMENT
        // Skips only the current iteration.
        // =====================================================

        System.out.println("\nUsing continue statement:");

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                System.out.println("Skipping number 3.");
                continue;
            }

            System.out.println(i);
        }



        // =====================================================
        // STRING
        // Strings are immutable.
        // Any modification creates a new String object.
        // =====================================================

        String name = "Selva";

        System.out.println("\nOriginal String : " + name);

        // Creates a new String object.
        name = name.concat(" Priya");

        System.out.println("After concat()  : " + name);

        // Some commonly used String methods

        System.out.println("Length          : " + name.length());

        System.out.println("Uppercase       : " + name.toUpperCase());

        System.out.println("Lowercase       : " + name.toLowerCase());

        System.out.println("Contains 'Priya': " + name.contains("Priya"));

        System.out.println("Character at index 2 : " + name.charAt(2));

    }
}