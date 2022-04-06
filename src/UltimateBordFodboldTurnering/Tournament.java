package UltimateBordFodboldTurnering;

import java.io.IOException;
import java.util.Scanner;

public class Tournament {
    public static void runTournament() throws IOException {
        String input;
        Scanner scanner;
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Velkommen til bordfodboldturneringen\nTast 1 for at oprette ny turnering. \n" +
                    "Tast 2 for at se igangværende turnering. \n" +
                    "Tryk Q for at quitte. \n");
            input = scanner.nextLine();

            if (input.equals("Q")) {
                System.out.println("Tak for denne gang");
                break;
            }


            if (input.equals("1")) {
                System.out.println("Tast 1 for at tilføje spillere til holdene\n" +
                        "Tast 2 for at registrere kampresultatet\nTast 3 for at planlægge kampe\n" + "Tast 4 for at oprette 8 hold til turneringen. \n" + "Tryk Q for at gå tilbage. \n");

                String input2;
                input2 = scanner.nextLine();

                switch (input2) {

                    case "Q":
                        System.out.println("Tak for denne gang");

                        break;
                }

                switch (input2) {
                    case "1" -> {
                        Registration.teamRegistrations();
                        break;
                    }
                }

                switch (input2) {
                    case "2" -> {
                        Registration.registerResult();
                        break;
                    }
                }

                switch (input2) {
                    case "3" -> {
                        Match.scheduleMatch();
                        break;
                    }
                }

                switch (input2) {
                    case "4" -> {
                        Registration.addTeams();
                        break;
                    }
                }
            }

            if (input.equals("2")) {
                System.out.println("Tast 1 for at se spillere på hvert hold\n" +
                        "Tast 2 for at se kampresultater\n" + "Tast 3 for at se planlagte kampe. \n" + "Tast 4 for at se holdnavne. \n" + "Tryk Q for at gå tilbage. \n");

                String input3;
                input3 = scanner.nextLine();

                switch (input3) {
                    case "Q":
                        System.out.println("Tak for denne gang");

                        break;
                }

                switch (input3) {
                    case "1" -> {
                        FileIO fileIO = new FileIO();
                        fileIO.getTeamPlayers();
                        //Team.getIndividualTeams();
                        break;
                    }
                }

                switch (input3) {
                    case "2" -> {
                        Match.getMatchResults();
                        break;
                    }
                }

                switch (input3) {
                    case "3" -> {
                        Match.getScheduledMatches();
                        break;
                    }
                }
                switch (input3) {
                    case "4" -> {
                        FileIO fileIO = new FileIO();
                        fileIO.getTeamNames();
                        break;
                    }
                }
            }
        }
    }
}