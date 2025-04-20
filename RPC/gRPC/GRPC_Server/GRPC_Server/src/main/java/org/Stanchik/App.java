package org.Stanchik;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class App
{
    public static void main( String[] args ) throws IOException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new GreetingServiceImpl())
                .build();

        try {
            server.start();
            System.out.println("Server started");
            server.awaitTermination();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new IOException(e);
        }
    }
}
