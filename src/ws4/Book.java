/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop4A;

/**
 *
 * @author Linh Trang
 */
public class Book {
    String ID;
    String name;
    int quantity;
    float price;

    public Book() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Book(String ID, String name, int quantity, float price) {
        this.ID = ID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
