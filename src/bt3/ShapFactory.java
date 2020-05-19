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
public class ShapFactory {

    private ShapFactory() {
    }
    
    public static Shape getShape(ShapType shapType)
    {
        switch(shapType)
        {
            case Circle:
                return new Circle();
            case Rectangle:
                return new Rectangle();
            case Triangle:
                return new Triangle();
            default:
                throw new IllegalArgumentException("Chưa hỗ trợ vẽ hình này!!!");
        }
    }
}
