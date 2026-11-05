package Rational;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    /** No-arg constructor */
    public Rational() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    /** Specified numerator and denominator constructor */
    public Rational(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        BigInteger sign = (denominator.compareTo(BigInteger.ZERO) > 0) ? BigInteger.ONE : new BigInteger("-1");
        
        this.numerator = sign.multiply(numerator).divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }

    /** Find GCD of two BigInteger numbers */
    private static BigInteger gcd(BigInteger n, BigInteger d) {
        return n.abs().gcd(d.abs());
    }

    public BigInteger getNumerator() {
        return numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    /** Add a rational number to this rational */
    public Rational add(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Subtract a rational number from this rational */
    public Rational subtract(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Multiply a rational number to this rational */
    public Rational multiply(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new Rational(n, d);
    }

    /** Divide a rational number from this rational */
    public Rational divide(Rational secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.getNumerator());
        return new Rational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Rational) {
            return this.subtract((Rational) other).getNumerator().equals(BigInteger.ZERO);
        }
        return false;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public int compareTo(Rational o) {
        return this.subtract(o).getNumerator().compareTo(BigInteger.ZERO);
    }
}
