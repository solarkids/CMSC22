package com.BahayniKuya;

import java.util.ArrayList;

/**
 * Class responsible for Calculations and Receipt formulation.
 */
public class Calculate {

    int total = 0;

    ArrayList<String> arr = new ArrayList<>();

    /**
     * This method adds items on the list.
     * And adds an item to the total summation.
     *
     * @param order recieves userInput.
     * @return returns String representaion of the order/userInput.
     */
    public String addItem(String order) {
        if(order.equals("sisig")){
            arr.add(new Sisig().product());
            total += new Sisig().price();
        } else if (order.equals("tocilog")){
            arr.add(new Tocilog().product());
            total += new Tocilog().price();
        } else if (order.equals("tapsilog")){
            arr.add(new Tapsilog().product());
            total += new Tapsilog().price();
        }
        return order;
    }

    /**
     * Displays the items for receipt purposes.
     *
     * @return return 0 if executed properly.
     */
    public int displayItems() {
        String[] arrayList = arr.toArray(new String[arr.size()]);
        for(String items : arrayList)
            System.out.println(items);
        System.out.println("Total amout :"+total+"\n");
        total = 0;
        arr.clear();
        return 0;
    }
}
