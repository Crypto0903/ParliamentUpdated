/*Author: Vignesh Sudhan Valvaikar
Roll no: 54
Start Date:
Modified Date: 23/07/2024
*/

public abstract class Parliament {
    private int numberOfMembers;

    public Parliament(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public void passBill(String billName) {
        System.out.println("The bill '" + billName + "' has been passed.");
    }

    public void debate(String topic) {
        System.out.println("Debating on: " + topic);
    }

    public void adjournSession() {
        System.out.println("The session has been adjourned.");
    }

    public abstract void displayInfo();
}
