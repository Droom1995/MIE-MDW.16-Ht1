import java.util.ArrayList;

/**
 * Created by Oleksandr on 23.10.2016.
 */
public class Booking{

    int id;
    String location;
    Person person;

    public Booking(ArrayList<String> inp){
        id = Integer.parseInt(inp.get(0));
        location = inp.get(1);
        person = new Person(inp.get(2));
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Person getPerson() {
        return person;
    }


}
