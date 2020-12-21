package com.company.ge.edu.btu;

public class Passanger {
    private String name;
    private boolean ticket;
    public Passanger(String name, boolean ticket) {
        this.name = name;
        this.ticket = ticket;
    }
    public String getName(){
        return this.name;

    }
    public boolean haveTicket(){
        return this.ticket;
    }


}
