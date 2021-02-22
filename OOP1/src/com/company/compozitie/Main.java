package com.company.compozitie;

public class Main {
    public static void main(String[] args) {

        Telefon primulTelefon = new Telefon("Iphone X");
        primulTelefon.setDiagonala(6);
        primulTelefon.setMemorie(64);

        Telefon alDoileaTelefon = new Telefon("Galaxy S10");
        alDoileaTelefon.setDiagonala(7);
        alDoileaTelefon.setMemorie(256);

        CardSim sim1 = new CardSim(3, "Orange");
        CardSim sim2 = new CardSim(5, "Vodafone");

        Contact[] contacts = new Contact[2];

        Contact contactAcasa = new Contact("0351414198");
        contactAcasa.setNume("Acasa");
        contactAcasa.setPrenume("");

        Contact contactMircea =  new Contact("0784170970");
        contactMircea.setNume("Popescu");
        contactMircea.setPrenume("Mircea");

        contacts[0] = contactAcasa;
        contacts[1] =  contactMircea;

        sim1.setContacte(contacts);

        primulTelefon.setSim(sim1);
        alDoileaTelefon.setSim(sim2);
        afiseaza(primulTelefon);
        afiseaza(alDoileaTelefon);
    }
    public static  void afiseaza(Telefon telefon){
        String model = telefon.getModel();
        int diagonala = telefon.getDiagonala();
        int memorie = telefon.getMemorie();
        CardSim sim = telefon.getSim();
        String operator = sim.getOperator();
        String numeFrecventa = sim.getNumeFrecventa();
        System.out.println(model +" diagonala: " + diagonala + " memorie: " + memorie
                + " operator: " + operator +" numeFrecventa: " + numeFrecventa );

        Contact[] contactes =  sim.getContacte();

        if(contactes != null){
            for(int i = 0; i <  contactes.length; i++){
                Contact contact =  contactes[i];
                String nume = contact.getNume();
                String prenume = contact.getPrenume();
                String nrTelefon = contact.getTelefon();
                System.out.println(nume + " " + prenume + " " + nrTelefon);
            }
        }

    }
}
