package Cinematograf;
        /*1. Modifica structura de prelucrare a comenzilor citite de la tastatura din IF-uri intr-un SWITCH care sa se evalueze
        primul element al array-ului.
        2. Adauga functia de stergere a filmelor din lista definita in cadrul cinematografului.
        Stegerea filmelor trebuie sa se faca pe baza unui ID.
        HINT: Acest ID trebuie sa reprezinte un nou atribut al claselor ce mostenesc pe Film,
        iar valoarea sa trebuie sa fie determinata automat de catre aplicatie
        (nu sa fie introdus de catre utilizator cand adauga instante de Drama/Animatie*/
import java.util.Scanner;
public class demoCinematograf {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Cinematograf cinematograf = Cinematograf.getSingleton();

        System.out.println("Introduceti comanda:");
        System.out.println("AFISARE");
        System.out.println("AFISARE_ANIMATIE");
        System.out.println("ADAUGARE_FILM  - ADAUGARE_FILM DRAMA 1 2 3 4  -  ADAUGARE_FILM ANIMATIE 1 2 3 4");
        System.out.println("STERGE_FILM DRAMA");

        while (true) {
            String comanda = s.nextLine();
            String[] cuvinte = comanda.split(" ");
            switch (cuvinte[0]) {
                case "ADAUGARE_FILM":
                    int id = 0;
                    try {
                        id = Integer.parseInt(cuvinte[2]);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                    String titlu = cuvinte[3];
                    int minute = Integer.parseInt(cuvinte[4]);
                    if("DRAMA".equals(cuvinte[1])) {
                        int varsta = Integer.parseInt(cuvinte[5]);
                        final Film drama = new Drama(id, titlu, minute, varsta);
                        cinematograf.addFilm(drama);
                        System.out.println("Am adaugat o drama in lista:  " + drama.toString());
                    } else if("ANIMATIE".equals(cuvinte[1])){
                        final Film animatie = new Animatii(id,titlu, minute);
                        cinematograf.addFilm(animatie);
                        System.out.println("Am adaugat o animatie in lista:  " + animatie.toString());
                    }
                    break;
                case "STERGE_FILM":
                    if("DRAMA".equals(cuvinte[1])) {
                        final Film drama = cinematograf.stergeFilm(cuvinte[1]);
                        System.out.println("Am sters: " + drama.toString());
                    } else if("ANIMATIE".equals(cuvinte[1])){
                        final Film animatie = cinematograf.stergeFilm(cuvinte[1]);
                        System.out.println("Am sters:  " + animatie.toString());
                    }
                    break;
                case "AFISARE":
                    cinematograf.afisareFilm();
                    break;
                case "AFISARE_ANIMATIE":
                    cinematograf.afisareAnimatii();
                    break;
                case "EXIT":
                    System.exit(0);
                    System.out.println("Fabrica s-a oprit :(");
                    break;
                default:
                    System.out.println("Comanda introdusa nu exista!");
            }
        }

        /*      doar pentru test:
        Animatii animatii = new Animatii("Nemo", 120);
        Animatii animatii1 = new Animatii("doi", 20);

        Drama drama = new Drama("drama", 30, 20);
        Drama drama1 = new Drama("drama1", 40, 30);

        Cinematograf cinematograf = Cinematograf.getSingleton();

        cinematograf.addFilm(animatii);
        cinematograf.addFilm(animatii1);
        cinematograf.addFilm(drama);
        cinematograf.addFilm(drama1);

        cinematograf.afisareAnimatii();
        cinematograf.afisareFilm();
        ---------------------------------*/


/*       varianta cu if:
        while (true) {

            String citire = s.nextLine();
            String[] stringSplit = citire.split(" ");

            if (stringSplit[0].equals("EXIT")) {
                System.exit(0);
            }
            if (stringSplit[0].equals("AFISARE")) {
                cinematograf.afisareFilm();
            }
            if (stringSplit[0].equals("AFISARE_ANIMATII")) {
                cinematograf.afisareAnimatii();
            }
            if (stringSplit[0].equals("ADAUGARE_DRAMA")) {
                int id = Integer.parseInt(stringSplit[1]);
                String titlu = stringSplit[2];
                int minute = Integer.parseInt(stringSplit[3]);
                int varsta = Integer.parseInt(stringSplit[4]);
                Drama drama = new Drama(id, titlu, minute, varsta);
                cinematograf.addFilm(drama);
            }
            if (stringSplit[0].equals("ADAUGARE_ANIMATIE")) {
                int id = Integer.parseInt(stringSplit[1]);
                String titlu = stringSplit[2];
                int minute = Integer.parseInt(stringSplit[3]);
                Animatii animatii = new Animatii(id, titlu, minute);
                cinematograf.addFilm(animatii);
            }
            if (stringSplit[0].equals("STERGE")) {
                cinematograf.stergeFilm(1);
            }
        }
*/
    }
}
