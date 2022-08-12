package com.company;

public class Calculadora {

    private int valueA;
    private int valueB;
    private char op;

    public Calculadora() {

    }

    public void captureInformations(String expression) {
        /*char charValueA = expression.charAt(0);
        char charValueB = expression.charAt(2);

        this.valueA = Character.getNumericValue(charValueA);
        this.valueB = Character.getNumericValue(charValueB);
        this.op = expression.charAt(1);*/
    }

    public boolean testOperator() {
        return (this.op == '*' || this.op == '+' || this.op == '-' || this.op == '/');
    }

    public int calculate() throws Exception {

        if (!testOperator()) {
            throw new Exception("Caractere inválido para operação!");
        }

        switch (this.op) {
            case '+':
                return this.valueA + this.valueB;
            case '-':
                return this.valueA - this.valueB;
            case '*':
                return this.valueA * this.valueB;
            case '/':
                return this.valueA / this.valueB;
        }
        return 0;
    }

    public String showValue() throws Exception {
        return ("O calculo de " + this.valueA + " " + this.op + " " + this.valueB + "É igual a = " + calculate());
    }

    public int getValueA() {return this.valueA;}

    public int getValueB() {return this.valueB;}

    public char getOp() {return this.op;}

    public void setOp(char operation) {this.op = operation;}

    public void setValueA(int valueA) {this.valueA = valueA;}

    public void setValueB(int valueB) {this.valueB = valueB;}
}
