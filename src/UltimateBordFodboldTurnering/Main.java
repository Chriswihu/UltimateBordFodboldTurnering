package UltimateBordFodboldTurnering;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Tournament.runTournament();
    }
}

//TODO:
// 1. Fremfor arraylists skal de gemmes per linje, så de kan læses med filewriteren
// 2. Når man opretter turnering skal man kunne planlægge alle 7 kampe.
// 3. Få gemt kampresultater i en tekst fil, som skal kunne læses via menuen.