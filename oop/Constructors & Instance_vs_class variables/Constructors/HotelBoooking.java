package Constructors;
enum RoomType{
    Single, Double
}
public class HotelBoooking {
    private String guestName;
    private RoomType roomType;
    private int nights;

    HotelBoooking(){
        this.guestName = null;
        this.roomType = RoomType.Single;
        this.nights = 1;
    }
    HotelBoooking(String guestName, RoomType roomType, int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    HotelBoooking(HotelBoooking obj){
        this.guestName = obj.guestName;
        this.roomType = obj.roomType;
        this.nights = obj.nights;
    }
    public static void main(String[] args) {
        HotelBoooking p1 = new HotelBoooking("p1",RoomType.Double,2);
        HotelBoooking p2 = new HotelBoooking();
        HotelBoooking p3 = new HotelBoooking(p2);
    }
}
