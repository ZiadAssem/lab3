import java.lang.*;

public class DigitalWatch {
    int hour;
    int minutes;
    int second;
    int year;
    int month;
    int day;

    DigitalWatch(int hour, int minutes,int second,int year,int month,int day) {
      setTime(hour,minutes,second);
      setDate(year,month,day);
    }

    public String setTime(int hour, int minutes, int second){
        if(hour < 24 && hour >= 0 && minutes>=0 && minutes<60 && second>-1&&second<60) {
            setHour(hour);
            setMinutes(minutes);
            setSecond(second);
            return "Successful";
        }
        return invalid();
    }
    public String setDate(int year,int month, int day){
        if(year > -1&&month>0&&month<13&&day > 0 && day < 32) {
            setYear(year);
            setMonth(month);
            setDay(day);
            return "Successful";
        }
        return invalid();
    }

    public void setHour(int hour) {
        if (hour < 24 && hour >= 0) {
            this.hour = hour;
        }
    }

    public void setMinutes(int minutes) {
        if(minutes>=0 && minutes<60) {
            this.minutes = minutes;
        }
    }

    public void setSecond(int second) {
        if(second>-1&&second<60) {
            this.second = second;
        }
    }

    public void setYear(int year) {
        if (year > -1) {
            this.year = year;

        }
    }

    public void setMonth(int month) {
        if(month>0&&month<13) {
            this.month = month;
        }
    }

    public void setDay(int day) {
        if (day > 0 && day < 32) {
            this.day = day;
        }
    }
    public String invalid(){
        return "Invalid parameter";
    }
    public String getTime(){
        String x = Integer.toString(hour)+":" + Integer.toString(minutes)+":"+Integer.toString(second);
        return x;
    }
    public String getDate(){
        String y = Integer.toString(day) +"/"+Integer.toString(month)+"/"+Integer.toString(year);
        return y;
    }

    public static void main(String [] args){
        DigitalWatch w = new DigitalWatch(1,1,1,2000,5,6);
        System.out.println(w.getDate());
        System.out.println(w.getTime());
    }
}

