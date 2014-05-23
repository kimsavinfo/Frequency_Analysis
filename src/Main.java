import Library.FrequencyAnalyseFr;
import Library.WordToNormalize;

import java.util.HashMap;

/**
 * Created by kimsavinfo on 22/05/14.
 */
public class Main
{
    private static WordToNormalize m_wordToNormalizer = new WordToNormalize();
    private static FrequencyAnalyseFr m_frequencyAnalyseFr = new FrequencyAnalyseFr();
    private static String m_textTest;
    private static HashMap<String, Double> m_lettersFrequency;


    public static void main(String[] args)
    {
        m_textTest = m_wordToNormalizer.normalize(TextsTest.TextLong);

        m_frequencyAnalyseFr.setTextToAnalyse(m_textTest);

        System.out.println("");
        System.out.println("");
        System.out.println("============= 1er analyse =============");
        m_lettersFrequency = m_frequencyAnalyseFr.CalculCharFrequency();
        showCharFrequency(m_lettersFrequency);

        Permutation cryptedString = new Permutation();
        cryptedString.Crypting(m_textTest);
        m_frequencyAnalyseFr.setTextToAnalyse(cryptedString.GetcryptedString());
        m_lettersFrequency = m_frequencyAnalyseFr.CalculCharFrequency();
        showCharFrequency(m_lettersFrequency);

        cryptedString.lol();
    }



    private static void showCharFrequency(HashMap<String, Double> p_lettersFrequencies)
    {
        // Test = MUST BE DELETED/ERASE
        System.out.println("");
        System.out.println("");
        System.out.println(" CalculCharFrequency, char total : "+m_textTest.length());

        int totalChars = m_textTest.length();

        for (String key : p_lettersFrequencies.keySet())
        {
            System.out.print("key: " + key);
            System.out.print(" = " + p_lettersFrequencies.get(key)+" %");
            System.out.println("");
        }
    }
}
