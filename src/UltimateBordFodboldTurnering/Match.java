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

            System.out.println("Indtast venligst dato på hvornår den første indledende kamp skal spilles (med bindestreg):");
            kamp1.add(sc.next());
            out.write(kamp1 + "\n");
            System.out.println(kamp1 + "\n");
            System.out.println("Skal spille første indledende kamp mod hinanden. \n");

        while (kamp2.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille næste indledende kamp (uden mellemrum):");
            kamp2.add(sc.next());
        }

        System.out.println("Indtast venligst dato på hvornår den anden indledende kamp skal spilles (med bindestreg):");
        kamp2.add(sc.next());
        out.write(kamp2 + "\n");
        System.out.println(kamp2 + "\n");
        System.out.println("Skal spille anden indledende kamp mod hinanden. \n");

        while (kamp3.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille tredje indledende kamp (uden mellemrum):");
            kamp3.add(sc.next());
        }

        System.out.println("Indtast venligst dato på hvornår den tredje indledende kamp skal spilles (med bindestreg):");
        kamp3.add(sc.next());
        out.write(kamp3 + "\n");
        System.out.println(kamp3 + "\n");
        System.out.println("Skal spille tredje indledende kamp mod hinanden. \n");

        while (kamp4.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille fjerde indledende kamp (uden mellemrum):");
            kamp4.add(sc.next());
        }

        System.out.println("Indtast venligst dato på hvornår den fjerde indledende kamp skal spilles (med bindestreg):");
        kamp4.add(sc.next());
        out.write(kamp4 + "\n");
        System.out.println(kamp4 + "\n");
        System.out.println("Skal spille fjerde indledende kamp mod hinanden. \n");

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

        System.out.println("Indtast venligst dato på hvornår den første semi finale kampen skal spilles (med bindestreg):");
        semifinale1.add(sc.next());
        out.write(semifinale1 + "\n");
        System.out.println(semifinale1 + "\n");
        System.out.println("Skal spille første semi finale kamp mod hinanden. \n");

        while (semifinale2.size() <= 1) {
            System.out.println("Indtast venligst navnene på de hold der skal spille næste semi-finale kamp (uden mellemrum):");
            semifinale2.add(sc.next());
        }

        System.out.println("Indtast venligst dato på hvornår den anden semi finale kampen skal spilles (med bindestreg):");
        semifinale2.add(sc.next());
        out.write(semifinale2 + "\n");
        System.out.println(semifinale2 + "\n");
        System.out.println("Skal spille anden semi finale kamp mod hinanden. \n");

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





    }

}