package by.epam.introduction_to_java.basic.modul05.Task04.dao.impl;

import by.epam.introduction_to_java.basic.modul05.Task04.bean.Dragon;
import by.epam.introduction_to_java.basic.modul05.Task04.bean.Treasure;
import by.epam.introduction_to_java.basic.modul05.Task04.dao.DataBaseWriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;



public class DataBaseWriterImpl implements DataBaseWriter {

    public DataBaseWriterImpl(){

    }

    public boolean writeTreasure(String fileName, List<Treasure> treasureList){

        checkFile(fileName);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName, true))){
            oos.writeObject(treasureList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    public boolean writeDragon(String fileName, Dragon dragon){

        checkFile(fileName);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName, true))){
            oos.writeObject(dragon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }

    private void checkFile(String fileName){
        if(!Files.exists(Path.of(fileName))){
            File f = new File(fileName);
        }
    }
}
