import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import taxes.TaxDebit;
import taxes.TaxDebitMinusCredit;

public class TestCompany {
    TaxDebit taxDebit = new TaxDebit();
    TaxDebitMinusCredit taxDebitMinusCredit = new TaxDebitMinusCredit();
    @Test
    public void testDebit() {
        int debit = 100_000, credit = 0, expected = 6000;
        int actual = taxDebit.calcTaxFor(debit, credit);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDebitMinusCredit() {
        int debit = 10_000, credit = 100, expected = 1485;
        int actual = taxDebitMinusCredit.calcTaxFor(debit, credit);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDebitMinusCreditIsNonNegative() {
        int debit = 10_000, credit = 100;
        int actual = taxDebitMinusCredit.calcTaxFor(debit, credit);
        Assertions.assertTrue(actual >= 0);
    }
}