package br.senai.jandira.sp;

import br.senai.jandira.sp.model.Circulo;
import br.senai.jandira.sp.model.FormaGeometrica;
import br.senai.jandira.sp.model.Retangulo;

import java.util.Scanner;

public class GerenciadorFormas {

    public static void main(String[] args) {

        FormaGeometrica retangulo = new Retangulo();
        FormaGeometrica circulo = new Circulo();

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {

            System.out.println("\n------- MAIN MENU -------\n");
            System.out.println("1- Create a Retangle");
            System.out.println("2- Create a Circle");
            System.out.println("3- Exit");
            System.out.println("\nOption [1 a 3]:");

            int escolhaUsuario = scanner.nextInt();
            scanner.nextLine();

            switch (escolhaUsuario) {
                case 1:

                    System.out.print("Digite o lado 1: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Digite o lado 2: ");
                    double lado2 = scanner.nextDouble();
                    retangulo.criarRetangulo(lado1,lado2);
                    System.out.println("\nCalculando.....\n");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    retangulo.calcularArea();
                    retangulo.calcularPerimetro();

                    break;

                case 2:

                    System.out.print("Digite o raio: ");
                    double raio = scanner.nextDouble();
                    circulo.criarCirculo(raio);
                    System.out.println("\nCalculando.....\n");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    circulo.calcularArea();
                    circulo.calcularPerimetro();


                    break;

                case 3:

                    continuar = false;

                    break;

            }


        }
    }
}