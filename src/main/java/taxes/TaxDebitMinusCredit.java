package taxes;

public class TaxDebitMinusCredit extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) ((debit - credit) * 0.15);
    }
}
