import java.time.LocalDate;
import java.util.Date;

public class Reading {

    private LocalDate date;
    private int value;
    private int nr;
    private StringBuilder sb;
    private String type;

    public Reading(LocalDate date, int value,int nr, String type){
        this.date = date;
        this.value = value;
        this.nr = nr;
        this.type = type;
    }

    public int getUnit(){
        return value;
    }
    public String stringData(){
        sb = new StringBuilder();
        sb.append(nr).append(",").append(type).append(",").append(date).append(",").append(value).append("\r\n");
        return String.valueOf(sb);
    }
}
