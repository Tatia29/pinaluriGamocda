package com.company.ge.edu.btu;

public class StationSquare {
    public static void main(String[] args) {
        Passanger gio=new Passanger("Gio",true);
        Passanger nika= new Passanger("Nika",false);
        Passanger ana = new Passanger("ana",true);

        Train train= new Train();
        train.addPassanger(gio);
        train.addPassanger(nika);
        train.addPassanger(ana);

        for (Passanger passanger:train.getPassangerList())
            System.out.println(passanger.getName());
    }
}
