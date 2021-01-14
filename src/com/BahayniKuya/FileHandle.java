package com.BahayniKuya;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * File handle class which creates/open a filename of the LocalDate.now()
 */
public class FileHandle {
    int orderNumber = 0;
    PrintWriter outputFile = new PrintWriter("C:\\Users\\Asus\\Desktop\\Java file practices\\"+ LocalDate.now()+" sales.txt");

    /**
     *
     * @throws FileNotFoundException unlike File class PrintWriter class throws FileNotFoundException.
     */
    public FileHandle() throws FileNotFoundException {
    }

    /**
     * Method to write or print a line/s on the file.
     *
     * @param content Recieves userInput/order from the main class.
     * @return Returns the String representation of what was supposed to be written on the file.
     */
    public String write(String content) {
        if(content.equals("done")){
            outputFile.println("Order " + orderNumber + " served at: "+ LocalTime.now() + "\n");
            orderNumber++;
            return "Order " + orderNumber;
        } else if (content.equals("close")){
            outputFile.println("The store is closed at "+ LocalTime.now());
            return "The store is closed";
        }else if (content.equals("sisig")||content.equals("tocilog")||content.equals("tapsilog")){
            outputFile.println(content.toUpperCase());
            return content.toUpperCase();
        }

        return content.toUpperCase();

    }

    /**
     * closes the file.
     */
    public void close() { outputFile.close(); }

}
