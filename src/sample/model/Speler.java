package sample.model;

public class Speler {
    private String naam;
    private int leeftijd;
    private String achternaam;


    public Speler(String naam,String achternaam ,int leeftijd) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.achternaam = achternaam;
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
