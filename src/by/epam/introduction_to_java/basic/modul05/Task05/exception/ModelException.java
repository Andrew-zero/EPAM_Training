package by.epam.introduction_to_java.basic.modul05.Task05.exception;

public class ModelException extends Exception{

    public ModelException(){}

    public ModelException(String message){
        super(message);
    }

    public ModelException(String message, Throwable cause) {
        super(message, cause);
    }

    public ModelException(Throwable cause){
        super(cause);
    }
}
