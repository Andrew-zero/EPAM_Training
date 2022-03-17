package by.epam.introduction_to_java.basic.modul05.Task04.dao;

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Dragon;
import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;



public class DataBaseWriterImpl implements DataBaseWriter {

    public DataBaseWriterImpl(){

    }

    public boolean writeTreasure(String fileName, List<Treasure> treasureList){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName, true))){
            oos.writeObject(treasureList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean writeDragon(String fileName, Dragon dragon){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName, true))){
            oos.writeObject(dragon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }


}
