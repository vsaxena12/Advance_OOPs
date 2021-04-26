import java.util.Arrays;
import java.util.Scanner;
interface HockeyTeam
{
    public int calculateHockeyScore();
    public int findHighestGoalByIndividualInHockey();
}

interface FootballTeam
{
    public int calculateFootballScore();
    public int findHighestGoalByIndividualInFootball();
}

class Sport implements HockeyTeam, FootballTeam
{
    int[] hockeyPlayers;
    int[] footballPlayers;
    
    Sport(int[] hockeyPlayers, int[] footballPlayers)
    {
        this.hockeyPlayers = hockeyPlayers;
        this.footballPlayers = footballPlayers;
        
    }
    
    public int calculateHockeyScore()
    {
        int totalHockeyScore = 0;
        for(int i=0; i<hockeyPlayers.length; i++)
        {
            totalHockeyScore = totalHockeyScore + hockeyPlayers[i];
        }
        //System.out.println(totalHockeyScore);
        return totalHockeyScore;
    }
    
    public int calculateFootballScore()
    {
        int totalFootballScore = 0;
        for(int i=0; i<footballPlayers.length; i++)
        {
            totalFootballScore = totalFootballScore + footballPlayers[i];
        }
        return totalFootballScore;
    }
    
    public int findHighestGoalByIndividualInHockey()
    {
        int count = 0;
        for(int i=0; i<hockeyPlayers.length; i++)
        {
            if(count < hockeyPlayers[i])
            {
                count = hockeyPlayers[i];
            }
        }
        
        return count;
    }
    
    public int findHighestGoalByIndividualInFootball()
    {
        int count = 0;
        for(int i=0; i<footballPlayers.length; i++)
        {
            if(count < footballPlayers[i])
            {
                count = footballPlayers[i];
            }
        }
        return count;
    }
    
    
}

public class SolutionSport{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[] hockeyPlayers = new int[11];
        int[] footballPlayers = new int[11];

        for(int i = 0; i < 11; i++)
        {
            hockeyPlayers[i] = sc.nextInt();
        }

        for(int i = 0; i < 11; i++)
        {
            footballPlayers[i] = sc.nextInt();
        }
        
        Sport s = new Sport(hockeyPlayers, footballPlayers);
        try{
            HockeyTeam.class.getMethod("calculateHockeyScore");
            HockeyTeam.class.getMethod("findHighestGoalByIndividualInHockey");
            FootballTeam.class.getMethod("calculateFootballScore");
            FootballTeam.class.getMethod("findHighestGoalByIndividualInFootball");

            if(s instanceof HockeyTeam && s instanceof FootballTeam)
            {
                System.out.println(s.calculateHockeyScore());
                System.out.println(s.calculateFootballScore());
                System.out.println(s.findHighestGoalByIndividualInHockey());
                System.out.println(s.findHighestGoalByIndividualInFootball());
            }
        }
        catch (NoSuchMethodException ex)
        {
            System.out.println("No such function is exits");
        }
    }
}