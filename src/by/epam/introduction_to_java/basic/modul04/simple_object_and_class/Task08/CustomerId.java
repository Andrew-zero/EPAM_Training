package by.epam.introduction_to_java.basic.modul04.simple_object_and_class.Task08;

import java.util.concurrent.atomic.AtomicInteger;

public class CustomerId {
    public static volatile AtomicInteger id = new AtomicInteger(0);
}
