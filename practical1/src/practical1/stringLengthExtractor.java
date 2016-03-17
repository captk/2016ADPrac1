/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

import java.util.function.ToIntFunction;

/**
 *
 * @author k
 */
public class stringLengthExtractor implements ToIntFunction {

    @Override
    public int applyAsInt(Object value) {
        System.out.println("stringLengthExtractor is called");
        return ((String)value).length();
    }
    
}
