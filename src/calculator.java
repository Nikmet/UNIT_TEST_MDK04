import java.util.Scanner;

public class calculator {

    public static float calculate(char operator, int n1, int n2) {
        switch (operator) {
            case '+' -> {
                return (float) (n1 + n2);
            }
            case '-' -> {
                return (float) (n1 - n2);
            }
            case '*' -> {
                return (float) (n1 * n2);
            }
            case '/' -> {
                return (float) (n1 / n2);
            }
            case '^' -> {
                return (float) Math.pow((float) n1, (float) n2);
            }
            default -> System.out.println("Вы ввели не допустимое значение!");

        }
        return 0;
    }

}
