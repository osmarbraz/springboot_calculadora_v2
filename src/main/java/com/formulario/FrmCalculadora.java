package com.formulario;

/**
 * Modelo do formulário da calculadora.
 * 
 * @author osmar
 */
public class FrmCalculadora {
    private double valorA;
    private String operacao;
    private double valorB;
    private double resultado;
    
    public FrmCalculadora(){
        this(0,"",0,0);
    }

    public FrmCalculadora(double valorA, String operacao, double valorB, double resultado) {
        this.valorA = valorA;
        this.operacao = operacao;
        this.valorB = valorB;
        this.resultado = resultado;
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }  

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }    
}
