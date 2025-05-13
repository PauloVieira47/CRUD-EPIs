package crudEpi;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionarios {
    private static ArrayList<String> funcionarios = new ArrayList<>();

    public static void menu(Scanner scanner) {
        crud.executar("Funcionários", funcionarios, scanner);
    }
}
