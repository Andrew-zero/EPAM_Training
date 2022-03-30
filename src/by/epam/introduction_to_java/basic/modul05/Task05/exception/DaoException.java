package by.epam.introduction_to_java.basic.modul05.Task05.exception;

public class DaoException extends Exception{

    public DaoException(){}

    public DaoException(String message){
        super(message);
    }

    public DaoException(String message, Throwable cause){
        super(message, cause);
    }

    public DaoException(Throwable cause){
        super(cause);
    }
}
