package edu.javacourse.studentorder.exception;

import java.lang.reflect.Executable;
import java.sql.SQLException;

public class DaoException extends Exception
{
    public DaoException(Throwable cause) {
        super(cause);
    }

    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }
}
