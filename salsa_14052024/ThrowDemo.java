/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salsa_14052024;

/**
 *
 *@author Salsabilla Humayhira saputri
 */
public class ThrowDemo {

    public static void main(String[] args) {
        String input = "invalid input";
        try {
            if (input.equals("invalid input")){
                throw new MyException("input");
            } else {
                System.out.println(input);
            }
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
