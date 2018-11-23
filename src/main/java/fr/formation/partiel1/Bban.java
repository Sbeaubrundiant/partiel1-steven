package fr.formation.partiel1;

public class Bban {

    private int bankCode;

    private int cashDesk;

    private String accountNumber;

    private int keyLock;

    public Bban(int bankCode, int cashDesk, String accountNum, int keyLock) {
    }

    public int getBankCode() {
	return bankCode;
    }

    public void setBankCode(int bankCode) {
	this.bankCode = bankCode;
    }

    public int getCashDesk() {
	return cashDesk;
    }

    public void setCashDesk(int cashDesk) {
	this.cashDesk = cashDesk;
    }

    public String getAccountNumber() {
	return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
    }

    public int getKeyLock() {
	return keyLock;
    }

    public void setKeyLock(int keyLock) {
	this.keyLock = keyLock;
    }
}
