package br.com.ebac;

import java.util.Scanner;

public class Wrappers {


    public static void main(String[] args) {
        double numero = readFromConsole();
        Double novoNumero = (double) numero;
        System.out.println("Você digitou: " + novoNumero);
    }

    public static double readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        return  scanner.nextDouble();
    }
}

