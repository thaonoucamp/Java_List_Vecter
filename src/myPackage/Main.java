package myPackage;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(1);

        List<Person> list = new Vector<Person>();
       // Cach 2: Vector<Person> list = new Vector<Person>();

        list.add(person);
        list.remove(0);

        for (Person p : list) {
            System.out.println(list);
        }
    }
}
// Vecter co tinh bao mat hon ArrayList;

// Chay cham hon;

// Moi ham trong Vecter dong bo;