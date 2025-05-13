package crudEpi;

import java.util.ArrayList;
import java.util.Scanner;

public class Epis {
    private static ArrayList<String> epis = new ArrayList<>();

    public static void menu(Scanner scanner) {
        crud.executar("EPIs", epis, scanner);
    }
}
