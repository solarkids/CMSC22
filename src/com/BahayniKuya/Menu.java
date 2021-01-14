package com.BahayniKuya;

/**
 * Products and prices and designated methods for the product classes.
 */
public interface Menu {

    int sisig = 50;
    int tocilog = 45;
    int tapsilog = 60;

    /**
     *
     * @return supposed to return the product name along with it's price in a String format for receipt.
     */
    String product();

    /**
     *
     * @return returns the product's price in the int format for calculations.
     */
    int price();

}
