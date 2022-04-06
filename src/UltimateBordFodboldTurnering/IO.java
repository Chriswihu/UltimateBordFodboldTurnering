package UltimateBordFodboldTurnering;

import java.io.IOException;

public interface IO {

    public void getTeamNames() throws IOException;
    public void getTeamPlayers() throws IOException;
    public void getTeamScores();
}