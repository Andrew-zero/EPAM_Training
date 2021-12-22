package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task01;


/*
Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее
значение из этих двух переменных.
 */
public class Test1 {
    private int oneValue;
    private int twoValue;

    public Test1(){}

    public Test1(int oneValue, int twoValue) {
        this.oneValue = oneValue;
        this.twoValue = twoValue;
    }

    public void setFirstValue(int oneValue) {
        this.oneValue = oneValue;
    }

    public void setSecondValue(int twoValue) {
        this.twoValue = twoValue;
    }

    public int getOneValue() {
        return oneValue;
    }

    public int getTwoValue() {
        return twoValue;
    }
}
