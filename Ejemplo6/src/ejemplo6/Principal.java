package ejemplo6;

import java.util.Scanner;

/**
 * División de dos números
 * @author bbrenes84
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, division;
        System.out.println("Dime el primer número ");
        num1= sc.nextInt();
        System.out.println("Dime el segundo número ");
        num2= sc.nextInt();
        division= num1 / num2;
        System.out.println("El resultado de la división es " + division);        
    }
    
}
