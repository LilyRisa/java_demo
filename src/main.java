import com.apartment.helper.WriteObject;
import com.apartment.interfacefactory.ICom;
import com.apartment.interfacefactory.IApartment;
import com.apartment.material.Apartment;
import com.apartment.material.Room;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static ArrayList<Apartment> listApartment = new ArrayList<Apartment>();
    public static ArrayList<Room> listRoom = new ArrayList<Room>();
    public static void main(String[] args){
        // có thể tự thiết kế 1 menu nhập ở console hoặc làm java swing

        System.out.println("=== Menu quàn lý căn hộ ===");
        boolean check = true;

        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("1. Danh sách Căn hộ");
            System.out.println("2. Thêm căn hộ");
            System.out.println("3. Lưu dữ liệu");
            System.out.println("0. thoát");
            System.out.println("Input:");
            try{
                int menu = scn.nextInt();
                scn.nextLine();

                switch (menu){
                    case 1:
                        for (Apartment item: listApartment) {
                            System.out.println(item.toString());
                        }
                        break;
                    case 2:
                        InputData();
                        break;
                    case 3:
                        WriteData();
                        System.out.println("Ghi thành công");
                        break;
                    case 0:
                        check = false;
                }


            }catch (Exception e){
                System.out.println("Không hợp lệ");
            }

        }while (check);

    }

    public static void WriteData(){
        WriteObject file = new WriteObject("C:\\Users\\minhm\\OneDrive\\Máy tính\\java_demo\\src\\save.txt");
        try {
            file.setContent(listApartment.toString());
            file.Write();
        }catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    public static ArrayList<IApartment> getApartment(){
        WriteObject file = new WriteObject("C:\\Users\\minhm\\OneDrive\\Máy tính\\java_demo\\src\\save.txt");
        try {
            ArrayList<String> list = file.ReadFile();
            ArrayList<IApartment> a = new ArrayList<IApartment>();
            return a;

        }catch (IOException e) {
            System.out.println("Lỗi đọc file");
            ArrayList<IApartment> a = new ArrayList<IApartment>();
            return a;
        }
    }

    public static void InputData(){
        Scanner scn = new Scanner(System.in);
        do {
            System.out.println("1. Thêm căn hộ");
            System.out.println("2. Thêm phòng");
            System.out.println("3. Thêm phòng vào căn hộ");
            System.out.println("0. trở lạị");

            try{
                int menu = scn.nextInt();
                scn.nextLine();
                switch (menu){
                    case 1:
                        listApartment.addAll(addApartment());
                        break;
                    case 2:
                        listRoom.addAll(addRoom());
                        break;
                    case 3:
                        addRoomToApartment();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Không đúng định dạng");
                }
            }catch (Exception e){
                System.out.println("Không đúng định dạng");
            }
        }while (true);


    }

    public static void addRoomToApartment(){
        System.out.println("Danh sách căn hộ");
        for (Apartment item: listApartment) {
            System.out.println(item.getId() + "." + item.getName() + " - chủ sở hữu: "+ item.getOwn());
        }
        System.out.println("Danh sách phòng");
        for (Room item: listRoom) {
            System.out.println(item.getId() + " - chủ sở hữu: "+ item.getOwn());
        }
        Scanner scn = new Scanner(System.in);
        int input,nextStep;
        do {
            System.out.println("Chọn mã căn hộ:");
            try{
                input = scn.nextInt();
                Apartment Apart = ResultItemOfArray(input, listApartment);

                System.out.println("Chọn mã phòng cần thêm:");
                input = scn.nextInt();
                Room room = ResultItemOfArray(input, listRoom);
                Apart.setRoom(room);

                System.out.println("Nhập tiếp (1) hoặc thoát (0)");
                nextStep = scn.nextInt();
                scn.nextLine();

                if(nextStep == 0){
                    return;
                }

            }catch (Exception e){
                System.out.println("Không đúng định dạng");
            }
        }while (true);

    }
    public static <E extends ICom> E ResultItemOfArray(int index, ArrayList<E> obj){
        for (E item: obj) {
            if(index == item.getId()) return  item;
        }
        return null;
    }

    public static ArrayList<Apartment> addApartment(){
        System.out.println("Thêm căn hộ");
        Scanner scn = new Scanner(System.in);
        ArrayList<Apartment> listApartment = new ArrayList<Apartment>();
        int id, floor, nextStep;
        String name, own;

        do {
            try {
                Apartment ap = new Apartment();
                System.out.println("Nhập mã căn hộ");
                id = scn.nextInt();
                scn.nextLine();
                ap.setId(id);

                System.out.println("Nhập tên căn hộ");
                name = scn.nextLine();
                ap.setName(name);

                System.out.println("Nhập chủ sở hữu hộ");
                own = scn.nextLine();
                ap.setOwn(own);

                System.out.println("Nhập số tầng");
                floor = scn.nextInt();
                ap.setFloor(floor);
                scn.nextLine();

                System.out.println("Đã thêm căn hộ:" + ap.toString());
                listApartment.add(ap);

                System.out.println("Nhập tiếp (1) hoặc thoát (0)");
                nextStep = scn.nextInt();
                scn.nextLine();

                if(nextStep == 0){
                    return listApartment;
                }
            }catch (Exception e){
                System.out.println("Dữ liệu nhập không đúng");
                break;
            }
        }while (true);
        return listApartment;
    }

    public static ArrayList<Room> addRoom(){
        System.out.println("Thêm phòng̣");
        Scanner scn = new Scanner(System.in);
        ArrayList<Room> listRoom = new ArrayList<Room>();
        int id, numberPerson, nextStep;
        String  own;
        do {
            try {
                Room ap = new Room();
                System.out.println("Nhập mã phong");
                id = scn.nextInt();
                ap.setId(id);
                scn.nextLine();

                System.out.println("Nhập chủ sở hữu phòng");
                own = scn.nextLine();
                ap.SetOwn(own);

                System.out.println("Nhập số người ở");
                numberPerson = scn.nextInt();
                ap.setNumberPerson(numberPerson);
                scn.nextLine();

                System.out.println("Đã thêm phòng:" + ap.toString());
                listRoom.add(ap);
                System.out.println("Nhập tiếp (1) hoặc thoát (0)");
                nextStep = scn.nextInt();
                scn.nextLine();

                if(nextStep == 0){
                    break;
                }

            }catch (Exception e){
                System.out.println("Dữ liệu nhập không đúng");
                break;
            }
        }while (true);
        return listRoom;

    }

}
