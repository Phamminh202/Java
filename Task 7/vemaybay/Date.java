package vemaybay;

public class Date {
    byte day,month;
    short year;

    public Date(byte day,byte month,short year){
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public byte getDay(){return day;}
    public byte getMonth(){return month;}
    public short getYear(){return year;}
    public void setDay(byte day){this.day = day;}
    public void setMonth(byte month){this.month = month;}
    public void setYear(short year){this.year = year; }

    @Override
    public String toString() {
        return day+"/"+month+"/"+year;
    }
}
