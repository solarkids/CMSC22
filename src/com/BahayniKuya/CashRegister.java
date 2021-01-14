package com.BahayniKuya;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This is the main class where everything will be executed and called.
 *
 * @author Gab4short
 * @version 1.0
 */
public class CashRegister {
    /**
     * Main method for execution.
     * While user's input is not close the program will not close.
     * While user's input is not done the program will not display or show the receipt.
     * As long as the user's input is a product from the class i.e. sisig or tocilog,
     * it will be written in the file.
     *
     * @param args command line arguments.
     * @throws FileNotFoundException exception for filehandling part.
     */
    public static void main(String[] args) throws FileNotFoundException {
        GetOrder item = new GetOrder();
        Calculate work = new Calculate();
        Scanner scanner = new Scanner(System.in);
        FileHandle fileHandle = new FileHandle();
        String order = "";
        while(!order.equals("close")){
            System.out.print("Enter item: ");
            order = scanner.nextLine();
            item.setOrderName(order);
            work.addItem(item.getOrderName(order));
            fileHandle.write(item.getOrderName(order));
            if(order.equals("done")) {
                work.displayItems();
            }
        }
        if(order.equals("close")){
            fileHandle.close();
            System.out.println("\nThe store is closing\n");
        }
    }
}
