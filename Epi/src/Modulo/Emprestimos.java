package crudEpi;

import java.util.ArrayList;
import java.util.Scanner;

public class Emprestimos {
    private static ArrayList<String> emprestimos = new ArrayList<>();

    public static void menu(Scanner scanner) {
        crud.executar("Empréstimos", emprestimos, scanner);
    }
}