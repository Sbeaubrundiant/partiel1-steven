package fr.formation.partiel1;

import java.util.Objects;

public class BankAccount {

    // variable declaration
    String countryCode;

    int controlKey;

    // constructor
    public BankAccount(String countryCode, int controlKey) {
	setCountryCode(countryCode);
	setControlKey(controlKey);
    }

    public void setCountryCode(String countryCode) {
	Objects.requireNonNull(countryCode);
	this.countryCode = countryCode;
    }

    public void setControlKey(int controlKey) {
	Objects.requireNonNull(controlKey);
	this.controlKey = controlKey;
    }

    public String getCountryCode() {
	return countryCode;
    }

    public int getControlKey() {
	return controlKey;
    }
}
