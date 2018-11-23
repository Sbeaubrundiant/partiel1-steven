package fr.formation.partiel1;

/**
 * @author Administrateur
 */
public class Transfer {

    // Variable declaration
    private String originbank;

    private double amount;

    public Transfer(String oringinBank, Float amount) {
    }

    public String getOriginbank() {
	return originbank;
    }

    public void setOriginbank(String originbank) {
	this.originbank = originbank;
    }

    public double getAmount() {
	return amount;
    }

    public void setAmount(Float amount) {
	this.amount = amount;
    }
}
