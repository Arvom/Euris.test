package org.generation.italy.eurisbackenddevelopertest.dao;

import org.generation.italy.eurisbackenddevelopertest.model.Product;

import java.util.List;

public interface IDaoProducts {

    /**
     * Method to get the full list of products
     * @return an object Arraylist of Product
     */
    List<Product> products();

    /**
     * Method to get one Product from his serial number
     * @param serialNumber String value of the serial number of the product to search
     * @return an object Product
     */
    Product product (String serialNumber);

    /**
     *  Method to add a product into the database and returns a boolean
     *  true if the product is added otherwise return false
     * @param product object to add
     * @return a boolean True if the add happened
     */
    boolean add(Product product);

    /**
     * Method to edit a product into the database and returns a boolean
     * true if the product is edited otherwise return false
     * @param product object to edit
     * @return a boolean True if the edit happened
     */
    boolean edit(Product product);

    /**
     * Method to delete a product into the database and returns a boolean
     *  true if the product is deleted otherwise return false
     * @param serialNumber String value of the serial number of the product to delete
     * @return a boolean True if the delete happened
     */
    boolean delete(String serialNumber);

}
