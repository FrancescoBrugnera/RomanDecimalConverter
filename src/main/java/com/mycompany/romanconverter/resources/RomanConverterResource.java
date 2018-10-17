/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.romanconverter.resources;

import com.google.common.net.MediaType;
import com.mycompany.romanconverter.model.RomanConverter;
import javax.enterprise.inject.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author francesco
 */
@Path("/conversion")
public class RomanConverterResource {
    
    RomanConverter romanConverter = new RomanConverter();
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
        public String toRoman(int number) {
        int l =  mapBase.floorKey(number);
        if ( number == l ) {
            return mapBase.get(number);
        }
        return mapBase.get(l) + toRoman(number-l);
    }
    
    
}
