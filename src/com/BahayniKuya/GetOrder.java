package com.BahayniKuya;

/**
 * Storing and accessing the userInput.
 */
public class GetOrder {

    String order;

    /**
     * a Getter constructor.
     *
     * @param order gets the user's input;
     * @return returns the user's input in String representation.
     */
    public String getOrderName(String order) {
        return order;
    }

    /**
     * a Setter constructor.
     *
     * @param order user's input will be set as the order name.
     */
    public void setOrderName(String order){
       this.order = order;
    }
}
