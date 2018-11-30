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

        System.out.println((int)(Math.random()*((200-100)+1))+100);
        int typeNr = (int)(Math.random()*((2-0)+1));
        Meter meter1 = new Meter(typeArray.get(typeNr), 1);


        for(int i = 0; i<100; i++) {
            LocalDate randomDate = LocalDate.of((int)(Math.random()*((2018-2015)+1))+2015,(int)(Math.random()*((12-1)+1))+1,(int)(Math.random()*((28-1)+1))+1);
            meter1.addReading(randomDate, (int) (Math.random() * ((600 - 100) + 1)) + 100);
        }


        File file = new File("Data.txt");
        FileWriter fr = new FileWriter(file,false);
        fr.write(meter1.getMeterString());
        fr.close();


    }
}
