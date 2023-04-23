
public class Date {
    private int day;
    private String month;
    private int year;
    
    public Date(){
        day = 0;
        month = null;
        year = 0;
    }

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString(){
	return " " + day + " " + month +
				" " + year;
    }
    
    
}
