package com.devcamp.music.model;

public class BandMember extends Composer {
    private String instrument;

    public BandMember() {
    }

    public BandMember(String fn, String ln, String sn, String inst) {
        super(fn, ln, sn);
        this.instrument = inst;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }
}
