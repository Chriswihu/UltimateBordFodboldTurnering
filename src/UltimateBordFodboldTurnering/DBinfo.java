package UltimateBordFodboldTurnering;

public class DBinfo
{
    private String JdbcUrl;
    private String username;
    private String password;

    public DBinfo() {
        this.JdbcUrl = "jdbc:mysql://localhost/systemtournament?" + "autoReconnect=true&useSSL=false";
        this.username = "root";
        this.password = "Ysr5123mqr";
    }

    public String getJdbcUrl()
    {
        return this.JdbcUrl;
    }

    public String getUsername()
    {
        return this.username;
    }

    public String getPassword()
    {
        return this.password;
    }

}
