package org.Stanchik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public String input () throws MyCustomException {
        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (s.equals("")) {
            throw new MyCustomException("String cannot be empty");
        }
        return s;
    }

    public String input_1() throws MyCustomException {
        String s1 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s1 = reader.readLine();
            if (s1.equals("")) {
                throw new MyCustomException("String cannot be empty");
            }
        }
        catch (IOException | MyCustomException e) {
            System.out.println(e.getMessage());
        }
        return s1;
    }
}
