package NHN.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numberA,numberB;
        String operator;
        int result = 0;

        System.out.println("Please enter a expression: ");
        numberA = Integer.parseInt(br.readLine());
        operator = br.readLine();
        numberB = Integer.parseInt(br.readLine());

        switch(operator) {
            case "+":
                result = add(numberA, numberB);
                break;
            case "-":
                result = sub(numberA, numberB);
                break;
            case "*":
                result = multi(numberA, numberB);
                break;
            case "/":
                result = div(numberA, numberB);
                break;
            
        }

        System.out.println("result is " + result + ".");
    }

    public static int add(int numberA, int numberB){
        return numberA+numberB;
    }
    public static int sub(int a, int b){
        return numberA-numberA;
    }
    public static int multi(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }

}