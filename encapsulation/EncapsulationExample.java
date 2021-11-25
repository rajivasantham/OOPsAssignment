package encapsulation;

import java.util.ArrayList;
import java.util.List;

public class EncapsulationExample {
    private String collegeName;
    private List<String> departments;

    public String getCollegeName() {
        return collegeName;
    }
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public List<String> getDepartments() {
        return departments;

    }
    public void setDepartments(List<String> departments) {
        this.departments = departments;
    }
    public static void main(String[] args) {
        EncapsulationExample[] e = new EncapsulationExample[5];
        e[0] = new EncapsulationExample();
        e[0].setCollegeName("VIT");
        e[0].setDepartments(new ArrayList<>(List.of( "CSE", "IT", "AERO")));
        e[1] = new EncapsulationExample();
        e[1].setCollegeName("JNTU");
        e[1].setDepartments(new ArrayList<>(List.of( "EC", "EEE")));
        e[2] = new EncapsulationExample();
        e[2].setCollegeName("KVCET");
        e[2].setDepartments(new ArrayList<>(List.of( "IT", "EEE", "AUTO")));
        e[3] = new EncapsulationExample();
        e[3].setCollegeName("CBIT");
        e[3].setDepartments(new ArrayList<>(List.of( "AERO", "AUTO")));
        e[4] = new EncapsulationExample();
        e[4].setCollegeName("SRM");
        e[4].setDepartments(new ArrayList<>(List.of( "IT", "CS", "AUTO")));
        //Get college details using getter method and print
        for(int i=0; i<5; i++) {
            System.out.println("College Name: " + e[i].getCollegeName());
            System.out.println("Departments:");
            for (int j = 0; j < e[i].departments.size(); j++) {
                System.out.println(e[i].getDepartments().get(j));
            }
        }
    }
}

