package ru.job4j.di;

import java.util.Scanner;
import org.springframework.stereotype.Component;

import org.springframework.context.annotation.Scope;
@Component
@Scope("prototype")
public class ConsoleInput {
    private Scanner scanner = new Scanner(System.in);

    public String askStr(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
