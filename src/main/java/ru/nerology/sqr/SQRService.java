package ru.nerology.sqr;

public class SQRService {

    public int calcNumbers(int from, int before) {
        int meter = 0;
        for (int i = 10; i <= 99 ; i++) {
            int squared = i * i;
            if (squared >= from) {
                if (squared <= before) {
                    meter++;
                }
            }
        }
        return meter;
    }
}
