package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public void parseXml(String xmlText){
        String regEx = "(?<=>)(.*?)(?=\\<)|(?<closeTeg><\\/.*>)|(?<withoutBodyTeg><.*\\/>)|(?<openTeg><\\w*.*?>)";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(xmlText);

        while (m.find()) {
            if (m.group(4) != null) {
                System.out.println("open teg : " + m.group(4));
            }
            if (m.group(1) != null) {
                System.out.println("content teg : " + m.group(1));
            }
            if (m.group(3) != null) {
                System.out.println("without body teg : " + m.group(3));
            }
            if (m.group(2) != null) {
                System.out.println("close teg : " + m.group(2));
            }
        }







        return;
    }
}
