package br.com.ebac;

import java.util.*;

public class ExercicioM12 {

    public static void main(String args[]){


        String valores = leNome();
        valores = valores.replace(" ","");
        String[] nomes = valores.split(",");
        List<String> listaNomes = new ArrayList<>();

        for (String nome : nomes){
            listaNomes.add(nome);

        }
        Collections.sort(listaNomes);

        listaNomes.forEach(nome -> System.out.println(nome));

    }

    public static String leNome() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        return  scanner.nextLine();
    }
}
