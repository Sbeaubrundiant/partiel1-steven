package fr.formation.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.formation.partiel1.BankAccount;

@Path("BankAccount")
public class BankAccountController {

    private final static Map<String, BankAccount> BANKACCOUNTLIST = new HashMap<>();
    static {
	BANKACCOUNTLIST.put("000000000001", buildBankAccount1());
    }

    @GET
    @Path("/partiel1/{bankAccount}")
    @Produces(MediaType.APPLICATION_JSON)
    public BankAccount partiel1(@PathParam("controlKey") String controlKey) {
	return BANKACCOUNTLIST.get(controlKey);
    }

    private static BankAccount buildBankAccount1() {
	String countryCode = "FR";
	int controlKey = 34;
	BankAccount bankAcount1 = new BankAccount(countryCode, controlKey);
	// ban bban1 = new Bban()
	return bankAcount1;
    }
}
