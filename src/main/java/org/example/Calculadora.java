package org.example;

public class Calculadora {
    private double valorA;
    private double valorB;

    public double getValorA() { return valorA; }

    public void setValorA(double valorA) { this.valorA = valorA; }

    public double getValorB() { return valorB; }

    public void setValorB(double valorB) { this.valorB = valorB; }

    public double getAdicao(){
        return (getValorA() + getValorB());
    }
    public double getSubtracao(){
        return (getValorA() - getValorB());
    }
    public double getDivisao(){
        return (getValorA() / getValorB());
    }
    public double getProduto(){
        return (getValorA() * getValorB());
    }

    public Calculadora (double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }
    public Calculadora(){
        this (0.0, 0.0);
    }

}
