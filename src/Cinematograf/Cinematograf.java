package Cinematograf;

import java.util.ArrayList;
import java.util.List;

public class Cinematograf {
    private static Cinematograf SINGLETON;

    List<Film> filme = new ArrayList<>();

    private Cinematograf() {

    }

    public static final Cinematograf getSingleton() {
        if (SINGLETON == null) {
            SINGLETON = new Cinematograf();
        }
        return SINGLETON;
    }

    public void addFilm(Film f) {
        filme.add(f);
        System.out.println("Am adaugat cu succes un film.");
    }

    public void afisareFilm() {
        for (Film f : filme) {
            System.out.println(f);
        }
    }

    public void afisareAnimatii() {
        for (Film f : filme) {
            if (f instanceof Animatii) {
                System.out.println(f);
            }
        }
    }
}

