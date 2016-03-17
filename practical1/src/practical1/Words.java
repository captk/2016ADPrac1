/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

/**
 *
 * @author k
 */
import javax.swing.JOptionPane;

public class Words {

    public static void main(String[] args) {
        WordList ws = new WordList();
        String in;
        do {
            in = JOptionPane.showInputDialog(
                    "Click cancel to end or enter a word and click OK");
            if (in != null) {
                ws.addWord(in);
            }
        } while (in != null);
        JOptionPane.showMessageDialog(null, "Word list = " + ws.toString());
        JOptionPane.showMessageDialog(null, "First word = " + ws.getFirst());
        JOptionPane.showMessageDialog(null, "Last word = " + ws.getLast());
    }
}
