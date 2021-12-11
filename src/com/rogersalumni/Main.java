package com.rogersalumni;
import static java.lang.System.exit;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting cpu-burner threads: ");

        for(int i = 0; i < 4000; i++){
            try {
                new AsyncCalc().calc(i);
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                System.out.println("Failure at iteration " + i);
                exit(1);
            }
        }
    }
}
