package br.senai.jandira.sp.model;

public class Circulo extends FormaGeometrica {

    @Override
    public void calcularArea() {

        setResultadoarea(3.14 *(super.getRaio()*super.getRaio()));
        System.out.println("A área do Circulo é: " + getResultadoarea());

    }

    @Override
    public void calcularPerimetro() {

        setResultadoperimetro((3.14*2) * super.getRaio());
        System.out.println("O perimetro do Circulo é: " + getResultadoperimetro());

    }
}
