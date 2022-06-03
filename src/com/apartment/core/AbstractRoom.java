package com.apartment.core;

import com.apartment.helper.IcorectInput;
import com.apartment.interfacefactory.ICom;

import java.util.ArrayList;

public abstract class AbstractRoom implements ICom {
    protected int id;

    protected static ArrayList<Integer> usage_id;


    protected int NumberPerson;

    public int getNumberPerson() {
        return NumberPerson;
    }

    public void setNumberPerson(int numberPerson) {
        NumberPerson = numberPerson;
    }

    @Override
    public String toString() {
        return "Phòng{" +
                "Mã phòng=" + id +
                ", Số người ở =" + NumberPerson +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        boolean check = true;

        if(usage_id == null){  // Đoạn này kiểm tra đã khởi tạo usage_id chưa. Nếu chưa thì khởi tạo và thêm id vào
            usage_id = new ArrayList<Integer>();
            this.id = id;
            usage_id.add(id);
            return;
        }

        if(id <= 0){  // check nếu mã id của phòng nhỏ hơn không thì bắn ra lỗi
            throw new IcorectInput("ID must be a positive integer");
        }

        for (int s : usage_id)  // đoạn này sẽ lặp qua mảng usage_id xem có tồn tại id hay không. Nếu tồn tại id thì biến check sẽ bằng false
        {
            check = s == id ? false : true;
        }
        if(check){ // nếu thỏa mãn thì thêm id vào object và usage_id
            usage_id.add(id);
            this.id = id;
            return;
        }
        throw new IcorectInput("ID duplicate");

    }

    public abstract void SetOwn(String own);
}
