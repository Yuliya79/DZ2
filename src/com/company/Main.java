package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while (true){
            System.out.println("\n1 - Count\n" +
                               "2 - Exit");
            int code = scanner.nextInt();
            switch (code){
                case 1:
                    System.out.println("\nCount number " + counter);

                    System.out.println("Enter count potatos:");
                    int countPotatos = scanner.nextInt();

                    System.out.println("Enter count package:");
                    int countPackage = scanner.nextInt();

                    int countPotatosinPackage = countPotatos / countPackage;

                    System.out.println("Count potatos in package:" + countPotatosinPackage);
                    System.out.println("Remainder potatos:" + (countPotatos - (countPackage * countPotatosinPackage)));

                    boolean skipE = false;
                    for (int i = 0; i < countPackage; i++) {
                        if (i < 32) {
                            char c = (char) (i + 'а');
                            if (c == 'ж' && !skipE) {
                                c = 'ё';
                                skipE = true;
                                i--;
                                countPackage--;
                            }

                            System.out.println(String.valueOf(c) + (skipE ? (i + 2) : (i + 1)) + "Пакет");
                        }
                        else {
                            System.out.println("Фиаско" + (i + 1) + "Пакет");
                        }
                    }
                    counter++;
                    break;
                case 2:
                default: System.exit(1);
            }
        }

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count potatos:");
        int countPotatos = scanner.nextInt();

        System.out.println("Enter count package:");
        int countPackage = scanner.nextInt();

        int countPotatosinPackage = countPotatos / countPackage;

        System.out.println("Count potatos in package:" + countPotatosinPackage);
        System.out.println("Remainder potatos:" + (countPotatos - (countPackage * countPotatosinPackage)));

        boolean skipE = false;
        for (int i = 0; i < countPackage; i++) {
            if (i < 32) {
                char c = (char) (i + 'а');
                if (c == 'ж' && !skipE) {
                    c = 'ё';
                    skipE = true;
                    i--;
                }

                System.out.println(String.valueOf(c) + (skipE ? (i + 2) : (i + 1)) + "Пакет");
            }
            else {
                System.out.println("Фиаско" + (i + 1) + "Пакет");
            }
        }*/
    }
}









