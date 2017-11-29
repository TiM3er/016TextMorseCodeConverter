package morse;


public class morse {
   static  String  morseCode[] = new String[] {".-" , "-...", "-.-.", "-..", ".", "..-.", "--.", "....","..", ".---", "-.-", ".-...", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

    static public void getMorseCode() {
        for (int i = 0 ; i < morseCode.length; i++)
        System.out.println((char)(65+i) + " -> " + morseCode[i]);
    }
}
