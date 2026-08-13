public class clock{
    private int hours;
    private int minutes;
    private int seconds;
                                                                             
    public clock(){
        this(10 , 10, 35);

    }
    public clock(int value){
        this(value,value,value);
    }
    public clock(int hours, int minutes, int seconds){
        if(hours>=0 && hours<=23 && minutes>=0 && minutes<=59 && seconds>=0 && seconds<=59){
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        else{
            throw new IllegalArgumentException("invalid values to time......");
        }
    }
    public void setTime(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }
    public void showTime(){
        System.out.println(hours+"hh "+minutes+"mm "+seconds+"ss ");
    }
}