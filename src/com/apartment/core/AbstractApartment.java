package com.apartment.core;

import com.apartment.helper.IcorectInput;
import com.apartment.interfacefactory.Iroom;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AbstractApartment {
    protected  int id;

    protected static ArrayList<Integer> usage_id;
    protected String name;
    protected int floor;

    protected ArrayList<Iroom> ListRoom;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        boolean check = true;
        for (int s : usage_id)
        {
            check = s == id ? false : true;
        }
        if(check){
            this.id = id;
        }else{
            throw new IcorectInput("ID trùng lặp");
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Iroom> getListRoom() {
        return ListRoom;
    }

    @Override
    public String toString() {
        String listString = "";

        for (Iroom s : ListRoom)
        {
            listString += s.toString() + ",";
        }
        return "AbstractApartment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", floor=" + floor +
                ", ListRoom=" + listString +
                '}';
    }

    public void setListRoom(ArrayList<Iroom> listRoom) {
        ListRoom = listRoom;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
