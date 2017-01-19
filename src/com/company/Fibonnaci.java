package com.company;

/**
 * Created by wy733 on 1/19/17.
 */
public class Fibonnaci {
    public static boolean isFibonacci( int testedNumber, int a , int b )
    {
        if( testedNumber == 0 || testedNumber == 1 )
            return true;
        int nextFib = a + b;
        if( nextFib > testedNumber )
            return false;
        else if( nextFib == testedNumber )
            return true;
        else
            isFibonacci( testedNumber, b, nextFib );
        return false;
    }

}
