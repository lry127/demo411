package com.example.demo411;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.example.grpc_test.proto.SimpleGrpc;

@SpringBootApplication
public class Demo411Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo411Application.class, args);
    }

}
// wont work using spring boot 4.1.1

//class MyImpl extends SimpleGrpc.SimpleImplBase {
//
//}

