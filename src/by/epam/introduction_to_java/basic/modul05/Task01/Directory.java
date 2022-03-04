package by.epam.introduction_to_java.basic.modul05.Task01;


import java.util.ArrayList;
import java.util.Objects;

public class Directory {

    private String path;
    private ArrayList<File> fileArrayList = new ArrayList<>();
    private ArrayList<Directory> directoryArrayList = new ArrayList<>();

    public Directory() {
    }

    public Directory(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList<File> getFileArrayList() {
        return fileArrayList;
    }

    public void setFileArrayList(ArrayList<File> fileArrayList) {
        this.fileArrayList = fileArrayList;
    }

    public ArrayList<Directory> getDirectoryArrayList() {
        return directoryArrayList;
    }

    public void setDirectoryArrayList(ArrayList<Directory> directoryArrayList) {
        this.directoryArrayList = directoryArrayList;
    }

    public boolean createNewTextFile(String fileName) {
        for (File file : getFileArrayList()) {
            if (file.getFileName().equals(fileName)) {
                return false;
            }
        }

        fileArrayList.add(new TextFile(this, fileName));

        return true;
    }

    public boolean deleteTextFile(TextFile textFile) {

        return fileArrayList.remove(textFile);
    }

    public boolean deleteTextFile(String fileName) {
        for (File file : fileArrayList) {
            if (file.getFileName().equals(fileName)) {
                fileArrayList.remove(file);

                return true;
            }
        }

        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directory directory = (Directory) o;
        return Objects.equals(path, directory.path) && Objects.equals(fileArrayList, directory.fileArrayList) && Objects.equals(directoryArrayList, directory.directoryArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, fileArrayList, directoryArrayList);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "path='" + path + '\'' +
                ", fileArrayList=" + fileArrayList +
                ", directoryArrayList=" + directoryArrayList +
                '}';
    }
}
