import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {


        ArrayList<String> typeArray = new ArrayList<>();
        typeArray.add("Heat");
        typeArray.add("Electricity");
        typeArray.add("Water");


        Meter meter1 = new Meter("Heat", 1);

        LocalDate date = LocalDate.now();


        meter1.addReading(date, 120);
        meter1.addReading(date, 240);


        File file = new File("Data.txt");
        FileWriter fr = new FileWriter(file,false);
        fr.write(meter1.getMeterString());
        fr.close();


    }
}
