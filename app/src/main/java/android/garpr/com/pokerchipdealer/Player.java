package android.garpr.com.pokerchipdealer;

/**
 * Created by Joey A. on 07/12/2016.
 */
public class Player {

    public int m_balance;
    public String m_name;
    public int m_id;
    public static int NUM_PLAYERS = 0;

    public Player(String name, int balance)
    {
        m_balance = balance;
        m_name = name;

        m_id = NUM_PLAYERS;
        NUM_PLAYERS++;
    }
}
