package inheritance;

public class BedRoom extends Home {
    @Override
    public int noOfLightsInARoom(int lights) {
        System.out.println("No.of Lights in Bedroom are:"+lights);
        return lights;

    }
}

