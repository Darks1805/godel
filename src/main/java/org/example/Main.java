package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Baga numere cu virgula intre ele, fara spatiu");
        Scanner scanner = new Scanner(System.in);
        String scanner1 = scanner.nextLine();
        scanner.close();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> listagolden = new ArrayList<Integer>();
        String[] Array = scanner1.split(",");
        for (String s : Array) {
            int numarindividual = Integer.parseInt(s.trim());
            list.add(numarindividual);
        }
        List<Integer> exponenti = new ArrayList<>();

        if (list.size() == 1) {

            int input = Integer.parseInt(scanner1);
            ArrayList<Integer> primes = new ArrayList<Integer>();


            for (int i = 2; i <= input; i++) {
                boolean isPrime = true;

                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primes.add(i);
                }
            }

            int x = list.get(0);
            for (int i = 2; i <= x; i++) {
                if (x % i == 0) {
                    while (x % i == 0) {
                        exponenti.add(i);
                        x = x / i;

                    }

                }
            }
            for (int i : primes) {
                int count = 0;
                for (int j : exponenti) {
                    if (i == j) {
                        count++;
                    }
                }
                for (int k = 0; k < count; k++) {
                    listagolden.add(i);
                }
                if (count == 0) {
                    listagolden.add(0);
                }

            }

            System.out.println(listagolden);

            System.out.println(exponenti);
            int y = 0;
            for (int e = 0; e < listagolden.size() - 1; e++) {
                if (listagolden.get(e) == 0) {
                    System.out.println(0);

                } else if (listagolden.get(e) == listagolden.get(e + 1)) {
                    y++;
                } else {
                    System.out.println(y + 1);
                    y = 0;
                }

            }

            System.out.println(y + 1);
        } else {
            int count = list.size();
            ArrayList<Integer> numereprime = new ArrayList<Integer>();
            int inceput = 2;
            while(numereprime.size() < count) {
                boolean isPrime = true;
                for(int i = 2; i <= Math.sqrt(inceput); i++) {
                    if(inceput % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime) {
                    numereprime.add(inceput);
                }
                inceput++;
            }
            System.out.println(numereprime);
            int raspunsul=1;
            for (int i = 0; i < list.size(); i++) {
                raspunsul= (int) (raspunsul*Math.pow(numereprime.get(i), list.get(i)));

            }
            System.out.println(raspunsul);





            }
        }

    }
