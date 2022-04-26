package UltimateBordFodboldTurnering;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class DatabaseIO implements IO{
    @Override
    public void getTeamNames(Connection c) throws IOException {
        try {
            String cityQuery = "SELECT * FROM team WHERE name = ?";
            PreparedStatement query = c.prepareStatement(cityQuery);
            query.setString(1, "Los Angeles");
            ResultSet result = query.executeQuery();

            while (result.next()) {
                System.out.println("Name: " + result.getString("name"));
                System.out.println("Points: " + result.getString("points"));
            }

            query.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void getTeamPlayers(Connection c) throws IOException {
        try {
            String cityQuery = "SELECT * FROM player WHERE name = ?";
            PreparedStatement query = c.prepareStatement(cityQuery);
            query.setString(1, "Iris");
            ResultSet result = query.executeQuery();

            while (result.next()) {
                System.out.println("Name: " + result.getString("name"));
                //System.out.println("Points: " + result.getString("points"));
            }

            query.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void getTeamScores() {

    }



    public void findPlayerPartialInput(Connection c) {
        try {
            String cityQuery = "SELECT * FROM player WHERE name LIKE ?";
            PreparedStatement query = c.prepareStatement(cityQuery);
            query.setString(1, "%lek%");
            ResultSet result = query.executeQuery();

            while (result.next()) {
                System.out.println("Name: " + result.getString("name"));
            }

            query.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getScheduledMatches() throws IOException {

    }

    public void findTeamPartialInput(Connection c) {
        try {
            String cityQuery = "SELECT * FROM team WHERE name LIKE ?";
            PreparedStatement query = c.prepareStatement(cityQuery);
            query.setString(1, "%ull%");
            ResultSet result = query.executeQuery();

            while (result.next()) {
                System.out.println("Name: " + result.getString("name"));
            }

            query.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




   /* @Override
    public String[] loadTeamData() {
        return new String[0];
    }

    @Override
    public ArrayList<String> loadPlayerData() {
        return null;
    }*/
}
