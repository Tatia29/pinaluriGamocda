package com.company.ge.edu.btu;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private List<Passanger> passangerList=new ArrayList<Passanger>();
    public void addPassanger(Passanger passanger){
        if(passanger.haveTicket()==true){
            this.passangerList.add(passanger);
        }

    }

    public List<Passanger> getPassangerList() {
        return passangerList;
    }
}
