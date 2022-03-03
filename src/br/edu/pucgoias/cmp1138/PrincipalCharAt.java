package br.edu.pucgoias.cmp1138;

public class PrincipalCharAt {

    public static void main(String[] args) {
        String nomeCurso = "JAVA para Web";

        if(nomeCurso.charAt(1) == 'A')
        System.out.println("O caractere A está na posição 1");

        //FORMA DINÂMICA
        char percorreString = nomeCurso.charAt(1);
        System.out.println("Na posição 1 tem o caractere.: "+percorreString);

    }
}
