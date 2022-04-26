package UltimateBordFodboldTurnering;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

public interface IO {

    void getTeamNames(Connection c) throws IOException;
    void getTeamPlayers(Connection c) throws IOException;
    void findPlayerPartialInput(Connection c);
    void findTeamPartialInput(Connection c);

    public void getTeamScores();


    public void getScheduledMatches() throws IOException;
    //public String[] loadTeamData();
    //ArrayList<String> loadPlayerData();
}