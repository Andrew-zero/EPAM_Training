package by.epam.introduction_to_java.basic.modul04.simple_object_and_class;


/*
Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее
значение из этих двух переменных.
 */
public class Task01 {

    public class Test1 {

        private int oneValue;
        private int twoValue;

        public void view() {
            System.out.println(oneValue + " " + twoValue);
        }

        public void setValue(int oneValue, int twoValue) {
            this.oneValue = oneValue;
            this.twoValue = twoValue;
        }

        public int sum() {
            return oneValue + twoValue;
        }

        public int maxValue() {
            return Math.max(oneValue, twoValue);
        }
    }
}
