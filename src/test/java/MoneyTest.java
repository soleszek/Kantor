import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {

    Money money;

    @BeforeEach
    void setUp() {
        money = new Money(50f, Money.Currency.PLN);
    }

    @Test
    public void testGetKwota() {
        assertEquals(50f, money.getKwota());
    }

    @Test
    public void testGetCurrency() {
        assertEquals(Money.Currency.PLN, money.getCurrency());
    }

    @Test
    public void testEquals() {
        Money toEqual = new Money(50f, Money.Currency.PLN);
        assertTrue(money.equals(toEqual));
    }

    @Test
    public void testNotEqualsDifferentCurrency() {
        Money toEqual = new Money(50f, Money.Currency.EUR);
        assertFalse(money.equals(toEqual));
    }

    @Test
    public void testNotEqualsDifferentValue() {
        Money toEqual = new Money(100f, Money.Currency.EUR);
        assertFalse(money.equals(toEqual));
    }

    @Test
    public void testNotEqualsNull() {
        Money toEqual = new Money(50f, null);
        assertNull(toEqual.getCurrency());
    }

}
