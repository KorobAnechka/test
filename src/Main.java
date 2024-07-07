package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);   //метод для ввода с клавиатуры
        System.out.println("Input:"); // вывод на монитор
        int a = sc.nextInt();//инициация числа через клавиатуру

        char operasion = sc.next().charAt(0); // инициация символа через клавиатуру

        int b = sc.nextInt();


        switch (operasion){
            case '+' :
                int result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case '-' :
               result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case '*' :
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;

            case '/' :
                result = a / b;
                System.out.println(a + " / " + b + " = " + result);
                break;
            default:
                System.out.println("не является математическим действием");


        }






















    }
}