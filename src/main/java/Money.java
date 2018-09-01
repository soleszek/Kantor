public class Money {
    public enum Currency {
        PLN, EUR, USD, CZK, GBP
    }

    ;

    private float kwota;

    private Currency currency;

    public Money(float kwota, Currency currency) {
        this.kwota = kwota;
        this.currency = currency;
    }

    public Currency getCurrency() {
        return currency;
    }

    public float getKwota() {
        return kwota;
    }

    @Override
    public String toString() {
        return "Money{" +
                "kwota=" + kwota +
                ", currency=" + currency +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Money &&
                ((Money) o).getCurrency().equals(this.getCurrency()) &&
                ((Money) o).getKwota() == this.getKwota();
    }

}
