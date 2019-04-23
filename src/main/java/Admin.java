import java.util.ArrayList;
import java.util.List;

public class Admin {


    private Person administrator;


    public Admin(Person bruker){
        this.administrator = bruker;
    }

    public Person getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Person administrator) {
        this.administrator = administrator;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "administrator=" + administrator +
                '}';
    }

    public void remove(List list, Film film){
        list.remove(film);
    }

    public void add(List list, Film film){
        list.add(film);
    }


}
