package com.tijch04;

/* Adapter Pattern the API (well part of the API) of the Math class is wrapped by MathRunner, additional functionality is added for clients
but the type of functionality, in this case Mathematical computation is consistent with the adapted class or is instrumentation
* Key point clients of MathRunner are using it for the services they would otherwise get from Math*/

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathRunner {
    //static - class level functionality
    private static int allInstancesTotalMethodCalls = 0; /*private field accessed only by this class*/

    public static int getAllInstancesTotalMethodCalls(){ /*public method part of the API of the class - this method can be accessed
    from any other class/object*/
        return allInstancesTotalMethodCalls;
    }

    //non static - instance of class functionality
    private int thisInstanceTotalMethodCalls;

    public MathRunner(){ //constructor
        thisInstanceTotalMethodCalls = 0;
    }

    private void incrementMethodCalls(){
        allInstancesTotalMethodCalls++;
        thisInstanceTotalMethodCalls++;
    }

    public int getThisInstanceTotalMethodCalls() {
        return thisInstanceTotalMethodCalls;
    }

    //how would you document this - what are the limitations/things you would look at?
    public BigDecimal getPI(int scale){
        incrementMethodCalls();
        BigDecimal piAsBigDecimal = new BigDecimal(String.valueOf(Math.PI)); /*BigDecimal needs a String due to precision
        requirements not met by float or double*/
        return piAsBigDecimal.setScale(scale, RoundingMode.HALF_UP);
    }

    public int max(int a, int b){
        incrementMethodCalls();
        return Math.max(a,b);
    }
}
