/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javabasics.classesandobjects;


import java.util.*;


/**
 *
 * @author jpaisley
 */
public class Deck {
    
private final static int SUITS = 4;
private final static int RANKS = 13;

private List<Card> list;
    
public Deck(){
    
    list = new ArrayList<Card>();
    initDeck();
    
    
}

private void initDeck(){
    
    for(int i=1; i<=SUITS;i++)
        for(int j=1;j<=RANKS;j++)
            list.add(new Card(i,j));
    
}
    
@Override
public String toString(){
   
    StringBuilder s = new StringBuilder();
    String NEW_LINE = System.getProperty("line.separator");
    
    for(Card c: list) {
        s.append(c.suitToString()+":"+c.rankToString()+ NEW_LINE);
    }
    
    return s.toString();
}


}
