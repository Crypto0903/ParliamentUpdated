/*Author: Vignesh Sudhan Valvaikar
Roll no: 54
Start Date:
Modified Date: 23/07/2024
*/

import java.util.ArrayList;
import java.util.List;

public class RajyaSabha extends Parliament {
    private String chairmanName;
    private List<MP> members;

    public RajyaSabha(int numberOfMembers, String chairmanName) {
        super(numberOfMembers);
        this.chairmanName = chairmanName;
        this.members = new ArrayList<>();
    }

    public String getChairmanName() {
        return chairmanName;
    }

    public void setChairmanName(String chairmanName) {
        this.chairmanName = chairmanName;
    }

    public void addMember(MP mp) {
        if (members.size() < getNumberOfMembers()) {
            members.add(mp);
            System.out.println("Member " + mp.getName() + " added to Rajya Sabha.");
        } else {
            System.out.println("Rajya Sabha is full.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Rajya Sabha Info:");
        System.out.println("Chairman: " + chairmanName);
        System.out.println("Members:");
        for (MP member : members) {
            System.out.println(member);
        }
    }
}
