package UltimateBordFodboldTurnering;

import java.io.IOException;
import java.util.Scanner;

public class Tournament {
    /*public static void runTournament() throws IOException {
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
                System.out.println("Tast 1 for at oprette 8 hold til turneringen. \n" +
                        "Tast 2 for at tilføje spillerne til de 8 hold\nTast 3 for at planlægge kampe\n" + "Tast 4 for at registrere resultater. \n" + "Tryk Q for at gå tilbage. \n");

                String input2;
                input2 = scanner.nextLine();

                switch (input2) {

                    case "Q":
                        System.out.println("Tak for denne gang");

                        break;
                }

                switch (input2) {
                    case "1" -> {
                        Registration.addTeams();
                        break;
                    }
                }

                switch (input2) {
                    case "2" -> {
                        Registration.teamRegistrations();
                        break;
                    }
                }

                switch (input2) {
                    case "3" -> {
                        System.out.println("Tast 1 for at planlægge de indledende kampe\n" +
                                "Tast 2 for at planlægge semifinale kampe\nTast 3 for at planlægge finalen\n" + "Tryk Q for at gå tilbage. \n");
                        String input5;
                        input5 = scanner.nextLine();
                        switch (input5) {
                            case "1":
                                Match.schedulePreliminaryMatch();
                                break;
                        }
                        switch (input5) {
                            case "2":
                                Match.scheduleSemiFinalMatch();
                                break;
                        }
                        switch (input5) {
                            case "3":
                                Match.scheduleFinalMatch();
                                break;
                        }
                        break;
                    }
                }


                switch (input2) {
                    case "4" -> {
                        Registration.saveResult();
                        break;
                    }
                }
            }

            if (input.equals("2")) {
                System.out.println("Tast 1 for at se holdnavne\n" +
                        "Tast 2 for at se spillerne på et hold\n" + "Tast 3 for at se planlagte kampe. \n" + "Tast 4 for at se resultater. \n" + "Tryk Q for at gå tilbage. \n");

                String input3;
                input3 = scanner.nextLine();

                switch (input3) {
                    case "Q":

                        break;
                }

                switch (input3) {
                    case "1" -> {
                        FileIO fileIO = new FileIO();
                        fileIO.getTeamNames();
                        break;
                    }
                }

                switch (input3) {
                    case "2" -> {
                        FileIO fileIO = new FileIO();
                        fileIO.getTeamPlayers();
                        break;
                    }
                }

                switch (input3) {
                    case "3" -> {
                        FileIO fileIO = new FileIO();
                        fileIO.getScheduledMatches();
                        break;
                    }
                }
                switch (input3) {
                    case "4" -> {
                        //fileIO.getTeamNames();
                        break;
                    }
                }
            }
        }
    }*/

}
