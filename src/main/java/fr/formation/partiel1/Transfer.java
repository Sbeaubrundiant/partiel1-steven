package fr.formation.partiel1;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Administrateur
 */
public class Transfer {

    // Variable declaration
    private String originBank;

    private double amount;

    private LocalDateTime executeDate;

    // Constructor
    public Transfer(String oringinBank, Float amount,
	    LocalDateTime executeDate) {
	setOriginbank(originBank);
	setAmount(amount);
	setExecuteDate(executeDate);
    }

    public LocalDateTime getExecuteDate() {
	return executeDate;
    }

    public void setExecuteDate(LocalDateTime executeDate) {
	Objects.requireNonNull(executeDate);
	this.executeDate = executeDate;
    }

    public void setAmount(double amount) {
	Objects.requireNonNull(amount);
	this.amount = amount;
    }

    public String getOriginbank() {
	return originBank;
    }

    public void setOriginbank(String originbank) {
	Objects.requireNonNull(originBank);
	originBank = originbank;
    }

    public double getAmount() {
	return amount;
    }
}
