package org.Stanchik.Java;

import java.io.*;

public class CleanUpDemo {
    public static void main(String[] args) throws IOException {
        try (OutputStream output = new FileOutputStream(args[1])) {
            try (InputStream input = new FileInputStream(args[0])) {
                byte[] b = new byte[10000];

                while (true) {
                    int r = input.read(b);

                    if (r == -1)
                        break;

                    output.write(b, 0, r);
                }
            }
        }
    }
}
