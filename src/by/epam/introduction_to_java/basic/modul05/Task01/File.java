package by.epam.introduction_to_java.basic.modul05.Task01;


import java.util.Objects;

public class File {

    private Directory directory;
    private String fileName;

    public File() {
    }

    public File(Directory directory, String fileName) {
        this.directory = directory;
        this.fileName = fileName;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(directory, file.directory) && Objects.equals(fileName, file.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(directory, fileName);
    }

    @Override
    public String toString() {
        return "File{" +
                "path=" + directory +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
