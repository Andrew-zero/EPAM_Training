package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    public NodeXml[] parseXml(String xmlText) {
        String regEx = "(?<=>)(.*?)(?=<)|(?<closeTeg></.*>)|(?<withoutBodyTeg><.*/>)|(?<openTeg><\\w*.*?>)";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(xmlText);

        int count = (int) m.results().count();
        m.reset();

        int i = 0;
        NodeXml[] nodeXmls = new NodeXml[count];

        while (m.find()) {
            if (m.group(4) != null) {
                nodeXmls[i] = new NodeXml(m.group(4), TegType.OPEN_TEG);
            }
            if (m.group(1) != null) {
                nodeXmls[i] = new NodeXml(m.group(1), TegType.CONTENT_TEG);
            }
            if (m.group(3) != null) {
                nodeXmls[i] = new NodeXml(m.group(3), TegType.WITHOUT_BODY_TEG);
            }
            if (m.group(2) != null) {
                nodeXmls[i] = new NodeXml(m.group(2), TegType.CLOSE_TEG);
            }

            i++;
        }

        return nodeXmls;
    }
}
