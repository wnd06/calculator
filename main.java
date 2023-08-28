package NHN.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a,b;
        String operator;
        int c = 0;

        System.out.println("Please enter a expression");
        a = Integer.parseInt(br.readLine());
        operator = br.readLine();
        b = Integer.parseInt(br.readLine());

        switch(operator) {
            case "+":
                c = add(a, b);
                break;
            case "-":
                c = sub(a, b);
                break;
            case "*":
                c = multi(a, b);
                break;
            case "/":
                c = div(a, b);
                break;
            
        }

        System.out.println("result is " + c + ".");
    }
    
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int multi(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }

}