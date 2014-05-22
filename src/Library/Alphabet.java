package Library;

import java.util.HashMap;

/**
 * Created by kimsavinfo on 22/05/14.
 */
public class Alphabet
{
    private final String[] m_latin;
    private final HashMap<String, Double> m_monogrammeFr;
    private final HashMap<String, Double> m_bigrammeFr;
    private final HashMap<String, Double> m_trigrammeFr;

    public Alphabet()
    {
        m_latin = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T" ,"U", "V", "W", "X", "Y", "Z"};
        m_monogrammeFr = new HashMap<String, Double>();
        m_bigrammeFr = new HashMap<String, Double>();
        m_trigrammeFr = new HashMap<String, Double>();
    }

    private void setMonogrammeFr()
    {
        m_monogrammeFr.put("A", 8.40);
        m_monogrammeFr.put("B", 1.06);
        m_monogrammeFr.put("C", 3.03);
        m_monogrammeFr.put("D", 4.18);
        m_monogrammeFr.put("E", 17.26);
        m_monogrammeFr.put("F", 1.12);
        m_monogrammeFr.put("G", 1.27);
        m_monogrammeFr.put("H", 0.92);
        m_monogrammeFr.put("I", 7.34);
        m_monogrammeFr.put("J", 0.31);
        m_monogrammeFr.put("K", 0.05);
        m_monogrammeFr.put("L", 6.01);
        m_monogrammeFr.put("M", 2.96);
        m_monogrammeFr.put("N", 7.13);
        m_monogrammeFr.put("O", 5.26);
        m_monogrammeFr.put("P", 3.01);
        m_monogrammeFr.put("Q", 0.99);
        m_monogrammeFr.put("R", 6.55);
        m_monogrammeFr.put("S", 8.08);
        m_monogrammeFr.put("T", 7.07);
        m_monogrammeFr.put("U", 5.74);
        m_monogrammeFr.put("V", 1.32);
        m_monogrammeFr.put("W", 0.04);
        m_monogrammeFr.put("X", 0.45);
        m_monogrammeFr.put("Y", 0.30);
        m_monogrammeFr.put("Z", 0.12);
    }

    private void setBigrammeFr()
    {
        m_bigrammeFr.put("ES", 3.318);
        m_bigrammeFr.put("DE", 2.409);
        m_bigrammeFr.put("LE", 2.366);
        m_bigrammeFr.put("EN", 2.121);
        m_bigrammeFr.put("RE", 1.885);
        m_bigrammeFr.put("NT", 1.694);
        m_bigrammeFr.put("ON", 1.646);
        m_bigrammeFr.put("ER", 1.514);
        m_bigrammeFr.put("TE", 1.484);
        m_bigrammeFr.put("EL", 1.382);
        m_bigrammeFr.put("AN", 1.378);
        m_bigrammeFr.put("SE", 1.377);
        m_bigrammeFr.put("ET", 1.307);
        m_bigrammeFr.put("LA", 1.270);
        m_bigrammeFr.put("AI", 1.255);
        m_bigrammeFr.put("IT", 1.243);
        m_bigrammeFr.put("ME", 1.099);
        m_bigrammeFr.put("OU", 1.086);
        m_bigrammeFr.put("EM", 1.056);
        m_bigrammeFr.put("IE", 1.030);
    }

    private void setTrigrammeFr()
    {
        m_trigrammeFr.put("ENT", 0.900);
        m_trigrammeFr.put("LES", 0.801);
        m_trigrammeFr.put("EDE", 0.630);
        m_trigrammeFr.put("DES", 0.609);
        m_trigrammeFr.put("QUE", 0.607);
        m_trigrammeFr.put("AIT", 0.542);
        m_trigrammeFr.put("LLE", 0.509);
        m_trigrammeFr.put("SDE", 0.508);
        m_trigrammeFr.put("ION", 0.477);
        m_trigrammeFr.put("EME", 0.472);
        m_trigrammeFr.put("ELA", 0.437);
        m_trigrammeFr.put("RES", 0.432);
        m_trigrammeFr.put("MEN", 0.425);
        m_trigrammeFr.put("ESE", 0.416);
        m_trigrammeFr.put("DEL", 0.404);
        m_trigrammeFr.put("ANT", 0.397);
        m_trigrammeFr.put("TIO", 0.383);
        m_trigrammeFr.put("PAR", 0.360);
        m_trigrammeFr.put("ESD", 0.351);
        m_trigrammeFr.put("TDE", 0.350);
    }

}
