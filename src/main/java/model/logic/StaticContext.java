/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.logic;

/**
 *
 * @author skuarch
 */
public class StaticContext {
    
    private static String context;
    
    private StaticContext(){
    }
    
    public static void setContext(String ctx){
        context = ctx;
    }

    public static String getContext() {
        return context;
    }
    
}
