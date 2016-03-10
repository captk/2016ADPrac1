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
public class Line {
    private String lineOfText;
    private int lineNum;

    public Line(String lineOfText, int lineNum) {
        this.lineOfText = lineOfText;
        this.lineNum = lineNum;
    }    
    
    public String getLineOfText() {
        return lineOfText;
    }
    
    public String getLineOfTextPretty() {
        return lineNum + ": " + lineOfText;
    }
    
    public int getLineNum() {
        return lineNum;
    }
    
}
