package two_2;

public class myDate {
    private long year,month,day;
    public myDate() {
    }

    public long getYear() {
        return year;
    }

    public void setYear(long  year) {
        this.year = year;
    }

    public long  getMonth() {
        return month;
    }

    public void setMonth(long month) {
        this.month = month;
    }

    public long  getDay() {
        return day;
    }

    public void setDay(long  day) {
        this.day = day;
    }

    public myDate(long  year, long  month, long  day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public long setDate(long elapsedTime){
        return elapsedTime;
    }

    @Override
    public String toString() {
        return year+"/"+month+"/"+day;
    }

}
