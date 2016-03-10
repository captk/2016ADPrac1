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
        Line msg1, msg2, msg3;
        int lineNum = 1;
        
        System.out.println(lineNum + ": Enter a line");
        msg1 = new Line(in.nextLine(), lineNum);
        lineNum++;

        System.out.println(lineNum + ": Enter another line");
        msg2 = new Line(in.nextLine(), lineNum);
        lineNum++;

        System.out.println(lineNum + ": Enter the last line");
        msg3 = new Line(in.nextLine(), lineNum);
        lineNum++;

        System.out.println(msg3.getLineOfTextPretty() + "," + msg2.getLineOfTextPretty()
                + "," + msg1.getLineOfTextPretty());
    }

}