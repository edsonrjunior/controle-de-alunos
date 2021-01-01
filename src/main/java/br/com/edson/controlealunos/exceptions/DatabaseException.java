package br.com.edson.controlealunos.exceptions;

public class DatabaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DatabaseException (String databaseErrorMessage){
        super(databaseErrorMessage);
    }
}
