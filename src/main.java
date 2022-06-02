import com.apartment.material.Apartment;
import com.apartment.material.Room;

public class main {
    public static void main(String[] args){
        // có thể tự thiết kế 1 menu nhập ở console hoặc làm java swing
        // khởi tạo 1 room
        Room room1 = new Room(5, 1);
        Room room2 = new Room(4, 1);
        Room room3 = new Room(6, 1);
        Room room4 = new Room(2, 1);

        Apartment apartment = new Apartment();
        apartment.SetRoom(room1);

        System.out.println("dd: " +apartment.toString());

    }
}
