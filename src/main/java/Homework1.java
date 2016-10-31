import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Homework1 {

    public static void main(String[] args) throws IOException {
        /*ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(Paths.get("input.txt"));
        List<String> extractedLines;
        for (String line : lines) {
            if(line.equals("==="))


        }*/
        boolean trigger = false;
        BufferedReader br = new BufferedReader(new FileReader(Paths.get("input.txt").toFile()));
        String line;
        ArrayList<String> retrievedStrings = new ArrayList<String>();
        while ((line = br.readLine()) != null) {
            if(trigger && line.equals("==="))
                break;
            if(trigger){
                String parts[] = line.split(":");
                parts[1] = parts[1].substring(2,parts[1].length()-1);
                retrievedStrings.add(parts[1]);
            }
            if(line.equals("==="))
                trigger = true;
        }
        Booking booking = new Booking(retrievedStrings);
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Booking.class, new BookingSerializer());
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();

        String json = gson.toJson(booking);
        System.out.println(json);

    }
}
