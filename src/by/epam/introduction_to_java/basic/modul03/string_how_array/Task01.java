package by.epam.introduction_to_java.basic.modul03.string_how_array;


import java.util.Locale;

/*
Работа со строкой как с массивом символов
1.	Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

 */
public class Task01 {
    public String[] strings = {"ADJWVDW", "VJNROE", "DJWOQDW", "DJPODHW", "DMJOLPHJW", "DJWWEFWFW"};

    public static void main(String[] args) {
        Task01 task01 = new Task01();

        task01.castCamelToSnake_Case(task01.strings);

        for (String s : task01.strings) {
            System.out.println(s);
        }
    }

    public String[] castCamelToSnake_Case(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            char[] chars = strings[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] >= 65 && chars[j] <= 90) {   //используем нумерацию таблицы ASCII и
                    chars[j] = (char) (chars[j] + 32);    //то что char можно представлять в виде int
                }
            }
            strings[i] = new String(chars);
        }

        return strings;
    }


}
