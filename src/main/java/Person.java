/**
 * Created by Oleksandr on 23.10.2016.
 */
public class Person {

    String firstName;
    String lastName;

    public Person(String inputName){
        String name[] = inputName.split(" ");
        firstName = name[0];
        lastName = name[1];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
