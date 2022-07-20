package com.example.gs03_maven;

import org.joda.time.LocalTime;

public class Application {

  public static void main(String[] args) {
    // use dependency joda-time in pom.xml
    var currTime = new LocalTime();

    System.out.println("The current local time is" + currTime);

    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
  }
}
