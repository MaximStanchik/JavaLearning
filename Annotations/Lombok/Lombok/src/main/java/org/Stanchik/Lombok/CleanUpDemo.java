package org.Stanchik.Lombok;

import lombok.Cleanup;

import java.io.*;

public class CleanUpDemo {
    public static void main(String[] args) throws IOException {
        @Cleanup
        InputStream input = new FileInputStream(args[0]);

        @Cleanup
        OutputStream output = new FileOutputStream(args[1]);

        byte[] b = new byte[10000];

        while (true) {
            int r = input.read(b);

            if (r == -1)
                break;

            output.write(b, 0, r);
        }
    }
}
