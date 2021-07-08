package com.company;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    ;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscrimnant(double a, double b, double c) {
        return this.b * this.b - 4 * this.a * this.c;

    }

    public double getRoot1(double a, double b, double Delta) {
        return (-b + Math.pow(Delta, 0.5)) / (2 * a);
    }

    public double getRoot2(double a, double b, double Delta) {
        return (-b - Math.pow(Delta, 0.5)) / (2 * a);
    }
}
