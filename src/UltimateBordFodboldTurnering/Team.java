package UltimateBordFodboldTurnering;

public class Team extends Registration
{
    private final String name;
    private int sumPoints = 0;
    private int initScore = 0;
    private int semiScore = 0;
    private int finalScore = 0;

    public Team(String team, int init, int semi, int fin, int sum)
    {
        this.name = team;
        this.initScore = init;
        this.semiScore = semi;
        this.finalScore = fin;
        this.sumPoints = sum;
    }

    public String getName() {
        return name;
    }

    public int getInitScore()
    {
        return initScore;
    }

    public int getSemiScore()
    {
        return semiScore;
    }

    public int getFinalScore()
    {
        return finalScore;
    }

    public int getSumPoints()
    {
        return initScore + semiScore + finalScore;
    }

    @Override
    public String toString() {
        return name + ", " + initScore + ", " + semiScore + ", " + finalScore + ", " + sumPoints;
    }

    public int updateInit(int matchScore)
    {
        initScore += matchScore;
        return initScore;
    }

    public int updateSemi(int matchScore)
    {
        semiScore += matchScore;
        return  semiScore;
    }

    public int updateFinal(int matchScore)
    {
        finalScore += matchScore;
        return finalScore;
    }

}
