package by.epam.introduction_to_java.basic.modul05.Task04.dao;


import java.nio.file.Path;

public class DataBaseReader {

    //    private static final Path path = Path.of("D://DragonCave");
    private static final Path path = Path.of("DragonCave.txt");



    ////////////////////////

      try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat")))
    {
        Person p = new Person("Sam", 33, 178, true);
        oos.writeObject(p);
    }
        catch(Exception ex){

        System.out.println(ex.getMessage());
    }


    ////////////////////////

      try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat")))
    {
        Person p=(Person)ois.readObject();
        System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
    }
        catch(Exception ex){

        System.out.println(ex.getMessage());
    }

    ///////////////////////
    String filename = "people.dat";


    // создадим список объектов, которые будем записывать
    ArrayList<Person> people = new ArrayList<Person>();
        people.add(new

    Person("Tom",30,175,false));
        people.add(new

    Person("Sam",33,178,true));

        try(
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))

    {
        oos.writeObject(people);
        System.out.println("File has been written");
    }
        catch(
    Exception ex)

    {

        System.out.println(ex.getMessage());
    }

    // десериализация в новый список
    ArrayList<Person> newPeople = new ArrayList<Person>();
        try(
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))

    {

        newPeople = ((ArrayList<Person>) ois.readObject());
    }
        catch(
    Exception ex)

    {

        System.out.println(ex.getMessage());
    }

        for(
    Person p :newPeople)
            System.out.printf("Name: %s \t Age: %d \n",p.getName(),p.getAge());
}
}
