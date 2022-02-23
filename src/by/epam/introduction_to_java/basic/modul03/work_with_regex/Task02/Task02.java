package by.epam.introduction_to_java.basic.modul03.work_with_regex.Task02;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
2.	Дана строка, содержащая следующий текст (xml-документ):

<notes>
<note id = "1">
<to>Вася</to>
<from>Света</from>
<heading>Напоминание</heading>
<body>Позвони мне завтра!</body>
</note>
<note id = "2">
<to>Петя</to>
<from>Маша</from>
<heading>Важное напоминание</heading>
<body/>
</note>
</notes>

Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и
его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
Пользоваться готовыми парсерами XML для решения данной задачи нельзя.

 */
public class Task02 {

    public static String xmlText =
            "<notes>\n" +
                "<note id = \"1\">\n" +
                    "<to>Вася</to>\n" +
                    "<from>Света</from>\n" +
                    "<heading>Напоминание</heading>\n" +
                    "<body>Позвони мне завтра!</body>\n" +
                "</note>\n" +
                "<note id = \"2\">\n" +
                    "<to>Петя</to>\n" +
                    "<from>Маша</from>\n" +
                    "<heading>Важное напоминание</heading>\n" +
                    "<body/>\n" +
                "</note>\n" +
            "</notes>";


    public static void main(String[] args) {
        String regEx = "(?<=>)(.*?)(?=\\<)|(?<closeTeg><\\/.*>)|(?<withoutBodyTeg><.*\\/>)|(?<openTeg><\\w*.*?>)";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(xmlText);

        System.out.println(m.groupCount());

        while (m.find()) {
            if (m.group(1) == null && m.group(2) == null && m.group(3) == null) {
                System.out.println("open teg : " + m.group(4));
            }
            if (m.group(2) == null && m.group(3) == null && m.group(4) == null) {
                System.out.println("context teg : " + m.group(1));
            }
            if (m.group(1) == null && m.group(2) == null && m.group(4) == null) {
                System.out.println("without body teg : " + m.group(3));
            }
            if (m.group(1) == null && m.group(3) == null && m.group(4) == null) {
                System.out.println("close teg : " + m.group(2));
            }

        }
    }
}
