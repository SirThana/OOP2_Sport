package sample;

public class Speler {
    private String naam;
    private int leeftijd;


    public Speler(String naam, int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
    }


    public  String toString(){
        String a = "Naam: " + this.naam + "\nLeeftijd: " + this.leeftijd;
        return a;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }
}
