package UltimateBordFodboldTurnering;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;

public interface IO
{
    void findPlayerPartialInput(Connection c, String userInput) throws IOException;
    void findTeamPartialInput(Connection c, String userInput);
    void addExistingPlayerToTeam(Connection c, int playerID, int teamID);
    void deleteExistingPlayerFromTeam(Connection c, int playerID);
    void getTop8Teams(Connection c);
    void showAllPLayerID(Connection c);
    void showAllTeamID(Connection c);
    void showAllPlayersInTeam(Connection c, int teamID);
}