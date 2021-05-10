package org.generation.italy.eurisbackenddevelopertest.dao;

import org.generation.italy.eurisbackenddevelopertest.model.Product;
import org.generation.italy.eurisbackenddevelopertest.util.BasicDao;
import org.generation.italy.eurisbackenddevelopertest.util.IMappablePro;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class DaoProducts extends BasicDao implements IDaoProducts {

    public DaoProducts( @Value("${db.address}") String dbAddress,
                        @Value("${db.user}") String user,
                        @Value("${db.psw}") String password ) {
        super( dbAddress, user, password );
    }

    @Override
    public List<Product> products() {
        List<Product> ris = new ArrayList<>();
        List<Map<String, String>> data = getAll( "SELECT * FROM products" );
        for(Map<String, String> map : data){
            ris.add( IMappablePro.fromMap( Product.class, map ) );
        }
        return ris;
    }

    @Override
    public Product product( String serialNumber ) {
        Map<String, String> map = getOne( "SELECT * FROM products WHERE serial_number = ?", serialNumber );
        if (map != null){
            return IMappablePro.fromMap( Product.class, map );
        }
        return null;
    }

    @Override
    public boolean add( Product product ) {
        if(product != null){
            return executeAndIsModified( "INSERT INTO products (serial_number, name, price) values (?, ?, ?)", product.getSerial_number(), product.getName(), product.getPrice() );
        }
        return false;
    }

    @Override
    public boolean edit( Product product ) {
        if(product != null){
            return executeAndIsModified( "UPDATE products SET name = ?, price = ? WHERE serial_number = ?", product.getName(), product.getPrice(), product.getSerial_number() );
        }
        return false;
    }

    @Override
    public boolean delete( String serialNumber ) {
        return executeAndIsModified( "DELETE FROM products WHERE serial_number = ?", serialNumber );
    }

}
