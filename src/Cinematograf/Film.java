package Cinematograf;

public abstract class Film {

    private String titlu;
    private int minute;

    public Film(String titlu, int minute) {
        this.titlu = titlu;
        this.minute = minute;

    }

    public String getTitlu() {
        return this.titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public int getMinute() {
        return this.minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

}
