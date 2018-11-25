package fr.formation.partiel1;

import java.util.Objects;

public class Bban {

    // variable declaration
    public int bankCode;

    private int cashDesk;

    private String accountNum;

    private int keyLock;

    // Constructor
    public Bban(int bankCode, int cashDesk, String accountNum, int keyLock) {
	setBankCode(bankCode);
	setCashDesk(cashDesk);
	setAccountNum(accountNum);
	setKeyLock(keyLock);
    }

    public int getBankCode() {
	return bankCode;
    }

    public void setBankCode(int bankCode) {
	Objects.requireNonNull(bankCode);
	this.bankCode = bankCode;
    }

    public int getCashDesk() {
	return cashDesk;
    }

    public void setCashDesk(int cashDesk) {
	Objects.requireNonNull(cashDesk);
	this.cashDesk = cashDesk;
    }

    public String getAccountNum() {
	return accountNum;
    }

    public void setAccountNum(String accountNum) {
	this.accountNum = accountNum;
    }

    public int getKeyLock() {
	return keyLock;
    }

    public void setKeyLock(int keyLock) {
	Objects.requireNonNull(keyLock);
	this.keyLock = keyLock;
    }
}
