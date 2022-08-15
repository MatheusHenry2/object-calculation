package com.company;

public class Main {

    public static void main(String[] args) {

        Calculadora calculo = new Calculadora();
        try {
            calculo.captureInformations("33 * 632");
            System.out.println(calculo.showValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
