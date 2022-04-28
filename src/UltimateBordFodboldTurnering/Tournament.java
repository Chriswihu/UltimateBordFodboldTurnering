package UltimateBordFodboldTurnering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Tournament
{
    public void runTournament() throws SQLException
    {
        Connection c;
        DBinfo d = new DBinfo();
        c = DriverManager.getConnection(d.getJdbcUrl(), d.getUsername(), d.getPassword());
        Scanner scanner;
        scanner = new Scanner(System.in);

        String userInput;
        int playerID;
        int teamID;

        while (true)
        {
            System.out.println("\n" +
                    "Velkommen til menuen for bordfodboldturneringen\n" +
                    "Tast 1 for at søge efter et hold ved at skrive dele af holdnavnet. \n" +
                    "Tast 2 for at søge efter en spiller ved at skrive dele af spillerens navn. \n" +
                    "Tast 3 for at tilføj en spiller til et hold. \n" +
                    "Tast 4 for at fjerne en spiller fra et hold. \n" +
                    "Tast 5 for at se de 8 hold rangeret efter antal point. \n" +
                    "Tast 6 for at spillerne på et vilkårligt hold. \n" +
                    "Tryk Q for at afslutte. \n");
            String input;
            input = scanner.nextLine();

            switch (input)
            {
                case "Q", "q" ->
                        {
                            System.out.println("Du har valgt at afslutte programmet.");
                            System.out.println("Tak for denne gang.");
                            System.exit(0);

                        }

                case "1" ->
                        {
                            System.out.println("Indtast navnet eller dele af navnet på det hold, du vil finde\n");
                            DatabaseIO databaseIO = new DatabaseIO();
                            userInput = scanner.nextLine();
                            databaseIO.findTeamPartialInput(c, userInput);
                        }

                case "2" ->
                        {
                            System.out.println("Indtast navnet eller dele af navnet på den spiller, du vil finde\n");
                            DatabaseIO databaseIO = new DatabaseIO();
                            userInput = scanner.nextLine();
                            databaseIO.findPlayerPartialInput(c, userInput);
                        }


                case "3" ->
                        {
                            DatabaseIO databaseIO = new DatabaseIO();
                            System.out.println("Her er spillernes ID:\n");
                            databaseIO.showAllPLayerID(c);
                            System.out.println("\nHer er holdenes ID:\n");
                            databaseIO.showAllTeamID(c);

                            System.out.println("\nTilføj en spiller til et hold (Skriv spillerens ID).");
                            playerID = Integer.parseInt(scanner.nextLine());

                            System.out.println("Tilføj spilleren til et hold (Skriv holdets ID).");
                            teamID = Integer.parseInt(scanner.nextLine());

                            databaseIO.addExistingPlayerToTeam(c, playerID, teamID);

                            System.out.println("Spiller " + playerID + " er nu tilføjet til hold " + teamID);
                        }

                case "4" ->
                        {
                            DatabaseIO databaseIO = new DatabaseIO();
                            databaseIO.showAllPLayerID(c);
                            System.out.println("\nFjern en spiller fra et hold ved at indtaste spillerens ID.");

                            playerID = Integer.parseInt(scanner.nextLine());

                            databaseIO.deleteExistingPlayerFromTeam(c, playerID);

                            System.out.println("Spiller " + playerID + " blev succesfuldt fjernet fra sit hold");
                        }

                case "5" ->
                        {
                            System.out.println("Her er de 8 hold rangeret efter antal point:");
                            DatabaseIO databaseIO = new DatabaseIO();
                            databaseIO.getTop8Teams(c);
                        }
                case "6" ->
                        {
                            System.out.println("Indtast TeamID for det hold, du vil se spillerne på:\n");
                            DatabaseIO databaseIO = new DatabaseIO();
                            databaseIO.showAllTeamID(c);
                            teamID = Integer.parseInt(scanner.nextLine());
                            System.out.println("Her er spillerne på hold " + teamID + ":" + "\n");
                            databaseIO.showAllPlayersInTeam(c, teamID);
                        }
                default ->
                        {
                            System.out.println("Ikke godtaget indput, prøv igen!");
                        }
            }
        }
    }
}