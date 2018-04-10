/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentOrientation.util;

/**
 *
 * @author Megh Shah
 */
public class Results implements StdoutDisplayInterface {

    
    /**
     * default constructor
     */
    public Results(){
    
        
    }
    /**
     * Stdout Display Function
     * @param strIn String to be displayed to stdout.
     */
   
    @Override
    public void stdoutDisplay(String strIn) {
        System.out.println(strIn);
    }
    
    
}
