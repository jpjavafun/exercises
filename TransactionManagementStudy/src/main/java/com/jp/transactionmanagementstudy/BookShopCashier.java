/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jp.transactionmanagementstudy;


import org.springframework.transaction.annotation.Transactional;

import java.util.*;
/**
 *
 * @author jpaisley
 */
public class BookShopCashier implements Cashier{
    
    private BookShop bookShop;

    public void setBookShop(BookShop bookShop) {
        this.bookShop = bookShop;
    }

    @Transactional
    public void checkout(List<String> isbns, String username) {
        for (String isbn : isbns) {
            bookShop.purchase(isbn, username);
        }
    }
}
