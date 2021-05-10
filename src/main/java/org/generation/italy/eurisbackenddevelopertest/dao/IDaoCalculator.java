package org.generation.italy.eurisbackenddevelopertest.dao;

public interface IDaoCalculator {

    /**
     * Method that sums the prices of two products taken from their serial numbers
     * from the database and returns a String JSON with the sums
     * @param serialNumberA String value of the serial number of the first product
     * @param serialNumberB String value of the serial number of the second product
     * @return String JSON of the sum
     */
    String sum (String serialNumberA, String serialNumberB);

    /**
     * Method that subtract the prices of second product from the first product taken from their serial numbers
     * from the database and returns a String JSON with the subtraction
     * @param serialNumberA String value of the serial number of the first product
     * @param serialNumberB String value of the serial number of the second product
     * @return String JSON of the subtraction
     */
    String sub (String serialNumberA, String serialNumberB);

    /**
     * Method that multiply the prices of a product taken from its serial number
     * from the database with a number of times from parameter and returns a String JSON with the multiplication
     * @param serialNumber String value of the serial number of the product
     * @param times int value of the numbers of times to multiply
     * @return String JSON of the multiplication
     */
    String mult (String serialNumber, int times);

    /**
     * Method that divide the prices of a product taken from its serial number
     * from the database with a number of times from parameter and returns
     * a String JSON with the division and the rest between ()
     * @param serialNumber String value of the serial number of the product
     * @param times int value of the numbers of times to divide
     * @return String JSON of the division
     */
    String div (String serialNumber, int times);
}
