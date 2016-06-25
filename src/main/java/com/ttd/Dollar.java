package com.ttd;

import com.sun.deploy.resources.Deployment_pt_BR;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public class Dollar {

    int amount;

    public Dollar(int amount){
        this.amount=amount;
    }
    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }

    @Override
    public boolean equals(Object obj) {
        Dollar dollar=(Dollar)obj;
        return amount==dollar.amount;
    }
}
