package com.apartment.core;

import com.apartment.helper.IcorectInput;
import com.apartment.interfacefactory.ICom;
import com.apartment.interfacefactory.Iroom;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AbstractApartment implements ICom{
    protected  int id;

    protected static ArrayList<Integer> usage_id; // Lưu lại những id căn hộ đã từng tồn tại để tránh trùng lặp
    protected String name;
    protected int floor;

    protected ArrayList<Iroom> ListRoom = new ArrayList<Iroom>();


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

        if(id <= 0){  // check nếu mã id của căn hộ nhỏ hơn không thì bắn ra lỗi
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
        return "Căn hộ{" +
                "Mã căn hộ = " + id +
                ", Tên căn hộ = '" + name + '\'' +
                ", Số tầng = " + floor +
                ", Danh sách phòng = " + listString +
                '}';
    }

    public void setListRoom(ArrayList<Iroom> listRoom) {
        ListRoom = listRoom;
    }

    public void setRoom(Iroom Room) {
        ListRoom.add(Room);
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
