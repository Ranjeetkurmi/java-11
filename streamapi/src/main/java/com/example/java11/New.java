package com.example.java11;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class New {
    public static void main(String[] args) throws IOException {

        //stripLeading whitespace

        String str=new String("     Hello World!");
        String strippedLeading = str.stripLeading();
        System.out.println(strippedLeading);

        //stripTrailing whitespace

        String str2=new String("Hello World!    ");
        String strippedTrailing = str2.stripTrailing();
        System.out.println(strippedTrailing);

        // isBlank() return true if string is blank
        String str3="";
        System.out.println(str3.isBlank());

        // lines() method
        String lines="This is first line\nThis is second line\nThis is third line";
        Stream<String> stringStream = lines.lines();
        stringStream.forEach(System.out::println);

        // readString method used to write data to file.
        Path path = Paths.get("src/main/resources/test.txt");
        String fileContent = Files.readString(path, StandardCharsets.UTF_8);
        System.out.println(fileContent);

        // writeString method used to write data to file
        Path path2 = Paths.get("src/main/resources/test2.txt");
        String fileContent2="Hello World!";
        Files.writeString(path2, fileContent2, StandardCharsets.UTF_8);

        //standard httpsClient

        



    }
}
