
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void checkDayMonth() {
        if (this.day == 30) { this.month += 1; }
        if (this.month == 12) { this.year += 1; }
    }

    public void advance() {
        this.day += 1;
        checkDayMonth();
    }

    public void advance(int days) {
        this.day += days;
        checkDayMonth();
    }

    public MyDate afterNumberOfDays(int days) {
        int d = days; int m=this.month; int y=this.year;

        while (d>=30) { d-=30; m+=1; }

        while (m>=12) { m-=12; y+=1; }

        MyDate newMyDate = new MyDate(d, m, y);

        return newMyDate;
    }
}