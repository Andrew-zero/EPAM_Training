package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public NodeXml[] parseXml(String s){
        Pattern p = Pattern.compile("(>.*?<)|(?<openTeg><\\w*.*?>)|(?<closeTeg><\\/.*>)|(?<withoutBodyTeg><.*\\/>)"); //(?<=\[)(.*?)(?=\]) content between [***]
        Matcher matcher = p.matcher(s);

        NodeXml[] nodeXml = new NodeXml[matcher.groupCount()];
        int i = 0;

        while(matcher.find()){
            if(true)

            i++;
        }


        return nodeXml;
    }
}
