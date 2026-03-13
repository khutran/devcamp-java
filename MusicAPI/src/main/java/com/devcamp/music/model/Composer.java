package com.devcamp.music.model;

public class Composer extends Person {
    private String stagename;

    public Composer() {
    }

    public Composer(String fn, String ln, String sn) {
        super(fn, ln);
        this.stagename = sn;
    }

    public String getStageName() {
        return stagename;
    }

    public void setStagename(String stagename) {
        this.stagename = stagename;
    }
}
