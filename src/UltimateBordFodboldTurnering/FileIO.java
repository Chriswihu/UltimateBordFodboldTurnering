package UltimateBordFodboldTurnering;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO implements IO
{
    @Override
    public void getTeamNames() throws IOException {
        System.out.println("Vælg hvilket hold du vil se navnet på\n" +
                "Tast 1 for hold 1\n" +
                "Tast 2 for hold 2\n" +
                "Tast 3 for hold 3\n" +
                "Tast 4 for hold 4\n" +
                "Tast 5 for hold 5\n" +
                "Tast 6 for hold 6\n" +
                "Tast 7 for hold 7\n" +
                "Tast 8 for hold 8\n");
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();

        switch (input) {
            case "1":
                System.out.println("Her er holdnavn på hold 1");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 1;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "2":
                System.out.println("Her er holdnavn på hold 2");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 2;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "3":
                System.out.println("Her er holdnavn på hold 3");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 3;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "4":
                System.out.println("Her er holdnavn på hold 4");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 4;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "5":
                System.out.println("Her er holdnavn på hold 5");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 5;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "6":
                System.out.println("Her er holdnavn på hold 6");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 6;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "7":
                System.out.println("Her er holdnavn på hold 7");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 7;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "8":
                System.out.println("Her er holdnavn på hold 8");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/hold.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 8;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

    }

    @Override
    public void getTeamPlayers() throws IOException
    {
        System.out.println("Vælg hvilket hold du vil se spillerne på\n" +
                "Tast 1 for hold 1\n" +
                "Tast 2 for hold 2\n" +
                "Tast 3 for hold 3\n" +
                "Tast 4 for hold 4\n" +
                "Tast 5 for hold 5\n" +
                "Tast 6 for hold 6\n" +
                "Tast 7 for hold 7\n" +
                "Tast 8 for hold 8\n");
        Scanner sc;
        sc = new Scanner(System.in);
        String input;
        input = sc.nextLine();

        switch (input)
        {
            case "1":
                System.out.println("Her er spillerne på hold 1");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 1;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "2":
                System.out.println("Her er spillerne på hold 2");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 2;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "3":
                System.out.println("Her er spillerne på hold 3");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 3;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "4":
                System.out.println("Her er spillerne på hold 4");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 4;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "5":
                System.out.println("Her er spillerne på hold 5");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 5;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "6":
                System.out.println("Her er spillerne på hold 6");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 6;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "7":
                System.out.println("Her er spillerne på hold 7");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 7;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }

        switch (input)
        {
            case "8":
                System.out.println("Her er spillerne på hold 8");

                FileReader fr = new FileReader("src/UltimateBordFodboldTurnering/spillere.txt");
                BufferedReader br = new BufferedReader(fr);
                int lineNum = 8;
                for (int i = 1; i < lineNum; i++)
                    br.readLine();
                System.out.println(br.readLine());
                break;
        }
    }

    @Override
    public void getTeamScores() {
    }
}