package br.com.ebac;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioColecao {


    private static List<Pessoa> masc =  new ArrayList<>();
    private static List<Pessoa> fem =  new ArrayList<>();

    public static void main (String args[]){

        while(true){
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(leNome());
            pessoa.setSexo(leSexo());

            if(pessoa.getSexo().toUpperCase().equals(("M"))){
                masc.add(pessoa);

            }
            if(pessoa.getSexo().toUpperCase().equals(("F"))){
                fem.add(pessoa);

            }

            System.out.println("Total de Mulheres: "+fem.size() );
            System.out.println("Total de Homens: "+ masc.size() );

        }





    }

    private static String leNome() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        return  scanner.next();
    }
    private static String leSexo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o sexo (F/M): ");
        return  scanner.next();
    }
}
