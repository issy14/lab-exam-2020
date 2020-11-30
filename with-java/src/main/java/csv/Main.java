package csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        var users = new UserCsvReader().readUserCsv("users.csv");
        // TODO Q2.1

        users.stream()
                .filter(user -> user.getCode().startsWith("m"))
                .map(user -> user.getName().toLowerCase())
                .sorted()
                .forEach(System.out::println);

    }
}
