package ru.nerology.sqr;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test

    public void testBorderValues10 () {
        SQRService service = new SQRService();

        int actual = service.calcNumbers(0, 10);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testBorderValues100 () {
        SQRService service = new SQRService();

        int actual = service.calcNumbers(10, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testBorderValues9801 () {
        SQRService service = new SQRService();

        int actual = service.calcNumbers(100, 9801);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testBorderValues10000 () {
        SQRService service = new SQRService();

        int actual = service.calcNumbers(10000, 100000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testManySquaresFound () {
        SQRService service = new SQRService();

        int actual = service.calcNumbers(100, 300);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
}
