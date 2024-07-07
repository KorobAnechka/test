package src;

import java.util.Scanner;

public class Testtask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input:");
        String string = sc.nextLine();
        String[] arr = string.split(" ");
        if (arr.length != 3) {
            throw new IllegalArgumentException("не корректно введены данные: \n");
        }
        try {

            int num1 = Integer.parseInt(arr[0]);
            int num2 = Integer.parseInt(arr[2]);
            char chara = arr[1].charAt(0);

            if (num1 > 10 || num1 < 1 || num2 > 10 || num2 < 1) {
                throw new IllegalArgumentException("число должно быть не меньше 1 и не больше 10");
            }

            System.out.println("output:");
            if (chara == '+') {
                System.out.println(num1 + num2);
            } else if
            (chara == '-') {
                System.out.println(num1 - num2);
            } else if (chara == '/') {
                System.out.println(num1 / num2);
            } else if (chara == '*') {
                System.out.println(num1 * num2);
            } else {
                System.out.println("не верно введен математический оператор");
            }
        } catch (NumberFormatException e){System.out.println("введено нечисленное значение: " + e.getMessage());
        }
    }

}
