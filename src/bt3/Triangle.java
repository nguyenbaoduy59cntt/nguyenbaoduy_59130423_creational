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
public class Triangle extends Shape{

    private static Triangle instance = null;

    protected Triangle() {
    }
    
    public static Triangle getInstance()
    {
        if(instance == null)
        {
            return new Triangle();
        }
        return instance;
    }
    @Override
    public String draw() {
        return "Vẽ hình tam giác" ;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
