/*******************
 * v1.0
 * 20203-08-28
 *******************/

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

        System.out.println("수식을 입력해주세요:(예 > 1 + 2): ");

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

        System.out.println("결과는 " + result + "입니다.");
    }

    public static int add(int numberA, int numberB){
        return numberA+numberB;
    }
    public static int sub(int numberA, int numberB){
        return numberA-numberB;
    }
    public static int multi(int numberA, int numberB){
        return numberA*numberB;
    }
    public static int div(int numberA, int numberB){
        return numberA/numberB;
    }

}