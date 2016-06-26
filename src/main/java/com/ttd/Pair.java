package com.ttd;

/**
 * Created by Grzesiek on 2016-06-26.
 */
public class Pair {
    private String from;
    private String to;
    Pair(String from,String to){
        this.from=from;
        this.to=to;
    }

    @Override
    public boolean equals(Object obj) {
        Pair pair=(Pair)obj;
        return from.equals(pair.from)&&to.equals(pair.to);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
