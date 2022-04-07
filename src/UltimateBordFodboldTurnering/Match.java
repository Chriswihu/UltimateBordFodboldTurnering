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
            System.out.println("Indtast venligst navnene på de hold der skal spille første indledende kamp (uden mellemrum):");
            kamp1.add(sc.next());
        }
            System.out.print(kamp1 + "\n");
            out.write(kamp1 + "\n");
            System.out.println("Skal spille første indledende kamp. \n");
            System.out.println("Indtast venligst dato på hvornår den første indledende kamp skal spilles (med bindestreg):");
            kamp1.add(sc.next());
            out.write(kamp1 + "\n");
            System.out.println(kamp1 + "\n");

        while (kamp2.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille næste indledende kamp (uden mellemrum):");
            kamp2.add(sc.next());
        }
        out.write(kamp2 + "\n");
        System.out.print(kamp2 + "\n");
        System.out.println("Skal spille anden indledende kamp. \n");
        System.out.println("Indtast venligst dato på hvornår den anden indledende kamp skal spilles (med bindestreg):");
        kamp2.add(sc.next());
        out.write(kamp2 + "\n");
        System.out.println(kamp2 + "\n");

        while (kamp3.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille tredje indledende kamp (uden mellemrum):");
            kamp3.add(sc.next());
        }
        out.write(kamp3 + "\n");
        System.out.print(kamp3 + "\n");
        System.out.println("Skal spille tredje indledende kamp. \n");
        System.out.println("Indtast venligst dato på hvornår den tredje indledende kamp skal spilles (med bindestreg):");
        kamp3.add(sc.next());
        out.write(kamp3 + "\n");
        System.out.println(kamp3 + "\n");

        while (kamp4.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille fjerde indledende kamp (uden mellemrum):");
            kamp4.add(sc.next());
        }
        out.write(kamp4 + "\n");
        System.out.print(kamp4 + "\n");
        System.out.println("Skal spille fjerde indledende kamp. \n");
        System.out.println("Indtast venligst dato på hvornår den fjerde indledende kamp skal spilles (med bindestreg):");
        kamp4.add(sc.next());
        out.write(kamp4 + "\n");
        System.out.println(kamp4 + "\n");

        System.out.println("Sådan skal de fire indledende kampe spilles. Held og lykke! \n");
        out.close();
    }

    public static void scheduleSemiFinalMatch() throws IOException {
        FileWriter out;
        out = new FileWriter("src/UltimateBordFodboldTurnering/planlagteKampe.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);

        while (semifinale1.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille første semi-finale kamp (uden mellemrum):");
            semifinale1.add(sc.next());
        }
        System.out.print(semifinale1 + "\n");
        out.write(semifinale1 + "\n");
        System.out.println("Dette er den første semi finale kamp. \n");
        System.out.println("Indtast venligst dato på hvornår den første semi finale kampen skal spilles (med bindestreg):");
        semifinale1.add(sc.next());
        out.write(semifinale1 + "\n");
        System.out.println(semifinale1 + "\n");

        while (semifinale2.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille næste semi-finale kamp (uden mellemrum):");
            semifinale2.add(sc.next());
        }
        System.out.print(semifinale2 + "\n");
        out.write(semifinale2 + "\n");
        System.out.println("Dette er den anden semi finale kamp. \n");

        System.out.println("Indtast venligst dato på hvornår den anden semi finale kampen skal spilles (med bindestreg):");
        semifinale2.add(sc.next());
        out.write(semifinale2 + "\n");
        System.out.println(semifinale2 + "\n");
        System.out.println("Sådan skal de to semi-finale kampe spilles. Held og lykke! \n");
        out.close();
    }
    public static void scheduleFinalMatch() throws IOException {
        FileWriter out;
        out = new FileWriter("src/UltimateBordFodboldTurnering/planlagteKampe.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);

        while (finale.size() <= 1) {
            System.out.println("Indtast venligst navnene på de to hold der skal spille finale kamp (uden mellemrum):");
            finale.add(sc.next());
        }
        System.out.print(finale + "\n");

        System.out.println("Indtast venligst dato på hvornår finale kampen skal spilles (med bindestreg):");
        finale.add(sc.next());
        out.write(finale + "\n");
        System.out.println(finale + "\n");
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


    public static void getScheduledMatches() throws IOException
    {
        System.out.println("Vælg hvilken kamp du vil se datoen på og hvilke hold der skal spille mod hinanden" +
                "  (Hvis kampen er blevet spillet, vil du også " +
                "kunne se resultatet: \n" +
                "Tast 1 for 1. indledende kamp\n" +
                "Tast 2 for 2. indledende kamp\n" +
                "Tast 3 for 3. indledende kamp\n" +
                "Tast 4 for 4. indledende kamp\n" +
                "Tast 5 for 1. semifinale kamp\n" +
                "Tast 6 for 2. semifinale kamp\n" +
                "Tast 7 for finale kampen\n");
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();

        switch (input) {
            case "1":
                System.out.println("Disse hold skal spille den 1. indledende kamp:");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/planlagteKampe.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 1; //line of file to read
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine() + "\n");
        }

        switch (input)
        {
            case "2":
                System.out.println("Disse hold skal spille den 2. indledende kamp:");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/planlagteKampe.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 2; //line of file to read
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine() + "\n");

                break;
        }

        switch (input)
        {
            case "3":
                System.out.println("Disse hold skal spille den 3. indledende kamp:");
                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/planlagteKampe.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 3; //line of file to read
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine() + "\n");

                break;
        }

        switch (input)
        {
            case "4":
                System.out.println("Disse hold skal spille den 4. indledende kamp:");
                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/planlagteKampe.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 4; //line of file to read
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine() + "\n");

                break;
        }

        switch (input)
        {
            case "5":
                System.out.println("Disse hold skal spille den 1. semifinale kamp:");
                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/planlagteKampe.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 5; //line of file to read
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine() + "\n");

                break;
        }

        switch (input)
        {
            case "6":
                System.out.println("Disse hold skal spille den 2. indledende kamp:");
                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/planlagteKampe.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 6; //line of file to read
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine() + "\n");

                break;
        }

        switch (input)
        {
            case "7":
                System.out.println("Disse hold skal spille finale kampen:");
                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/planlagteKampe.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 7; //line of file to read
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine() + "\n");

                break;
        }
    }

}