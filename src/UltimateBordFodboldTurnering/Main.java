package UltimateBordFodboldTurnering;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Main {

    public static void main(String[] args) throws IOException, SQLException
    {
        Tournament tournament = new Tournament();
        tournament.runTournament();
    }
}

