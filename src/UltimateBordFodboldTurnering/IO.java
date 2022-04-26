package UltimateBordFodboldTurnering;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

public interface IO {

    void getTeamNames(Connection c) throws IOException;

    void getTeamPlayers(Connection c) throws IOException;
    public void findPlayerPartialInput(Connection c);

    public void getTeamScores();


    public void getScheduledMatches() throws IOException;
    //public String[] loadTeamData();
    //ArrayList<String> loadPlayerData();
}