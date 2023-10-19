package br.senai.jandira.sp.model;

public class FormaGeometrica {

    private double lado1;
    private double lado2;
    private double resultadoarea;
    private double resultadoperimetro;

    public void calcularArea(){

        resultadoarea = lado1 * lado2;

    }
    public void calcularPerimetro(){

        resultadoperimetro = (lado1 * 2) + (lado2 * 2);

    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getResultadoarea() {
        return resultadoarea;
    }

    public void setResultadoarea(double resultadoarea) {
        this.resultadoarea = resultadoarea;
    }

    public double getResultadoperimetro() {
        return resultadoperimetro;
    }

    public void setResultadoperimetro(double resultadoperimetro) {
        this.resultadoperimetro = resultadoperimetro;
    }
}
