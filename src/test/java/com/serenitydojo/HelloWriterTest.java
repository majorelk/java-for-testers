package com.serenitydojo;

import org.junit.Test;

public class HelloWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole(){

        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericVariables() {

        final int ageThisYear = 53;
        int ageNextYear = ageThisYear + 1;
        System.out.println("age = " + ageThisYear + " the age next year = " + ageNextYear);
    }

    @Test
    public void woringWithStrings() {
        String firstName = "Sara-Stevens";
        String upperCaseFirstName = firstName.toUpperCase();
        String replaceFirstName = upperCaseFirstName.replace("SARA", "SAM");

        System.out.println(upperCaseFirstName);
        System.out.println(upperCaseFirstName.trim());
        System.out.println(replaceFirstName);
    }
}
