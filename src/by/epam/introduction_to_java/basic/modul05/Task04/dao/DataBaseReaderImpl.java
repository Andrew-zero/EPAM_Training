package by.epam.introduction_to_java.basic.modul05.Task04.dao;


import by.epam.introduction_to_java.basic.modul05.Task04.bean.Dragon;
import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DataBaseReaderImpl implements DataBaseReader {

    public DataBaseReaderImpl(){

    }

    public List<Treasure> readAllTreasure(String fileName){
        List<Treasure> treasureList = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            treasureList = (List<Treasure>) ois.readObject();
        } catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

        return treasureList;
    }

    public Dragon readDragon(String fileName){
        Dragon dragon = null;

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            dragon = (Dragon) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return dragon;
    }
}
