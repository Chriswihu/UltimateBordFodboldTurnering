package UltimateBordFodboldTurnering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Match
{

    static ArrayList<String> result = new ArrayList<>();
    private static Scanner scanner;

    public static void scheduleMatch() throws IOException
    {
        System.out.println("Her skal vi kunne registrere kampresultater");
        FileWriter out;
        out = new FileWriter("src/UltimateBordFodboldTurnering/planlagteKampe.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        while (result.size() <= 1)
        {
            System.out.println("Indtast venligst hvilke hold der har spillet mod hinanden:\n" +
                    "Tast 1 for hold 1\n" +
                    "Tast 2 for hold 2\n" +
                    "Tast 3 for hold 3\n" +
                    "Tast 4 for hold 4\n" +
                    "Tast 5 for hold 5\n" +
                    "Tast 6 for hold 6\n" +
                    "Tast 7 for hold 7\n" +
                    "Tast 8 for hold 8\n");
            result.add(sc.next());

            System.out.print("Hold " + result.get(0) + " Registreret. \n");
        }
        System.out.println("Hold " + result + " skal spille mod hinanden d. 04/04/2022");
        out.write(result + "\n");
        out.close();
    }

    public static void getMatchResults()
    {
        System.out.println("Her skal vi hente vores kampresultater fra txt filen");
        BufferedReader objReader = null;
        try
        {
            String strCurrentLine;

            objReader = new BufferedReader(new FileReader("src/UltimateBordFodboldTurnering/planlagteKampe.txt"));

            while ((strCurrentLine = objReader.readLine()) != null)
            {
                System.out.println(strCurrentLine);
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {

            try
            {
                if (objReader != null)
                    objReader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    public static void getScheduledMatches()
    {

        System.out.println("Her skal vi hente vores planlagte kampe");
    }

}