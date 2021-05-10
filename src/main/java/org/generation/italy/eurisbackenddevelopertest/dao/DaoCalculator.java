package org.generation.italy.eurisbackenddevelopertest.dao;

import org.generation.italy.eurisbackenddevelopertest.model.Price;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class DaoCalculator extends DaoProducts implements IDaoCalculator{

    public DaoCalculator( @Value("${db.address}") String dbAddress,
                        @Value("${db.user}") String user,
                        @Value("${db.psw}") String password ) {
        super( dbAddress, user, password );
    }

    private Price getPrice( String serialNumber ) {
        return new Price( product( serialNumber ).getPrice() );
    }

    @Override
    public String sum( String serialNumberA, String serialNumberB ) {

        Price priceA = getPrice( serialNumberA );
        Price priceB = getPrice( serialNumberB );


        Price sum = new Price();
        sum.setP( priceA.getP() + priceB.getP());
        sum.setS( priceA.getS() + priceB.getS());
        sum.setD( priceA.getD() + priceB.getD());

        int p = sum.getP();
        int s = sum.getS();
        int d = sum.getD();

        return "{ \" sum \": \"" + (p != 0 ? p + "p " : "") + (s != 0 ? s + "s " : "") + (d != 0 ? d + "d " : "") + "\"}";
    }

    @Override
    public String sub( String serialNumberA, String serialNumberB ) {
        Price priceA = getPrice( serialNumberA );
        Price priceB = getPrice( serialNumberB );

        Price sub = new Price();
        sub.setP( priceA.getP() - priceB.getP());
        sub.setS( priceA.getS() - priceB.getS());
        sub.setD( priceA.getD() - priceB.getD());

        sub.negShillingTakePound();
        sub.negPenceTakeShilling();

        int p = sub.getP();
        int s = sub.getS();
        int d = sub.getD();

        return "{ \" sub \": \"" + (p != 0 ? p + "p " : "") + (s != 0 ? s + "s " : "") + (d != 0 ? d + "d " : "") + "\"}";

    }

    @Override
    public String mult( String serialNumber, int times ) {
        Price price = getPrice( serialNumber );
        Price mult = new Price();
        mult.setP( price.getP() * times);
        mult.setS( price.getS() * times);
        mult.setD( price.getD() * times);

        int p = mult.getP();
        int s = mult.getS();
        int d = mult.getD();

        return "{ \" mult \": \"" + (p != 0 ? p + "p " : "") + (s != 0 ? s + "s " : "") + (d != 0 ? d + "d " : "") + "\"}";
    }

    @Override
    public String div( String serialNumber, int times ) {

        Price price = getPrice( serialNumber );

        int p = price.getP();
        int s = price.getS();
        int d = price.getD();

        Price div = new Price();
        div.setP( p / times);
        div.setS( s / times);
        div.setD( d / times);

        Price rest = new Price();
        rest.setP( p % times);
        rest.setS( s % times);
        rest.setD( d % times);

        p = div.getP();
        s = div.getS();
        d = div.getD();
        int restP = rest.getP();
        int restS = rest.getS();
        int restD = rest.getD();

        return "{ \" div \": \"" + (p != 0 ? p + "p " : "") + (s != 0 ? s + "s " : "") + (d != 0 ? d + "d " : "")
                + " ( " + (restP != 0 ? restP + "p " : "") + (restS != 0 ? restS + "s " : "") + (restD != 0 ? restD + "d " : "") + " )\"}";
    }
}
