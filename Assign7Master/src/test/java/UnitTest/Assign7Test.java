package UnitTest;

import org.junit.jupiter.api.Test;

public class Assign7Test {
	
	@Test
	public void Assign7Test() {
		double firstValue = 20.00;
        double secondValue = 80.00;
        double totalValue = (firstValue + secondValue) * 100.00;
        System.out.println("Total value = " + totalValue);
        double remainder = totalValue % 40.00;
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder) {
                    System.out.println("The remainder is " + remainder);

        }
	}

}
