/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.romanconverter.model;

import java.util.TreeMap;

/**
 *
 * @author francesco
 */
public class RomanConverter {
    
    private static TreeMap<Integer, String> mapBase = new TreeMap<Integer, String>();
    
    public RomanConverter(){
    
        mapBase.put(1000, "M");
        mapBase.put(900, "CM");
        mapBase.put(500, "D");
        mapBase.put(400, "CD");
        mapBase.put(100, "C");
        mapBase.put(90, "XC");
        mapBase.put(50, "L");
        mapBase.put(40, "XL");
        mapBase.put(10, "X");
        mapBase.put(9, "IX");
        mapBase.put(5, "V");
        mapBase.put(4, "IV");
        mapBase.put(1, "I");
    }
}
