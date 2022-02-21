package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task02;

import java.util.Objects;

public class NodeXml {
    private String content;
    private TegType tegType;

    public NodeXml(){}

    public  NodeXml(String content, TegType tegType){
        this.content = content;
        this.tegType = tegType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public TegType getTegType() {
        return tegType;
    }

    public void setTegType(TegType tegType) {
        this.tegType = tegType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NodeXml nodeXml = (NodeXml) o;
        return Objects.equals(content, nodeXml.content) && tegType == nodeXml.tegType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, tegType);
    }

    @Override
    public String toString() {
        return "NodeXml{" +
                "content='" + content + '\'' +
                ", tegType=" + tegType +
                '}';
    }
}
