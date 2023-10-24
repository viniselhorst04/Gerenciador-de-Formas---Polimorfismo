package br.senai.jandira.sp.model;

public class Retangulo extends FormaGeometrica {



    @Override
    public void calcularArea() {

        setResultadoarea( super.getLado1() * super.getLado2());
        System.out.println("A área do Retangulo é: " + getResultadoarea());

    }

    @Override
    public void calcularPerimetro() {

        setResultadoperimetro( (super.getLado1() * 2) + (super.getLado2() * 2));
        System.out.println("O perimetro do Retangulo é: " + getResultadoperimetro());

    }
}
