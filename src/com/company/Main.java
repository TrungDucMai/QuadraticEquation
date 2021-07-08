package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap gia tri a,b,c");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double Delta = quadraticEquation.getDiscrimnant(a, b, c);
        double R1 = quadraticEquation.getRoot1(a, b, Delta);
        double R2 = quadraticEquation.getRoot2(a, b, Delta);

        if (Delta < 0) {
            System.out.println("phuong trinh vo nhiem");
        } else if (Delta == 0) {
            System.out.println("phuong trinh co nghiem la : " + R1);
        } else {
            System.out.println("phuong trinh co 2 nghiem la: R1 = " + R1 + "R2 = " +R2);
        }
    }
}
