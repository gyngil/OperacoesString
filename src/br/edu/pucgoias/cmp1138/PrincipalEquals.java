package br.edu.pucgoias.cmp1138;

public class PrincipalEquals {

    public static void main(String[] args) {
        String nome1 = new String("Carlos");
        String nome2 = new String("Carla");

        Character letraA = new Character('a');
        Character letraB = new Character('a');

        if(nome1.equals(nome2)){
            System.out.println("Os nomes são iguais!");
        }else{
            System.out.println("Os nomes são diferentes!");
        }

        if(nome1.equalsIgnoreCase(nome2)){
            System.out.println("Os nomes são iguais idependente de maiusculas ou minusculas!");
        }else{
            System.out.println("Os nomes são diferentes idependente de maiusculas ou minusculas!");
        }
        if(letraA==letraB){
            System.out.println("As letras 'A' e 'B' são iguais na memória!");
        }else{
            System.out.println("As letras 'A' e 'B' são diferentes na memória!");
        }

        if(letraA.equals(letraB)){
            System.out.println("As letras 'A' e 'B' são iguais no texto!");
        }else{
            System.out.println("As letras 'A' e 'B' são diferentes no texto!");
        }

        if(letraA.equals(letraB)){
            System.out.println("As letras 'A' e 'B' são iguais no texto!");
        }else{
            System.out.println("As letras 'A' e 'B' são diferentes no texto!");
        }
    }
}
