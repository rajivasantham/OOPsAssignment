package inheritance;

public class Rooms {

    public static void main(String[] args) {
        Home h=new Home();
        h.noOfLightsInARoom(6);
        h=new BedRoom();
        h.roomName("BedRoom");
        h.noOfLightsInARoom(4);
        h=new LivingRoom();
        h.noOfLightsInARoom(2);
        h.roomName("livingRoom");

    }
}
