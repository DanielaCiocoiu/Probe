package Cinematograf;

public class Drama extends Film {

    public int varsta;


    public Drama(int id, String titlu, int minute, int varsta) {
        super(id, titlu, minute);
        this.varsta = varsta;

    }

    @Override
    public String toString() {
        return "Drama " + " " + varsta + " " + super.getTitlu() + " " + super.getMinute();
    }
}
/*
import java.util.Scanner;

public class Main
{
    final static Scanner scanner = new Scanner(System.in);
    final static Cinematograf cinematograf = Cinematograf.getInstance();

    public static void main(){
        System.out.println("Introduceti comanda:");
        System.out.println("1.adaugare_film tip(drama/animatie) titlu durata varsta_minima");
        System.out.println("2.stergere_film titlu");
        System.out.println("3.listare_filme");
        System.out.println("4.exit");
        while(true) {
            final String comanda = scanner.nextLine();
            final String[] cuvinte = comanda.split("\\s+");

            switch(cuvinte[0]){
                case "adaugare_film":
                    //adaugam filmul in lista
                    final String titlu = cuvinte[2];
                    //frumos ar fi sa tratam NumberFormatException
                    final double durata = Double.parseDouble(cuvinte[3]);

                    if("drama".equals(cuvinte[1])) {
                        int varstaMinima = Integer.parseInt(cuvinte[4]);
                        final Film drama = new Drama(titlu, durata, varstaMinima);
                        System.out.println(drama);
                        cinematograf.adaugaFilm(drama);
                    } else if("animatie".equals(cuvinte[1])){
                        final Film animatie = new Animatie(titlu, durata);
                        System.out.println(animatie);
                        cinematograf.adaugaFilm(animatie);
                    }
                    break;

                case "stergere_film":
                    final Film f = cinematograf.stergeFilm(cuvinte[1]);
                    System.out.println("Film sters: "+f);
                    break;

                case "listare_filme":
                    cinematograf.afisareFilme();
                    break;
                case "exit":
                    System.exit(0);
                    break;

                default:
                    System.out.println("Comanda inexistenta");
            }


            //curs 10 thread-uri: tema exemplul cu Producator si Consumator
        }


        */
/* Introduceti comanda:
         * adaugare_film tip(drama/animatie) titlu durata
         *      Ex: adaugare_film drama Titanic 197
         * stergere_film titlu
         *      Ex: stergere_film Titanic
         * listare_filme => intoarce lista de filme
         * exit => inchidere aplicatie fara erori
         * alta comanda => Comanda inexistenta
         *//*

    }
}
*/
