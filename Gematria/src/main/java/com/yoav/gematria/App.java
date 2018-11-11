package com.yoav.gematria;

/**
 * Gematria example!
 *
 */
public class App 
{
	static String[] input = new String[] {"dssds"," ","21432 ew frdef!@#$%", "אבא", "יואב נעמן", "","אבגדהוזחטיכלמנסעפצקרשתץףךםן"};
    public static void main( String[] args )
    {
        IGematria gematria = new GematrisCalculator();
        for (String inputValue : input) {
        	System.out.println("Orig value: " + inputValue);
        	GematriaResult gematriaResult = gematria.gematria(inputValue);
        	System.out.println("Gematria: "+ gematriaResult.getResult());
        	System.out.println("Small Gematria: "+ gematriaResult.getSmallResult());
			
		}
    }
}
