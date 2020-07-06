package com.oarano;



public class Main {

    public static void main(String[] args) {

        String adn = "999";

        // analyser si c'était des 7 ou des 9
        long count = adn.chars().filter(element -> element == '7').count();
        int nombreCaractere = adn.length();

        // afficher le nombre de caracteres

        System.out.println("Nombre de caracteres : " + nombreCaractere);

        // tester si la personne est de sexe masculin ou feminin

        if(count == 0){
            //femme
            System.out.println("C'est une femme");
        }else{
            //homme
            System.out.println("C est un homme");
        }

        // vérification de l'age de la personne

        if(nombreCaractere > 18){
            System.out.println("La personne a plus de 21 ans");
        }
        else if(nombreCaractere > 6){
            System.out.println("La personne a moins de 21 ans");
        }else{
            System.out.println("La personne a plus de 65 ans");
        }
        // afficher le nombre de 7 trouvé

        System.out.println(count);
    }
}
