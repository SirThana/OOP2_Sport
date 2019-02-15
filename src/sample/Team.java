package sample;

import java.util.ArrayList;

public class Team {
    private String teamNaam;
    private ArrayList<Speler> spelerLijst;

    public Team(String naam) {
        this.teamNaam = naam;
        this.spelerLijst = new ArrayList<>();
    }
    public void voegSpelerToe(Speler speler){
        spelerLijst.add(speler);
    }

    public ArrayList returnLijst(){
        return this.spelerLijst;

    }

}
