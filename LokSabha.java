/*Author: Vignesh Sudhan Valvaikar
Roll no: 54
Start Date:
Modified Date: 23/07/2024
*/

import java.util.ArrayList;
import java.util.List;

public class LokSabha extends Parliament {
    private String speakerName;
    private List<MP> members;

    public LokSabha(int numberOfMembers, String speakerName) {
        super(numberOfMembers);
        this.speakerName = speakerName;
        this.members = new ArrayList<>();
    }

    public String getSpeakerName() {
        return speakerName;
    }

    public void setSpeakerName(String speakerName) {
        this.speakerName = speakerName;
    }

    public void addMember(MP mp) {
        if (members.size() < getNumberOfMembers()) {
            members.add(mp);
            System.out.println("Member " + mp.getName() + " added to Lok Sabha.");
        } else {
            System.out.println("Lok Sabha is full.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Lok Sabha Info:");
        System.out.println("Speaker: " + speakerName);
        System.out.println("Members:");
        for (MP member : members) {
            System.out.println(member);
        }
    }
}
