package com.apartment.material;

import com.apartment.core.AbstractRoom;
import com.apartment.interfacefactory.Iroom;

import java.io.Serializable;

public class Room extends AbstractRoom implements Iroom, Serializable {
    private String own;

    @Override
    public String toString() {
        return "Room{" +
                "own='" + own + '\'' +
                ", id=" + id +
                ", NumberPerson=" + NumberPerson +
                '}';
    }

    public Room(int Number, int id) {
        super();
        this.id = id;
        this.NumberPerson = Number;
    }

    @Override
    public void SetOwn(String own) {
        this.own = own;
    }
}
