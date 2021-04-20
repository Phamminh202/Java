package vemaybay;

public class Time {
    byte hour,minutes;
    public Time(byte hour,byte minutes){
        this.hour=hour;
        this.minutes=minutes;
    }

    public byte getHour() {
        return hour;
    }
    public byte getMinutes() {
        return minutes;
    }
    public void setHour(byte hour) {
        this.hour = hour;
    }
    public void setMinutes(byte minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return hour+":"+minutes;
    }
}
