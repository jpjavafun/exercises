/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jp.transactionmanagementstudy;

/**
 *
 * @author jpaisley
 */
public interface BookShop {

    public void purchase(String isbn, String username);
    public void increaseStock(String isbn, int stock);
    public int checkStock(String isbn);
}