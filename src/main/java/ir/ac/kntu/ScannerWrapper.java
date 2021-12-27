package ir.ac.kntu;

import java.util.Scanner;


public class ScannerWrapper {

    private static ScannerWrapper instance = new ScannerWrapper();
    private Scanner scanner;

    private ScannerWrapper() {
        scanner = new Scanner(System.in);
    }

    public static ScannerWrapper getInstance() {
        return instance;
    }

    public String next() {
        return scanner.nextLine();
    }

    public void close() {
        scanner.close();
    }
}
