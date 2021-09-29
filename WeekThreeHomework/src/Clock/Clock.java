package Clock;

import java.time.LocalTime;

public class Clock
{

    private int hour;
    private int minutes;
    private int seconds;

    public Clock()
    {
        this.setHour();
        this.setMinutes();
        this.setSeconds();
    }

    public void setHour()
    {
       hour = LocalTime.now().getHour();
    }

    public void setMinutes()
    {
        minutes = LocalTime.now().getMinute();
    }

    public void setSeconds()
    {
        seconds = LocalTime.now().getSecond();
    }

    public void displayTime()
    {
        System.out.println("The current time in 24 hour clock: " + hour + ":" + minutes + ":" + seconds + "");
    }
}
