package UltimateBordFodboldTurnering;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
    static ArrayList<String> team1 = new ArrayList<>();
    static ArrayList<String> team2 = new ArrayList<>();
    static ArrayList<String> team3 = new ArrayList<>();
    static ArrayList<String> team4 = new ArrayList<>();
    static ArrayList<String> team5 = new ArrayList<>();
    static ArrayList<String> team6 = new ArrayList<>();
    static ArrayList<String> team7 = new ArrayList<>();
    static ArrayList<String> team8 = new ArrayList<>();
    static ArrayList<String> teamName = new ArrayList<>();
    static ArrayList<String> matchResult = new ArrayList<>();


    public static void teamRegistrations() throws IOException
    {
        FileWriter out;
        out = new FileWriter("src/UltimateBordFodboldTurnering/spillere.txt", true);

        Scanner sc;
        sc = new Scanner(System.in);

        while (team1.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne på hold 1 og tryk på Q når du er færdig (mellem 2-5 spiller per hold):");
            var input = sc.nextLine();
            if (input.toLowerCase().equals("q")) break;
            team1.add(input);
        }
        System.out.print(team1 + "\n");
        out.write(team1 + "\n");

        while (team2.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne på hold 2 og tryk på Q når du er færdig (mellem 2-5 spiller per hold):");
            var input = sc.nextLine();
            if (input.toLowerCase().equals("q")) break;
            team2.add(input);
        }
        System.out.print(team2 + "\n");
        out.write(team2 + "\n");

        while (team3.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne på hold 3 og tryk på Q når du er færdig (mellem 2-5 spiller per hold):");
            var input = sc.nextLine();
            if (input.toLowerCase().equals("q")) break;
            team3.add(input);
        }
        System.out.print(team3 + "\n");
        out.write(team3 + "\n");

        while (team4.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne på hold 4 og tryk på Q når du er færdig (mellem 2-5 spiller per hold):");
            var input = sc.nextLine();
            if (input.toLowerCase().equals("q")) break;
            team4.add(input);
        }
        System.out.print(team4 + "\n");
        out.write(team4 + "\n");

        while (team5.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne på hold 5 og tryk på Q når du er færdig (mellem 2-5 spiller per hold):");
            var input = sc.nextLine();
            if (input.toLowerCase().equals("q")) break;
            team5.add(input);
        }
        System.out.print(team5 + "\n");
        out.write(team5 + "\n");

        while (team6.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne på hold 6 og tryk på Q når du er færdig (mellem 2-5 spiller per hold):");
            var input = sc.nextLine();
            if (input.toLowerCase().equals("q")) break;
            team6.add(input);
        }
        System.out.print(team6 + "\n");
        out.write(team6 + "\n");

        while (team7.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne på hold 7 og tryk på Q når du er færdig (mellem 2-5 spiller per hold):");
            var input = sc.nextLine();
            if (input.toLowerCase().equals("q")) break;
            team7.add(input);
        }
        System.out.print(team7 + "\n");
        out.write(team7 + "\n");

        while (team8.size() <= 4)
        {
            System.out.println("Indtast venligst navnene på spillerne på hold 8 og tryk på Q når du er færdig (mellem 2-5 spiller per hold):");
            var input = sc.nextLine();
            if (input.toLowerCase().equals("q")) break;
            team8.add(input);
        }
        System.out.print(team8 + "\n");
        out.write(team8 + "\n");

        out.close();
    }

    public static void registerResult() throws IOException {
        FileWriter out;
        out = new FileWriter("src/UltimateBordFodboldTurnering/kampResultat.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        while (matchResult.size() <= 4) {
            System.out.println("Indtast venligst hvilke hold der spillede mod hinanden: \n" +
                    "Tast 1 for hold 1\n" +
                    "Tast 2 for hold 2\n" +
                    "Tast 3 for hold 3\n" +
                    "Tast 4 for hold 4\n" +
                    "Tast 5 for hold 5\n" +
                    "Tast 6 for hold 6\n" +
                    "Tast 7 for hold 7\n" +
                    "Tast 8 for hold 8\n");
            matchResult.add(sc.next());

            System.out.print("Hold " + matchResult.get(0) + " Registreret. \n");
            teamName.add(sc.next());
        }
        System.out.print(teamName + "\n");
        out.write(teamName + "\n");
        out.close();
    }

    public static void addTeams() throws IOException
    {
        System.out.println("Indtast venligst navnet på det første hold:");
        FileWriter out;
        FileWriter save;
        out = new FileWriter("src/UltimateBordFodboldTurnering/hold.txt", true);
        save = new FileWriter("src/UltimateBordFodboldTurnering/kampResultat.txt", true);
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        Team t;

        int lineNum = 8;
        for (int i = 0; i < lineNum; i++)
        {
            input = sc.nextLine();
            out.write(input + "\n");
            System.out.println("Indtast venligst navnet på det næste hold:");
            t = new Team(input, 0,0,0,0);
            save.write(t+"\n");
        }
        out.close();
        save.close();
    }

    public static void saveResult()
    {
        ArrayList<Team> teams = null;
        String data = "name, Initial goals, Semi goals, Final goals, Sum of Points \n";
        for (Team s : teams) {
            data += s.getName() + ", " + s.getInitScore() + ", " + s.getSemiScore() + ", " + s.getFinalScore() + ", " + s.getSumPoints() + "\n";
        }
        try {
            FileWriter output = new FileWriter("src/UltimateBordFodboldTurnering/kampResultat.txt");
            output.write(data);
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
