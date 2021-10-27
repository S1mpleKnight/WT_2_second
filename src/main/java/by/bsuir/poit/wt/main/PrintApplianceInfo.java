package by.bsuir.poit.wt.main;

import by.bsuir.poit.wt.entity.Appliance;

/**
 * Representation of response for the requested appliances
 *
 * @author 		Ivan Zeliazinski
 * @version 	1.0
 */
public class PrintApplianceInfo {
	/**
	 * Print the appliance data
	 *
	 * @param appliance data to include in response
	 * @see Appliance
	 */
	public static void print(Appliance appliance) {
		System.out.println(appliance);
	}
}
