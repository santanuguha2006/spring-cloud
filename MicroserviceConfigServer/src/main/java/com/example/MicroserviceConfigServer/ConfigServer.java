package com.example.MicroserviceConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServer {
 public static void main(String[] args) {
  SpringApplication.run(ConfigServer.class, args);
 }
}

/***********************IMPORTANT ************************
It’s smart to keep these properties files distinct. bootstrap.properties is for getting the config server 
ready, and application.properties is for properties specific to our application. Technically, 
though, it’s possible to place application properties in bootstrap.properties.

Lastly, since Config Server is managing our application properties, one might wonder why have an
 application.properties at all? The answer is that these still come in handy as default values that
  perhaps Config Server doesn’t have.

*/