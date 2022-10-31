package ru.netology.naumova;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = 1_000_000_000;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long stat() {
        long stat = (LongStream.of(sales).sum() - max() - min()) / (sales.length - 2);
        if (sales.length == 2) {
            throw new ArithmeticException("Деление на ноль");
        }
        return stat;
    }

    public long newMax(long number) {
        if (number > this.max()) {
            return number;
        } else {
            return this.max();
        }
    }

}