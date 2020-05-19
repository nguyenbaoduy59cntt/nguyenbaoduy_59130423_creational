/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Admin
 */
public class Rectangle extends Shape{
  
    private static Rectangle instance = null;

    protected Rectangle() {
    }
    
    public static Rectangle getInstance()
    {
        if(instance == null)
        {
            return new Rectangle();
        }
        return instance;
    }
            
    @Override
    public String draw() {
        return "Vẽ hình chữ nhật";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
