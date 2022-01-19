package by.epam.introduction_to_java.basic.modul03.string_how_object;

/*

4.	С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

 */
public class Task04 {
    public String stringOne = "информатика";
    public String expectedString = "торт";

    public static void main(String[] args) {
        Task04 task04 = new Task04();
        System.out.println(task04.createCake().equals(task04.expectedString));
    }

    public String createCake() {
        StringBuilder sb = new StringBuilder();

        return sb.append(stringOne.charAt(7))
                .append(stringOne.charAt(3))
                .append(stringOne.charAt(4))
                .append(stringOne.charAt(7))
                .toString();
    }
}
