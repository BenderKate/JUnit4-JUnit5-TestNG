package ru.netology;

public class Main {
    public static void main(String[] args) {
        CashBackService service = new CashBackService();
        int result = service.remain(100);
        System.out.println(result);
    }
    }

