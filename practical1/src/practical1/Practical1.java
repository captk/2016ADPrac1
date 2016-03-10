/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author k
 */
public class Practical1 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Line> lineList = new ArrayList();
    static int lineNum = 1;
    static boolean moreLines = true;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        while (moreLines) {
            askForLines();
            addNewLine();
            //System.out.println("while loop continues");

        }

        for (int i = lineList.size(); i > 0; i--) {
            System.out.println(lineList.get(i - 1).getLineOfTextPretty());
        }

    }

    private static void askForLines() {
        System.out.println(lineNum + ": Enter a line");
    }

    private static void addNewLine() {
        String line = in.nextLine();

        if (line.equals("")) {
            //System.out.println(lineNum + ": no more lines");
            moreLines = false;
            return;
        }
        lineList.add(new Line(line, lineNum));
        lineNum++;
        //System.out.println("new line added and lineNum incremented");
    }
}
