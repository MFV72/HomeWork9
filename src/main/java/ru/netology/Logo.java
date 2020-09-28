package ru.netology;

public class Logo {
    private long paretnID;
    private String logo; //* адрес картинки

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public long getParetnID() {
        return paretnID;
    }

    public void setParetnID(long paretnID) {
        this.paretnID = paretnID;
    }

    private String color;
}
