package UltimateBordFodboldTurnering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Match {

    static ArrayList<String> kamp1 = new ArrayList<>();
    static ArrayList<String> kamp2 = new ArrayList<>();
    static ArrayList<String> kamp3 = new ArrayList<>();
    static ArrayList<String> kamp4 = new ArrayList<>();
    static ArrayList<String> semifinale1 = new ArrayList<>();
    static ArrayList<String> semifinale2 = new ArrayList<>();
    static ArrayList<String> finale = new ArrayList<>();

    public static void schedulePreliminaryMatch() throws IOException {
        FileWriter out;
        out = new FileWriter("src/UltimateBordFodboldTurnering/planlagteKampe.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);

        while (kamp1.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille første indledende kamp:");
            kamp1.add(sc.next());
        }
            System.out.print(kamp1 + "\n");
            out.write(kamp1 + "\n");
            System.out.println("Skal spille første indledende kamp. \n");

        while (kamp2.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille næste indledende kamp:");
            kamp2.add(sc.next());
        }
        out.write(kamp2 + "\n");
        System.out.print(kamp2 + "\n");
        System.out.println("Skal spille anden indledende kamp. \n");

        while (kamp3.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille tredje indledende kamp:");
            kamp3.add(sc.next());
        }
        out.write(kamp3 + "\n");
        System.out.print(kamp3 + "\n");
        System.out.println("Skal spille tredje indledende kamp. \n");

        while (kamp4.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille fjerde indledende kamp:");
            kamp4.add(sc.next());
        }
        out.write(kamp4 + "\n");
        System.out.print(kamp4 + "\n");
        System.out.println("Skal spille fjerde indledende kamp. \n");

        System.out.println("Sådan skal de fire indledende kampe spilles. Held og lykke! \n");
        out.close();
    }

    public static void scheduleSemiFinalMatch() throws IOException {
        FileWriter out;
        out = new FileWriter("src/UltimateBordFodboldTurnering/planlagteKampe.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);

        while (semifinale1.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille første semi-finale kamp:");
            semifinale1.add(sc.next());
        }
        System.out.print(semifinale1 + "\n");
        out.write(semifinale1 + "\n");
        System.out.println("Dette er den første semi finale kamp. \n");
        while (semifinale2.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille næste semi-finale kamp:");
            semifinale2.add(sc.next());
        }
        System.out.print(semifinale2 + "\n");
        out.write(semifinale2 + "\n");
        System.out.println("Dette er den anden semi finale kamp. \n");

        System.out.println("Sådan skal de to semi-finale kampe spilles. Held og lykke! \n");
        out.close();
    }
    public static void scheduleFinalMatch() throws IOException {
        FileWriter out;
        out = new FileWriter("src/UltimateBordFodboldTurnering/planlagteKampe.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);

        while (finale.size() <= 1) {
            System.out.println("Indtast venligst navnene på de to hold der skal spille finale kamp:");
            finale.add(sc.next());
        }
        System.out.print(finale + "\n");
        out.write(finale + "\n");
        System.out.println("Sådan skal finale kampen spilles. Held og lykke! \n");
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