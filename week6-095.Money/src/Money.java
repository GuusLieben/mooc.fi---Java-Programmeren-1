
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money add) {
        // final ints cannot be modified, therefore return a new Money.
        int sumEuros = euros + add.euros();
        int sumCents = cents + add.cents();

        if (sumCents > 100) {
            sumEuros++;
            sumCents -= 100;
        }

        Money sum = new Money(sumEuros, sumCents);

        return sum;
    }

    public boolean less(Money comp) {
        return euros < comp.euros() || // If euros is bigger, bump!
                (euros == comp.euros() && cents < comp.cents()); // If euros are equal, check cents.
    }

    public Money minus(Money min) {
        // final ints cannot be modified, therefore return a new Money.
        int diffEuros = euros - min.euros();
        int diffCents = cents - min.cents();

        if (diffCents < 0) {
            diffEuros--;
            diffCents += 100;
        }

        if (diffEuros < 0) {
            diffEuros = 0;
            diffCents = 0;
        }

        Money diff = new Money(diffEuros, diffCents);

        return diff;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
