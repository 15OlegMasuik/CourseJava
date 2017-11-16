package com.gmail.olegmasiuk;

/**
 * Created by Marta on 16.11.2017.
 */
public class Triagle {
    private double a; //a,b,c -сторони трикутника
    private double b;
    private double c;
    private double p;
    private double s;


    public Triagle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;


    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public void setC(double c) {
        this.c = c;
    }


    public void area() {
        p = (a + b + c) /2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Triagle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", p=" + p +
                ", s=" + s +
                '}';
    }
}
