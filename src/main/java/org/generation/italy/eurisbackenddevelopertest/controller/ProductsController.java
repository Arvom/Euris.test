package org.generation.italy.eurisbackenddevelopertest.controller;

import org.generation.italy.eurisbackenddevelopertest.dao.IDaoCalculator;
import org.generation.italy.eurisbackenddevelopertest.dao.IDaoProducts;
import org.generation.italy.eurisbackenddevelopertest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class ProductsController {

    private static final String MSG_OK = "{\"msg\": \"OK\"}";
    private static final String MSG_ERROR = "{\"msg\": \"ERROR\"}";

    @Autowired
    private IDaoProducts daoProducts;

    @Autowired
    private IDaoCalculator daoCalculator;

    @GetMapping
    public List<Product> products(){
        return daoProducts.products();
    }

    @GetMapping("/{serialNumber}")
    public Product product( @PathVariable String serialNumber ){
        return daoProducts.product( serialNumber );
    }

    @PostMapping
    public String post(@RequestBody Product product){
        return daoProducts.add( product ) ? MSG_OK : MSG_ERROR;
    }

    @PutMapping
    public String put(@RequestBody Product product){
        return daoProducts.edit( product ) ? MSG_OK : MSG_ERROR;
    }

    @DeleteMapping("/{serialNumber}")
    public String put(@PathVariable String serialNumber){
        return daoProducts.delete( serialNumber ) ? MSG_OK : MSG_ERROR;
    }

    @GetMapping("/sum/{serialNumberA}&{serialNumberB}")
    public String sum(@PathVariable String serialNumberA, @PathVariable String serialNumberB  ){
        return daoCalculator.sum( serialNumberA, serialNumberB );
    }

    @GetMapping("/sub/{serialNumberA}&{serialNumberB}")
    public String sub(@PathVariable String serialNumberA, @PathVariable String serialNumberB  ){
        return daoCalculator.sub( serialNumberA, serialNumberB );
    }

    @GetMapping("/mult/{serialNumberA}&{times}")
    public String mult(@PathVariable String serialNumberA, @PathVariable int times ){
        return daoCalculator.mult( serialNumberA, times );
    }

    @GetMapping("/div/{serialNumberA}&{times}")
    public String div(@PathVariable String serialNumberA, @PathVariable int times  ){
        return daoCalculator.div( serialNumberA, times );
    }
}
