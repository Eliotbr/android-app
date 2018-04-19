package me.echeung.moemoekyun.api.endpoints;

public class Kpop extends Library {

    public static final Library INSTANCE = new Kpop();

    public static final String NAME = "kpop";

    private Kpop() {
        super(NAME, "wss://listen.moe/kpop/gateway", "https://listen.moe/kpop/fallback");
    }

}
