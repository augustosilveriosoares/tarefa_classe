package br.com.ebac;

public class CalculaMedia {

    public static  void main (String args[]){
       calcula(5.7,6.2,9.1,10);

    }

    public static  void calcula(double nota1 ,double nota2, double nota3, double nota4){
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media > 7) {
            System.out.println("Média: " + String.format("%.2f", media) + " - Aprovado");
        } else {
            System.out.println("Média: " + String.format("%.2f", media) + " - Reprovado");
        }
    }
}
