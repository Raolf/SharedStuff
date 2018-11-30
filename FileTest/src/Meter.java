import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Meter {
    private int nr;
    private String meterType;
    private ArrayList<Reading> readings = new ArrayList<>();
    private StringBuilder sb;

    public Meter(String meterType,int nr){
        this.meterType = meterType;
        this.nr = nr;
    }
    public void addReading(LocalDate date, int value){

        Reading reading = new Reading(date,value,nr,meterType);

        readings.add(reading);
    }

    public int getNr(){
        return nr;
    }
    public String getMeterString(){
        sb = new StringBuilder();

        for (int i = 0; i<readings.size(); i++){
            sb.append(readings.get(i).stringData());
        }
        return String.valueOf(sb);

    }
}

