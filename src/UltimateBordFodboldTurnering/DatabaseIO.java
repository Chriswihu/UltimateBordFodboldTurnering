package UltimateBordFodboldTurnering;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class DatabaseIO implements IO
{
    public void findPlayerPartialInput(Connection c, String userInput)
    {
        try
        {
            String Query = "SELECT * FROM player WHERE name LIKE ?";
            PreparedStatement query = c.prepareStatement(Query);
            query.setString(1, "%"+userInput+"%");

            ResultSet result = query.executeQuery();
            System.out.println("Spillere fundet som indeholder: " + userInput);
            while (result.next())
            {
                System.out.println("Navn: " + result.getString("name"));
                int id = result.getInt("id");

                CheckForExistingTeam(c, id);
            }
            query.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void CheckForExistingTeam(Connection c, int playerID)
    {
        Scanner scanner;
        scanner = new Scanner(System.in);
        int teamID;
        String Query = "SELECT * FROM team_player WHERE playerID = ?";

        try
        {
            PreparedStatement preparedStatement = c.prepareStatement(Query);

            preparedStatement.setInt(1, playerID);

            ResultSet result = preparedStatement.executeQuery();

            while (result.next())
            {
                if (result.getInt("teamID") != 0)
                {
                    System.out.println("\nDer er ingen hold tilknyttet denne spiller.\nVælg et af de følgende hold:\n");
                    showAllTeamID(c);
                    System.out.println("\nIndtast hold ID");
                    teamID = Integer.parseInt(scanner.nextLine());
                    addExistingPlayerToTeam(c, playerID, teamID);
                    System.out.println("Spilleren er nu tilknyttet hold " + teamID + ".");
                } else
                {
                    System.out.println("Spilleren er allerede tilknyttet et hold");
                    System.out.println("Hold ID: " + result.getInt("teamID"));
                }
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void findTeamPartialInput(Connection c, String userInput)
    {
        try
        {
            String Query = "SELECT * FROM team WHERE name LIKE ?";
            PreparedStatement query = c.prepareStatement(Query);
            query.setString(1, "%"+userInput+"%");

            ResultSet result = query.executeQuery();
            System.out.println("Hold fundet som indeholder: " + userInput);
            while (result.next())
            {
                System.out.println("Navn: " + result.getString("name"));
            }

            query.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void addExistingPlayerToTeam(Connection c, int playerID, int teamID)
    {
        try
        {
            String Query = "UPDATE team_player SET teamID = ? WHERE playerID = ?";
            PreparedStatement query = c.prepareStatement(Query);
            query.setInt(1, teamID);
            query.setInt(2, playerID);

            query.executeUpdate();

            query.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void deleteExistingPlayerFromTeam(Connection c, int playerID)
    {
        try
        {
            String Query = "DELETE FROM team_player WHERE playerID = ?";
            PreparedStatement query = c.prepareStatement(Query);
            query.setInt(1, playerID);

            int result = query.executeUpdate();

            query.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void getTop8Teams(Connection c)
    {
        try
        {
            String Query = "SELECT * FROM team ORDER BY points DESC";
            PreparedStatement query = c.prepareStatement(Query);

            ResultSet result = query.executeQuery();
            while (result.next())
            {
                System.out.println("Holdnavn: " + result.getString("name"));
                System.out.println("Points: " + result.getString("points"));
            }

            query.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void showAllPLayerID(Connection c)
    {
        try
        {
            String Query = "SELECT * FROM player ORDER BY id ASC";
            PreparedStatement query = c.prepareStatement(Query);

            ResultSet result = query.executeQuery();
            while (result.next())
            {
                System.out.print("ID: " + result.getString("id"));
                System.out.println(" Navn: " + result.getString("name"));
            }

            query.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void showAllTeamID(Connection c)
    {
        try
        {
            String Query = "SELECT * FROM team ORDER BY id ASC";
            PreparedStatement query = c.prepareStatement(Query);

            ResultSet result = query.executeQuery();
            while (result.next())
            {
                System.out.print("ID: " + result.getString("id"));
                System.out.println(" Navn: " + result.getString("name"));
            }

            query.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public void showAllPlayersInTeam(Connection c, int teamID)
    {
        try
        {
            String Query = "SELECT * FROM team_player WHERE teamID = ?";
            PreparedStatement query = c.prepareStatement(Query);
            query.setInt(1, teamID);

            ResultSet result = query.executeQuery();
            while (result.next())
            {
                System.out.println("Player ID: " + result.getString("playerID"));
            }
            query.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}