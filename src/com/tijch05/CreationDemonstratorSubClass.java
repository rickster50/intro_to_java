package com.tijch05;

import com.tijch05.CreationDemonstrator;

public class CreationDemonstratorSubClass extends CreationDemonstrator {
    public CreationDemonstratorSubClass(){
        super();
    }

    @Override
    public String getName() {
        return super.getName() + " rules";
    }
}
