
package reordenarpalabras;


public class ReordenarPalabras {
      public static String reorderSentence(String[] words) {
        String[] orderedWords = new String[words.length];

        for (String word : words) {
          
            
            int position = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
           
            
            orderedWords[position] = word.substring(0, word.length() - 1);
        }

       
        
        return String.join(" ", orderedWords);
    }
}
