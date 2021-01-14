package com.BahayniKuya;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CashRegisterTest {

    @Test
    public void GetOrderTest(){
        GetOrder newOrder = new GetOrder();
        assertEquals("sisig",newOrder.getOrderName("sisig"));
    }
    @Test
    public void MenuTest(){
        Menu price = null;
        assertEquals(50,price.sisig);
        assertEquals(45,price.tocilog);
        assertEquals(60,price.tapsilog);
    }
    @Test
    public void CalculateAddItemsTest(){
        Calculate item = new Calculate();
        GetOrder newOrder = new GetOrder();
        String input = "sisig";
        assertEquals("sisig", item.addItem(newOrder.getOrderName(input)));
    }
    @Test
    public void CalculateDisplayItemsTest(){
        Calculate item = new Calculate();
        assertEquals(0,item.displayItems());
    }
    @Test
    public void ProductNameNPriceTest(){
        Sisig sisig = new Sisig();
        Tocilog tocilog = new Tocilog();
        Tapsilog tapsilog = new Tapsilog();

        assertEquals("Sisig --- 50", sisig.product());
        assertEquals("Tocilog --- 45", tocilog.product());
        assertEquals("Tapsilog --- 60", tapsilog.product());
        assertEquals(50, sisig.price());
        assertEquals(45, tocilog.price());
        assertEquals(60, tapsilog.price());
    }
    @Test
    public void writeTest() throws FileNotFoundException {
        FileHandle handler = new FileHandle();

        String input1 = "sisig";
        String input2 = "done";
        String input3 = "close";

        assertEquals("SISIG",handler.write(input1));
        assertEquals("Order 1",handler.write(input2));
        assertEquals("The store is closed",handler.write(input3));
    }
    @Test
    public void closeTest() throws FileNotFoundException {
        File file = new File("C:\\Users\\Asus\\Desktop\\Java file practices\\"+ LocalDate.now()+" sales.txt");
        FileHandle handler = new FileHandle();
        handler.write("sisig");
        handler.close();
        boolean isGreater = file.length() > 0;
        assertEquals(Boolean.TRUE, file.exists());
        assertEquals(Boolean.TRUE, isGreater);

    }

}
