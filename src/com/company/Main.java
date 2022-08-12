package com.company;

public class Main {

    public static void main(String[] args) {

        Calculadora calculo = new Calculadora();
        calculo.captureInformations("3+6");
        try {
            System.out.println(calculo.showValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
