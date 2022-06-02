package com.apartment.material;

import com.apartment.core.AbstractApartment;
import com.apartment.interfacefactory.Iapartment;
import com.apartment.interfacefactory.Iroom;

import java.io.Serializable;
import java.util.Arrays;

public class Apartment extends AbstractApartment implements Iapartment, Serializable {

    private String own;

    public Apartment(){    // contructor
        Iroom[] ListRoom = {};
    }

    public String toStringRoom(){

        return listString;
    }

    public String getOwn() {
        return own;
    }

    public void setOwn(String own) {
        this.own = own;
    }

    @Override
    public void SetRoom(Iroom room) {
        listRoom.add(room);
    }

}
