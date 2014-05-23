
import Library.Alphabet;
import Library.FrequencyAnalyseFr;

import java.util.HashMap;

/**
 * Created by nicolas on 10/03/14.
 * @author Edouard SOUAN-MARCELON
 * @author Nicolas MACHUT
 * @author Kim SAVAROCHE
 * machut.nicolas@gmail.com
 *
 * * This class crypt and decrypt whith Permutation Crypting as it's name suggests !
 */
public class Permutation{

    //Variable
    private HashMap<String, String> association = new HashMap<String, String>();
    private String m_readableString, m_cryptedString="";
    private Alphabet m_alphabet;
    //End variable

    public Permutation()
    {
        m_alphabet = new Alphabet();
    }

    //This method crypt a string using permutation crypting
    public void Crypting(String p_textToCrypt)
    {

        this.m_readableString = p_textToCrypt;

        System.out.println("String to crypt : "+this.m_readableString);

        String permutString;
        for(int i = 0; i < this.m_readableString.length(); i++)
        {
            if(!association.containsKey(String.valueOf(this.m_readableString.charAt(i))))
            {
                permutString = this.GetVacantRandomLetter();
                //System.out.println("On ajoute la lettre : "+this.m_stringToCrypt.charAt(i)+" permutée avec : "+permutString);
                this.association.put(String.valueOf(this.m_readableString.charAt(i)), permutString);
            }

            this.m_cryptedString += this.association.get(String.valueOf(this.m_readableString.charAt(i)));
        }
        System.out.println("Crypted String : "+this.m_cryptedString);
    }

    //Return random int beetwen 0 to alphabet's length
    protected int GetRandom()
    {
        int maxValue = this.m_alphabet.getLatin().length;
        return (int)(Math.random() * (maxValue));
    }

    //This method return a letter in alphabet's tab which is not in this.association
    public String GetVacantRandomLetter()
    {
        String letter = "";
        Boolean find = false;
        int random = GetRandom();

        while(!find)
        {
            if(this.association.containsValue(this.m_alphabet.getLatin()[random]))
            {
                random = GetRandom();
            }
            else
            {
                letter = this.m_alphabet.getLatin()[random];
                find = true;
            }
        }
        return letter;
    }

    public HashMap<String, String> getAssociation()
    {
        return this.association;
    }

    // Void pour le moment, à changer après
    //String tried = uncryptedString.replace("D","e");
    //tried = tried.replace("E","a");
    public void lol()
    {
        String uncryptedString = this.m_cryptedString;

        // analyse fréquentielle mnono
        FrequencyAnalyseFr frequencyAnalyseFr = new FrequencyAnalyseFr();
        frequencyAnalyseFr.setTextToAnalyse(m_cryptedString);
        HashMap<String, Double> lettersFrequencyMono = frequencyAnalyseFr.CalculCharFrequency();


    }

    public String GetcryptedString(){return m_cryptedString;}

  /*  public HashMap<String,String> tryToUncrypt(String p_letterToUncrypt)
    {
        this.association.put(p_letterToUncrypt,GetVacantRandomLetter(p_letterToUncrypt))
    }*/
}
