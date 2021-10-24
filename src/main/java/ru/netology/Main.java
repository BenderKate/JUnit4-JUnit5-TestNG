package ru.netology;

public class Main {
    public static void main(String[] args) {
        CashBackService service = new CashBackService();
        int result = service.remain(1000);
        System.out.println(result);
    }
    }

