package by.epam.introduction_to_java.basic.modul05.Task05.model.interface1;


import by.epam.introduction_to_java.basic.modul05.Task05.model.Wrap;
import by.epam.introduction_to_java.basic.modul05.Task05.model.type.WrapType;

public interface WrapFactory {

    Wrap createWrap(WrapType type);
}
