package by.epam.introduction_to_java.basic.modul05.Task05;


import by.epam.introduction_to_java.basic.modul05.Task05.service.FlowerCompositionOne;
import by.epam.introduction_to_java.basic.modul05.Task05.service.interface1.FlowerComposition;


/*
Задача 5.
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
и упаковка.
 */
public class Main {
    public static void main(String[] args) {

        FlowerComposition flowerComposition = new FlowerCompositionOne("FirstFlowerComposition");
        flowerComposition.makeComposition();


        System.out.println(flowerComposition);
    }
}
