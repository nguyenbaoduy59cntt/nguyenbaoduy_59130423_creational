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
public class MainActivity {
    public static void main(String[] args) {
        Shape s1 = Circle.getInstance();
        System.out.println(s1.draw());
        Shape s2 = Triangle.getInstance();
        System.out.println(s2.draw());
    }
}
