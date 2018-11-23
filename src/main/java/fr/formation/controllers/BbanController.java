package fr.formation.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.formation.partiel1.Bban;

@Path("Bban")
public class BbanController {

    private final static Map<String, Bban> BBANLIST = new HashMap<>();
    static {
	BBANLIST.put("00000000001", buildBban1());
    }

    @GET
    @Path("/partiel1/{bankCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Bban partiel1(@PathParam("bankCode") String bankCode) {
	return BBANLIST.get(BBANLIST);
    }

    private static Bban buildBban1() {
	int bankCode = 3002;
	int cashDesk = 00550;
	String accountNum = "0000157841Z";
	int keyLock = 25;
	return buildBban1();
    }
}
