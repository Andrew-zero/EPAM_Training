package by.epam.introduction_to_java.basic.modul04.simple_object_and_class;


/*
Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- & get- методы для полей экземпляра класса.
 */
public class Task02 {

    public class Test2 {
        private int oneValue;
        private int twoValue;

        public Test2(int oneValue, int twoValue){
            this.oneValue = oneValue;
            this.twoValue = twoValue;
        }

        public void setOneValue(int oneValue) {
            this.oneValue = oneValue;
        }

        public void setTwoValue(int twoValue) {
            this.twoValue = twoValue;
        }

        public int getOneValue() {
            return oneValue;
        }

        public int getTwoValue() {
            return twoValue;
        }
    }
}
