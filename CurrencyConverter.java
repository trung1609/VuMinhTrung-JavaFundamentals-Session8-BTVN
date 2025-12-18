package Session8;

import java.text.DecimalFormat;

public class CurrencyConverter {
    private static double rate;

    public static double getRate() {
        return rate;
    }

    public static void setRate(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("r should be greater than 0");
        }
        rate = r;
    }

    public static double toUSD(int vnd) {
        if (vnd <= 0) {
            throw new IllegalArgumentException("vnd should be greater than 0");
        }
        return vnd / rate;
    }

    public static String formatUSd(double usd) {
        DecimalFormat df = new DecimalFormat("#,##0.000");
        return df.format(usd) + " USA";
    }

    public static void main(String[] args) {
        CurrencyConverter.setRate(25000);

        double usd = CurrencyConverter.toUSD(25000);
        System.out.println(CurrencyConverter.formatUSd(usd));
    }
}
