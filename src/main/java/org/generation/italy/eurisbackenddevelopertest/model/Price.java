package org.generation.italy.eurisbackenddevelopertest.model;

public class Price {

    private int p;
    private int s;
    private int d;

    public Price() {
    }

    public Price( String price ) {
        String[] dividedPrice = price.split( " " );
        for ( String value : dividedPrice ) {
            if ( value.contains( "p" ) ) {
                setP( getIntValue( value ) );
            } else if ( value.contains( "s" ) ) {
                setS( getIntValue( value ) );
            } else if ( value.contains( "d" ) ) {
                setD( getIntValue( value ) );
            }
        }
    }

    private int getIntValue( String value ) {
        return Integer.parseInt( value.substring( 0, value.length() - 1 ) );
    }

    public int getP() {
        return p;
    }

    public void setP( int p ) {
        while (p <= 0) {
            s -= 20;
            p++;
        }
        this.p = p;
    }

    public int getS() {
        return s;
    }

    public void setS( int s ) {

        while (s >= 20) {
            p++;
            s -= 20;
        }
        while (s <= 0) {
            d -= 12;
            s++;
        }
        while (s <= -20) {
            p--;
            s += 20;
        }
        this.s = s;
    }

    public int getD() {
        return d;
    }

    public void setD( int d ) {
        while (d >= 12) {
            s++;
            d -= 12;
        }
        while (d <= -12) {
            s--;
            d += 12;
        }
        this.d = d;
    }

    /**
     * Checks if there are negative shilling and positive pounds,
     * then takes a pound and convert it to shilling
     */
    public void negShillingTakePound() {
        if ( p > 0 && s < 0 ) {
            p--;
            s += 20;
        }
    }

    /**
     * Checks if there are negative pence and positive shilling,
     * then takes a shilling and convert it to pence
     */
    public void negPenceTakeShilling() {
        if ( s > 0 && d < 0 ) {
            s--;
            d += 12;
        }
    }

    @Override
    public String toString() {
        return "\" price \": \"" + (p != 0 ? p + "p " : "") + (s != 0 ? s + "s " : "") + (d != 0 ? d + "d " : "") + "\"}";
    }
}
