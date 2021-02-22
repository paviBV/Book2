package com.book2;

import com.book2.datastore.Book2DataStore;
import com.book2.manager.Book2Manager;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Book2Manager book2Manager = new Book2Manager();
        book2Manager.getBook2();
        System.out.println("Single record fetching");
        book2Manager.bookMainList();




//        for (int i = 0; i < bookMainList.size(); i++) {
//            System.out.println(bookMainList.get(i));
//        }




    }
}
