import Library.FrequencyAnalyseFr;
import Library.WordToNormalize;

/**
 * Created by kimsavinfo on 22/05/14.
 */
public class Main
{
    private static WordToNormalize wordToNormalizer = new WordToNormalize();
    private static FrequencyAnalyseFr frequencyAnalyseFr = new FrequencyAnalyseFr();
    private static String m_textTest;

    // Le capitaine vous souhaite un bon voyage
    // LECAPITAINEVOUSSOUHAITEUNBONVOYAGE



    public static void main(String[] args)
    {
        m_textTest = wordToNormalizer.normalize("Le capitaine vous souhaite un bon voyage");

        frequencyAnalyseFr.setTextToAnalyse(m_textTest);

    }
}
