public class Main
{
    public static void main(String[] args)
    {
        VotingMachine votingMachine = new VotingMachine();

        votingMachine.voteDemocrat();
        votingMachine.voteDemocrat();
        votingMachine.voteDemocrat();
        votingMachine.voteDemocrat();

        votingMachine.voteRepublican();
        votingMachine.voteRepublican();
        votingMachine.voteRepublican();
        votingMachine.voteRepublican();
        votingMachine.voteRepublican();

        System.out.println("Democrats votes: " + votingMachine.getDemocratsVotes());

        System.out.println("Republicans votes: " + votingMachine.getRepublicansVotes());
    }
}
