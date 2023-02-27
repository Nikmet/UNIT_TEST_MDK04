import java.util.Scanner;

public class calculator {

    private static final Scanner sc = new Scanner(System.in);

    public static void calculate(){
        while (true){
            System.out.print("Здравствуйте, введи действие (+, -, *, /, ^): ");
            String operator = sc.next();
            System.out.print("Здравствуйте, числа через пробел: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            switch (operator) {
                case "+" -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                case "-" -> System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                case "*" -> System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                case "/" -> System.out.println(n1 + " / " + n2 + " = " + (float) (n1 / n2));
                case "^" -> System.out.println(n1 + " ^ " + n2 + " = " + (Math.pow((double)n1, (double)n2)));
                default -> System.out.println("Вы ввели не допустимое значение!");
            }
        }
    }

}
