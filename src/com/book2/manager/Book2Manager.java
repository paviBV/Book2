package com.book2.manager;

import com.book2.dao.Book2Dao;
import com.book2.entities.Book2;

import java.util.ArrayList;
import java.util.List;

public class Book2Manager {

    Book2Dao book2Dao = new Book2Dao();
    public void getBook2(){
        book2Dao.getBook2();

        for (int i = 0; i < book2Dao.bookMainList().size(); i++) {
            System.out.println(book2Dao.bookMainList().get(i));
        }
    }
    public  void bookMainList(){

        for (int i = 0; i <  book2Dao.bookMainList().size(); i++) {
            if ( book2Dao.bookMainList().get(i).getbId()=="B002") {
                System.out.println( book2Dao.bookMainList().get(i));
            }
        }

    }

}
