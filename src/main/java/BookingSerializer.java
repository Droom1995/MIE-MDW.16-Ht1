import com.google.gson.*;
import java.lang.reflect.Type;

/**
 * Created by Oleksandr on 23.10.2016.
 */

public class BookingSerializer implements JsonSerializer<Booking> {
    public JsonElement serialize(final Booking booking, final Type type, final JsonSerializationContext context) {
        JsonObject result = new JsonObject();
        result.add("id", new JsonPrimitive(booking.getId()));
        result.add("location", new JsonPrimitive(booking.getLocation()));
        JsonObject innerPerson = new JsonObject();
        Person person = booking.getPerson();
        innerPerson.add("name", new JsonPrimitive(person.getFirstName()));
        innerPerson.add("surname", new JsonPrimitive(person.getLastName()));
        result.add("person",  innerPerson);
        return result;
    }
}