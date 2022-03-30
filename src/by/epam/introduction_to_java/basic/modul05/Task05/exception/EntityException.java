package by.epam.introduction_to_java.basic.modul05.Task05.exception;

public class EntityException extends Exception{

    public EntityException(){}

    public EntityException(String message){
        super(message);
    }

    public EntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public EntityException(Throwable cause){
        super(cause);
    }
}
