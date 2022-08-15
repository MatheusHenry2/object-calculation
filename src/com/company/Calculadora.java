package com.company;

public class Calculadora {

    private int valueA;
    private int valueB;
    private char op;

    public Calculadora() {
    }

    public void captureInformations(String expression) {

        String[] arrayValores = expression.split(" ");
        try {
            this.valueA = Integer.parseInt(arrayValores[0]);
            this.valueB = Integer.parseInt((arrayValores[2]));
            this.op = arrayValores[1].charAt(0);
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    public boolean testOperator() {
        return (this.op == '*' || this.op == '+' || this.op == '-' || this.op == '/');
    }

    private int calculate() throws Exception {

        if (!testOperator()) {
            throw new Exception("Caractere inválido para operação!");
        }

        try {
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
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public String showValue() throws Exception {
        return ("O calculo de " + this.valueA + " " + this.op + " " + this.valueB + " É igual  = " + calculate());
    }

    public int getValueA() {
        return this.valueA;
    }

    public int getValueB() {
        return this.valueB;
    }

    public char getOp() {
        return this.op;
    }

    public void setOp(char operation) {
        this.op = operation;
    }

    public void setValueA(int valueA) {
        this.valueA = valueA;
    }

    public void setValueB(int valueB) {
        this.valueB = valueB;
    }
}
