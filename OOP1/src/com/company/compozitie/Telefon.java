package com.company.compozitie;

public class Telefon {
    private String model;
    private int memorie;
    private int diagonala;
    private CardSim sim;

    public Telefon(String model){
        this.model = model;
    }

    public CardSim getSim() {
        return sim;
    }

    public void setSim(CardSim sim){
        this.sim = sim;
    }

    public String getModel(){
        return this.model;
    }
    public String setModel(String model ){
        return this.model;
    }
    public int getMemorie(){
        return  this.memorie;
    }

    public void setMemorie(int memorie){
        this.memorie =  memorie;
    }

    public void setDiagonala(int diagonala){
        this.diagonala =  diagonala;
    }

    public int getDiagonala(){
        return this.diagonala;
    }



}
