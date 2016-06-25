package com.ttd;

import com.sun.deploy.resources.Deployment_pt_BR;

/**
 * Created by Grzesiek on 2016-06-25.
 */
public class Dollar extends Money{


    public Dollar(int amount){
        super(amount);
    }
    Money times(int multiplier){
        return new Dollar(amount*multiplier);
    }



}
