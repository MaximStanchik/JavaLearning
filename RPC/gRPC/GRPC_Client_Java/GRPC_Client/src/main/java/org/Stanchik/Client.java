package org.Stanchik;

import com.Stanchik.grpc.GreetingServiceGrpc;
import com.Stanchik.grpc.GreetingServiceOuterClass;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forTarget("localhost:8080").usePlaintext().build();
        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);
        GreetingServiceOuterClass.HelloRequest request = GreetingServiceOuterClass.HelloRequest.newBuilder().setName("Maxim").addHobbies("Gaming").addHobbies("Sport").build();
        GreetingServiceOuterClass.HelloResponse response = stub.greeting(request);
        System.out.println(response);
        channel.shutdownNow();
    }
}
