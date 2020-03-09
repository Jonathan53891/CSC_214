public class VotingMachine
{
    private int democratsVotes;
    private int republicansVotes;
    public VotingMachine()
    {
    // initialise votes to 0
        democratsVotes = 0;
        republicansVotes = 0;
    }
    public void voteDemocrat()
    {
    // increase vote by 1 for democrat
        democratsVotes++;
    }
    public void voteRepublican()
    {
        // increase vote by 1 for republican
        republicansVotes++;
    }

    public int getDemocratsVotes()
    {
        return democratsVotes;
    }

    public int getRepublicansVotes()
    {
        return republicansVotes;
    }
}
