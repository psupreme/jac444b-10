/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jac444b.a2;

/**
 *
 * @author Testee
 */
public class StringHelper {
        public final static String Empty = "";    
    
        public static String GetStringBetween(String data, String start, String end, int startIndex)
        {
            int indexStart, indexEnd;
            
            indexStart = data.indexOf(start, startIndex);
            if (indexStart <= 0) return StringHelper.Empty;
            indexEnd = !end.equals(StringHelper.Empty) ? data.indexOf(end, indexStart + start.length()) : data.length();
            if (indexEnd <= 0) return StringHelper.Empty;
            if (indexStart > indexEnd) return StringHelper.Empty;
            
            return data.substring(indexStart + start.length(), indexEnd);
        }
}
