/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salsa_18052024;

/**
 *
 * @author Salsabilla Humayhira saputri
 */
public class FpbRecursive {
    public static int fpb(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return fpb(y, x % y);
        }
    }

    public static void main(String[] args) {
        int x = 14;
        int y = 6;
        System.out.println("FPB dari " + x + " dan " + y + " adalah " + fpb(x, y));
    }
}

