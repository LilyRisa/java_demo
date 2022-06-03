package com.apartment.material;

import com.apartment.core.AbstractApartment;
import com.apartment.interfacefactory.IApartment;
import com.apartment.interfacefactory.IRoom;

import java.io.Serializable;
import java.util.ArrayList;

public class Apartment extends AbstractApartment implements IApartment, Serializable {

    private String own;

    public Apartment(){    // contructor
        super();
    }

    public ArrayList<IRoom> toStringRoom(){

        return ListRoom;
    }

    public String getOwn() {
        return own;
    }

    public void setOwn(String own) {
        this.own = own;
    }

    @Override
    public void SetRoom(IRoom room) {
        ListRoom.add(room);
    }

}
