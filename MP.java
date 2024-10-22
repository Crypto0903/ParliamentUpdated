/*Author: Vignesh Sudhan Valvaikar
Roll no: 54
Start Date:
Modified Date: 23/07/2024
*/

public class MP {
    private String name;
    private String constituency;
    private String party;

    public MP(String name, String constituency, String party) {
        this.name = name;
        this.constituency = constituency;
        this.party = party;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConstituency() {
        return constituency;
    }

    public void setConstituency(String constituency) {
        this.constituency = constituency;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    @Override
    public String toString() {
        return "MP{" +
                "name='" + name + '\'' +
                ", constituency='" + constituency + '\'' +
                ", party='" + party + '\'' +
                '}';
    }
}
