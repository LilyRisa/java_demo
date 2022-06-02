package com.apartment.core;

import com.apartment.helper.IcorectInput;

public abstract class AbstractRoom {
    protected int id;

    protected static int[] usage_id;
    protected int NumberPerson;

    @Override
    public String toString() {
        return "AbstractRoom{" +
                "id=" + id +
                ", NumberPerson=" + NumberPerson +
                '}';
    }

    public void setId(int id) {
        boolean check = true;
        for (int i = 0; i < usage_id.length; i++) {
            check = usage_id[i] == id ? false : true;
        }
        if(check){
            this.id = id;
        }else{
            throw new IcorectInput("ID trùng lặp");
        }
    }

    public abstract void SetOwn(String own);
}
