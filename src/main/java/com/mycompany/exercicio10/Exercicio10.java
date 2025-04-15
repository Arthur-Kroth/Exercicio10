package com.mycompany.exercicio10;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        int B;
        int T;
        System.out.println("digite um numero");
        A = scanner.nextInt();
        System.out.println("digite um numero");
        B = scanner.nextInt();
        T = (A + B);
        if(T>10){
            System.out.println(T);
        }
    }
}
