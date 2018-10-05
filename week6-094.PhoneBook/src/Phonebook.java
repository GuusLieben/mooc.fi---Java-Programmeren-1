import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> Phonebook;

    public Phonebook() {
        Phonebook = new ArrayList<>();
    }

    public void add(String name, String number) {
        Person person = new Person(name, number);
        this.Phonebook.add(person);
    }

    public void printAll() {
        for (Person person:Phonebook) {
            System.out.println(person);
        }
    }

    public String searchNumber(String name) {
        for (Person person:Phonebook) {
            if (person.getName().equals(name)) {
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
