package ru.netology.sqr;

public class SQRService {
    public int calculate(int min, int max) {
        int amount = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    amount++;
                }
            }
        }
        return amount;
    }
}