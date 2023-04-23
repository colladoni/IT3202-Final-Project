 
public class Catalog {
    private String Department;
    private int aisleNo;
    private int floor;
    private int shelfNo;
    
    public Catalog(){
        Department = null;
        aisleNo = 0;
        floor = 0;
        shelfNo = 0;
    }

    public Catalog(String Department, int aisleNo, int floor, int shelfNo) {
        this.Department = Department;
        this.aisleNo = aisleNo;
        this.floor = floor;
        this.shelfNo = shelfNo;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public int getAisleNo() {
        return aisleNo;
    }

    public void setAisleNo(int aisleNo) {
        this.aisleNo = aisleNo;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getShelfNo() {
        return shelfNo;
    }

    public void setShelfNo(int shelfNo) {
        this.shelfNo = shelfNo;
    }
    
    @Override
    public String toString(){
	return "Department of " + Department + ", floor " + floor +
				",aisle " + aisleNo + ",shelf " + shelfNo;
    }
    
}
