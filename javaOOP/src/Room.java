import java.awt.geom.Area;

public class Room {
    float length;
    float breadth;
    void getData(float a,float b) {
        length = a;
        breadth = b;
    }
}
class RoomArea{
    static float Area(Room a) {
        return a.length*a.breadth;
    }
    public static void main(String[] args) {
        Room room1 = new Room();
        room1.getData(18,19);
        System.out.println("Area of Room : "+ Area(room1));
    }
}
