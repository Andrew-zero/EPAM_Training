package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task02;

public class Logic {

    public NodeXml[] parseXml(String xmlText) {

        return new Parser().parseXml(xmlText);
    }
}
