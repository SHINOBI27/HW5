package ru.netology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void Test1() {
        SQRService service = new SQRService();
        int actual = service.calculate(100, 200);
        int expected = 5;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Test2() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Test3() {
        SQRService service = new SQRService();
        int actual = service.calculate(100, 9801);
        int expected = 90;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Test4() {
        SQRService service = new SQRService();
        int actual = service.calculate(100, 100);
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Test5() {
        SQRService service = new SQRService();
        int actual = service.calculate(3000, 5000);
        int expected = 16;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Test6() {
        SQRService service = new SQRService();
        int actual = service.calculate(101, 9800);
        int expected = 88;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void Test7() {
        SQRService service = new SQRService();
        int actual = service.calculate(9801, 9802);
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }
}