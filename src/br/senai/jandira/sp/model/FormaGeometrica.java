package br.senai.jandira.sp.model;

public class FormaGeometrica {

    private double lado1;
    private double lado2;
    private double resultadoarea;
    private double resultadoperimetro;
    private double raio;

    public void criarRetangulo(double lado1,double lado2){

        setLado1(lado1);
        setLado2(lado2);
        System.out.println("Retangulo Criado com o lado 1 de : " + getLado1() + " e lado 2 de :" + getLado2());

    }

    public void criarCirculo(double raio){

        setRaio(raio);
        System.out.println("Circulo criado com o raio de: " + getRaio());


    }

    public void calcularArea() {
    }

    public void calcularPerimetro(){

    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
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
