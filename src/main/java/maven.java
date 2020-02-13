import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class maven {
    public static void main(String[] args) {
        System.out.println("Enter something: ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("You entered: " + "\"" + option + "\"");
        System.out.println("Is " + "\"" + option + "\"" + " a number? " + isNumeric(option));
        System.out.println("Flipped Case: " + swapCase(option));
        System.out.println("Reversed: " + reverse(option));
    }

    public static boolean isNumeric(String option) {
       return StringUtils.isNumeric(option);
    }

    public static String swapCase(String option) {
        return StringUtils.swapCase(option);
    }

    public static String reverse(String option) {
        return StringUtils.reverse(option);
    }

}
