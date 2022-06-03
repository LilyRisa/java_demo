package com.apartment.material;

import com.apartment.core.AbstractRoom;
import com.apartment.interfacefactory.ICom;
import com.apartment.interfacefactory.IRoom;

import java.io.Serializable;

public class Room extends AbstractRoom implements IRoom, ICom, Serializable {
    private String own;

    public Room(){
        super();
    }

    public String getOwn() {
        return own;
    }

    @Override
    public String toString() {
        return "Phòng{" +
                "Mã phòng=" + id +
                ", Số người ở =" + NumberPerson +
                ", người dại diện =" + own +
                '}';
    }


    @Override
    public void SetOwn(String own) {
        this.own = own;
    }
}
