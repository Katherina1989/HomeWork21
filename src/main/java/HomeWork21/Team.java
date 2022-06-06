package HomeWork21;

public class Team {
    private String name;
    private Sportsman[] sportsman;
    private String result;

    public Team(String name, Sportsman[] sportsman) {
        this.name = name;
        this.sportsman = sportsman;
    }

    public String getName() {
        return name;
    }

    public Sportsman[] getSportsman() {
        return sportsman;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void  showResults() {
        System.out.println(result);
    }



}
