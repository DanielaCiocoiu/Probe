package Cinematograf;

import java.util.Scanner;

public class demoCinematograf {

    public static void main(String[] args) {
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
        cinematograf.afisareFilm();*/

        Scanner s = new Scanner(System.in);
        Cinematograf cinematograf = Cinematograf.getSingleton();
        while (true) {

            String citire = s.nextLine();
            String[] stringSplit = citire.split(" ");

            if (stringSplit[0].equals("EXIT")) {
                System.exit(0);
            }
            if (stringSplit[0].equals("AFISARE")){
                cinematograf.afisareFilm();
            }
            if (stringSplit[0].equals("AFISARE_ANIMATII")){
                cinematograf.afisareAnimatii();
            }
            if (stringSplit[0].equals("ADAUGARE_DRAMA")){
              String titlu = stringSplit[1];
              int minute = Integer.parseInt(stringSplit[2]);
              int varsta = Integer.parseInt(stringSplit[3]);
              Drama drama = new Drama(titlu,minute, varsta);
              cinematograf.addFilm(drama);
          }
            if (stringSplit[0].equals("ADAUGARE_ANIMATIE")){
                String titlu = stringSplit[1];
                int minute = Integer.parseInt(stringSplit[2]);
                Animatii animatii = new Animatii(titlu,minute);
                cinematograf.addFilm(animatii);
            }



        }
    }
}
