/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

import java.util.Scanner;

/**
 *
 * @author k
 */
public class Practical1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String msg1, msg2, msg3;
        System.out.println("Enter a line");
        msg1 = in.nextLine();
        System.out.println("Enter another line");
        msg2 = in.nextLine();
        System.out.println("Enter the last line");
        msg3 = in.nextLine();
        System.out.println(msg3 + "," + msg2 + "," + msg1);
    }

}