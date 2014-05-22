package Library;

import java.util.HashMap;

/**
 * Created by kimsavinfo on 22/05/14.
 */
public class FrequencyAnalyseFr
{
    private static Alphabet alphabet = new Alphabet();
    private String m_textToAnalyse;

    public FrequencyAnalyseFr()
    {
        m_textToAnalyse = new String();
    }

    public void setTextToAnalyse(String p_textToAnalyse)
    {
        m_textToAnalyse = p_textToAnalyse;
    }

    /**
     * How many times each char is present in the text ?
     * @return HashMap<String, nbTimes>
     */
    public HashMap<String, Double>  CharPresence()
    {
        HashMap<String, Double> presence = new HashMap<String, Double>();
        String[] alphabet = new Alphabet().getLatin();

        // Initialize the dico frequency
        int alphabetLenght = alphabet.length;
        for(int iChar = 0; iChar < alphabetLenght; iChar++)
        {
            presence.put(alphabet[iChar], (double)0);
        }

        String textUpperCase = m_textToAnalyse.toUpperCase();
        String key;
        Double value;

        int textLenght = m_textToAnalyse.length();
        for(int iText = 0; iText < textLenght; iText++)
        {
            key = Character.toString( textUpperCase.charAt(iText) );

            if( presence.containsKey(key) )
            {
                value = presence.get(key);
                value++;
                presence.put(key, value );
            }
        }

        return presence;
    }

    /**
     * Calculate the frequency (%) of each alphabet's character in the text
     * Map <string, frequency>
     * @return chars with their frequency in the text
     */
    public HashMap<String, Double>  CalculCharFrequency()
    {
        HashMap<String, Double> frequency = this.CharPresence();
        int totalChars = m_textToAnalyse.length();

        for (String key : frequency.keySet())
        {
            frequency.put(key, frequency.get(key)/totalChars*100);

        }

        return (HashMap<String, Double>)MapManager.sortByComparator(frequency, false);
    }

}
