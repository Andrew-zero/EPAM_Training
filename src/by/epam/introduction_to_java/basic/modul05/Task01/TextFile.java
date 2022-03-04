package by.epam.introduction_to_java.basic.modul05.Task01;


import java.util.Objects;

//Методы: создать, переименовать,
//        дополнить, удалить
public class TextFile extends File {

    private String content = "";

    public TextFile() {
    }

    public TextFile(Directory directory, String fileName) {
        super(directory, fileName);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void addContent(String content) {
        this.content = this.content + content;
    }

    public void deleteContent() {
        this.content = "";
    }

    public boolean renameTo(String newFileName) {
        for (File file : getDirectory().getFileArrayList()) {
            if (file.getFileName().equals(newFileName)) {
                return false;
            }
        }

        setFileName(newFileName);

        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TextFile textFile = (TextFile) o;
        return Objects.equals(content, textFile.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), content);
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "content='" + content + '\'' +
                '}';
    }
}
