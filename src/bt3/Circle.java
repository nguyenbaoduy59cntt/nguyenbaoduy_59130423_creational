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
public class Circle extends Shape{
    private static Circle instance = null;

    protected Circle() {
    }
    
    public static Circle getInstance()
    {
        if(instance == null)
        {
            return new Circle();
        }
        return instance;
    }
    
    @Override
    public String draw() {
        return "Vẽ hình tròn";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
