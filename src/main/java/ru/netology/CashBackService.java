package ru.netology;

public class CashBackService {
    public int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }
}
