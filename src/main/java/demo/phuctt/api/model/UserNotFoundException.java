package demo.phuctt.api.model;

public class UserNotFoundException extends Exception { 
    public UserNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}