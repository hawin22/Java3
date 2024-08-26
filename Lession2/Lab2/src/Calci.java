/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hawin
 */
public class Calci {

    public static Double calc(String expression) {
        try {
            // input: expression = 123.4 + 567.8
            // output : result = 691.2
            char ch = ' ';
            int pos = 0; // vị trí máy tính
            for (pos = 0; pos < 10; pos++) {
                ch = expression.charAt(pos);
                if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    break;
                }
            }
            double num1 = Double.valueOf(expression.substring(0, pos));
            double num2 = Double.valueOf(expression.substring(pos + 1));
            if (ch == '+') {
                return num1 + num2;
            }
            if (ch == '-') {
                return num1 - num2;
            }
            if (ch == '*') {
                return num1 * num2;
            }
            if (ch == '/') {
                return num1 / num2;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
    public static void main(String[] args) {
        System.out.println(calc("123.4 + 567.8"));
    }
}
