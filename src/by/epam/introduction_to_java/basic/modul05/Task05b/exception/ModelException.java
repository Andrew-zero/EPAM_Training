package by.epam.introduction_to_java.basic.modul05.Task05b.exception;

public class ModelException extends RuntimeException{

    public ModelException(){
        super();
    }

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
