package ru.netology;

import org.testng.annotations.Test;
import org.testng.Assert;


public class CashBackServiceTest {
    CashBackService service = new CashBackService();

    @Test
    public void shouldCalculateWithPurchaseUnder1000() {
        int expected = 50;
        int actual = service.remain(950);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateWithPurchase1000() {
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void shouldCalculateWithPurchaseOver1000() {
        int expected = 167;
        int actual = service.remain(1833);
        Assert.assertEquals(actual, expected);
    }


}