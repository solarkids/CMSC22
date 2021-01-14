package com.BahayniKuya;

public class Sisig implements Menu{
    @Override
    public String product() {
        return "Sisig --- 50";
    }

    @Override
    public int price() {
        return Menu.sisig;
    }
}
