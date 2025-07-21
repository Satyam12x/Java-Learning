public class SwitchPractice {
    public static void main(String[] args) {
        // 1. Print day of week from number (1-7):
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // 2. Check vowel or consonant using switch:
        char ch = 'e';
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

        // 3. Check if entered character is operator, alphabet, digit, or special
        // symbol:
        char c = '*';
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '%':
                System.out.println("Operator");
                break;
            default:
                if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                    System.out.println("Alphabet");
                else if (c >= '0' && c <= '9')
                    System.out.println("Digit");
                else
                    System.out.println("Special Character");
        }

    }

}

/*
# HomeWork Questions:
1. Switch to calculate electricity bill based on unit slabs.

2. Switch to assign letter grade based on numeric score.

3. Switch-based grading with GPA scale.

4. Currency converter using switch (INR to USD, EUR, etc.).

5. Switch program to simulate basic banking operations (withdraw, deposit, check balance).
*/
