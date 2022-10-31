package Files;

public class FilesLengthType {
    private int hours;
    private int minutes;
    private long seconds;

    public FilesLengthType(){};

    public FilesLengthType(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours>=0) this.hours = hours;
        else throw new IllegalArgumentException("Введите неотрицательное значение");
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes>=0) this.minutes = minutes;
        else throw  new IllegalArgumentException("Введите неотрицательное значение");
    }

    public long getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds>0) this.seconds = seconds;
        else throw new IllegalArgumentException("Введите значение больше 0");
    }

    public String toStringLength() {
        if(hours>0) return hours + ":" + minutes + ":" + seconds;
        else return minutes + ":" + seconds;
    }
}
