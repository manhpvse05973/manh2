/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkShop4A;

import java.util.ArrayList;

/**
 *
 * @author Linh Trang
 */
public class Manager {
    static Book b = new Book();
    static ArrayList arr = new ArrayList<Book>();
    public static void add(String ID,String name,int quan,float price){
        arr.add(new Book(ID, name, quan, price));
    }
}
