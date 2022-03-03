package by.epam.introduction_to_java.basic.modul05.Task01;

import java.io.File;
import java.net.URI;


//Методы: создать, переименовать,
//        дополнить, удалить

public class TextFile extends File {


    public TextFile(String pathname) {
        super(pathname);
    }

    public TextFile(String parent, String child) {
        super(parent, child);
    }

    public TextFile(File parent, String child) {
        super(parent, child);
    }

    public TextFile(URI uri) {
        super(uri);
    }


}
