package ques.questwo;

public class Time {
    private int hour;
    private int min;
    private int sec;

    Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public void addTime(Time t) {
        hour += t.hour;
        min += t.min;
        sec += t.sec;
        System.out.println(hour + " " + min + " " + sec);
    }
}
