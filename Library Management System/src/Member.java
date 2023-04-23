

public class Member {
    private int MemID;
    private Name MemName;
    private String MemType;
    private int booksBorrowed;
    private Date registered;
    private Date expiryMembership;
    private double penalty;
    private String penaltyStatus;
    
    public Member(){
        MemID = 0;
        MemName = null;
        MemType = null;
        booksBorrowed = 0;
        registered = null;
        expiryMembership = null;
        penalty = 0;
        penaltyStatus = null;
    }

    public Member(int MemID, Name MemName, String MemType, int booksBorrowed, Date registered, Date expiryMembership, double penalty, String penaltyStatus) {
        this.MemID = MemID;
        this.MemName = MemName;
        this.MemType = MemType;
        this.booksBorrowed = booksBorrowed;
        this.registered = registered;
        this.expiryMembership = expiryMembership;
        this.penalty = penalty;
        this.penaltyStatus = penaltyStatus;
    }



    public int getMemID() {
        return MemID;
    }

    public void setMemID(int MemID) {
        this.MemID = MemID;
    }

    public Name getName() {
        return MemName;
    }

    public void setName(Name MemName) {
        this.MemName = MemName;
    }
    public void setMemType(String MemType){
        this.MemType = MemType;
    }
    public String getType(){
        return MemType;
    }

    public Name getMemName() {
        return MemName;
    }

    public void setMemName(Name MemName) {
        this.MemName = MemName;
    }

    public int getBooksBorrowed() {
        return booksBorrowed;
    }

    public void setBooksBorrowed(int booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public Date getExpiryMembership() {
        return expiryMembership;
    }

    public void setExpiryMembership(Date expiryMembership) {//expires after 1 year
        this.expiryMembership = expiryMembership;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
        if(penalty<0){
            setStatus("Clear");
        }else{
            setStatus("Unpaid");
        }
    }

    public String getStatus() {
        return penaltyStatus;
    }

    public void setStatus(String penaltyStatus) {
        this.penaltyStatus = penaltyStatus;
    }
    
    @Override
    public String toString(){
        StringBuilder a = new StringBuilder();
        a.append("ID: ");
        a.append(MemID);
        a.append("\nName: ");
        a.append(MemName);
        a.append("\nType: ");
        a.append(MemType);
        a.append("\nBooks Borrowed: ");
        a.append(booksBorrowed);
        a.append("\nDate Registerd: ");
        a.append(registered);
        a.append("\nExpiry Date: ");
        a.append(expiryMembership);
        a.append("\nPenalty: ");
        a.append(penalty);
        a.append("\nPenalty Status: ");
        a.append(penaltyStatus);
    return a.toString();
    }
}
