/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;


/**
 *
 * @author Admin
 */
public class MainActivity {
    public static void main(String[] args) {
        MyStringBuilder mystr =  new MyStringBuilder.Builder().addString("Bai tap 2_Creational ").addFloat(10).addBool(true).Builder();
        System.out.println(mystr);
    }
}
