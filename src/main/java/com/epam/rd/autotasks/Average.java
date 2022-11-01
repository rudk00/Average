package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int sum=value;
        int count = 1;
        while (true) {
            value = scanner.nextInt();
            if(value==0) {
                break;
            } else {
                sum += value;
                count++;
            }
        }
        System.out.println(sum / count);
    }
}