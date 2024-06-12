package OOP.Library;

public class Member extends Item{
    private int memberId;
    public Member(String title, int memberId) {
        super(title);
        this.memberId = memberId;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Member ID: "+memberId);
    }
}
