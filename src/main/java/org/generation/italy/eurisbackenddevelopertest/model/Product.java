package org.generation.italy.eurisbackenddevelopertest.model;

import org.generation.italy.eurisbackenddevelopertest.util.IMappablePro;

public class Product implements IMappablePro {

    private String serial_number;
    private String name;
    private String price;

    public Product() {
    }

    public Product( String serialnumber, String name, String price ) {
        this.serial_number = serialnumber;
        this.name = name;
        this.price = price;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number( String serial_number ) {
        this.serial_number = serial_number;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice( String price ) {
        this.price =  price;
    }


    @Override
    public String toString() {
        return "{\"serialnumber\" : " + (serial_number == null ? null : "\"" + serial_number + "\"") +
                ",\"name\" : " + (name == null ? null : "\"" + name + "\"") +
                ",\"price\" : " + (price == null ? null : "\"" + price + "\"") + "}";
    }
}
