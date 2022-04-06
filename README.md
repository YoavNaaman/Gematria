# Gematria
Hebrew Gematria is easy to use calculation library for java.

- Returns the gematria value.
- Return small gematria valua.

## Usage example
```
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

```

-----

output example:

Orig value: dssds

Gematria: 0

Small Gematria: 0

-----

Orig value: 21432 ew frdef!@#$%

Gematria: 0

Small Gematria: 0

-----

Orig value: אבא

Gematria: 4

Small Gematria: 4

-----

Orig value: יואב נעמן

Gematria: 229

Small Gematria: 4

-----

Orig value:

Gematria: 0

Small Gematria: 0

-----

Orig value: אבגדהוזחטיכלמנסעפצקרשתץףךםן

Gematria: 1775

Small Gematria: 2
