package by.epam.introduction_to_java.basic.modul05.Task05b.exception;

public class RepositoryException extends RuntimeException{

    public RepositoryException(){
        super();
    }

    public RepositoryException(String message){
        super(message);
    }

    public RepositoryException(String message, Throwable cause){
        super(message, cause);
    }

    public RepositoryException(Throwable cause){
        super(cause);
    }
}
