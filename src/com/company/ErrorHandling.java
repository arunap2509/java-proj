package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ErrorHandling {
    void handleErrorByThrowingIllegalArgumentException(String message) {
        int d = -1;

        if (d < 0) {
            throw new IllegalArgumentException(message);
        }
    }

    void handleErrorByThrowingAnyCheckedException()
            throws CustomCheckedException{

        try {
            throw  new FileNotFoundException();
        } catch (Exception ex) {
            if (true) {
                throw new CustomCheckedException();
            }
        }

    }
}
