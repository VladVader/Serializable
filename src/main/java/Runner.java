import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person1 = new Person("Jan", "Kowalski", 25);
        Cat ban = new Cat("Tom", 5);
        person1.addCat(ban);
        ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("data.txt"));
        dos.writeObject(person1);
        dos.close();

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("data.txt"));
        Person person = (Person) input.readObject();
        input.close();
        System.out.println(person);
    }
}
