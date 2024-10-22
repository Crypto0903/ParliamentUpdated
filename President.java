/*Author: Vignesh Sudhan Valvaikar
Roll no: 54
Start Date:
Modified Date: 23/07/2024
*/

public class President {
    private String name;
    private String termStart;
    private int termLength;

    public President(String name, String termStart, int termLength) {
        this.name = name;
        this.termStart = termStart;
        this.termLength = termLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTermStart() {
        return termStart;
    }

    public void setTermStart(String termStart) {
        this.termStart = termStart;
    }

    public int getTermLength() {
        return termLength;
    }

    public void setTermLength(int termLength) {
        this.termLength = termLength;
    }

    public void appointPrimeMinister(String pmName) {
        System.out.println("Appointing " + pmName + " as the Prime Minister.");
    }

    public void signBill(String billName) {
        System.out.println("Signing the bill '" + billName + "' into law.");
    }

    public void declareEmergency() {
        System.out.println("Declaring a state of emergency.");
    }

    public void addressNation(String message) {
        System.out.println("President's message to the nation: " + message);
    }

    public void displayInfo() {
        System.out.println("President Info:");
        System.out.println("Name: " + name);
        System.out.println("Term Start: " + termStart);
        System.out.println("Term Length: " + termLength + " years");
    }
}
