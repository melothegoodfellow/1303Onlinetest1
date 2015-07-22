package onlinetest;

public class CandidateButton extends Button 
{
	public static boolean isVotingOpen() {
		return isVotingOpen;
	}

	public static void setVotingOpen(boolean isVotingOpen) {
		CandidateButton.isVotingOpen = isVotingOpen;
	}

	static boolean isVotingOpen = false;
	CandidateScreen candidScreen = new CandidateScreen();
	CandidateLamp lamp = new CandidateLamp();
	CU cu = new CU();

	public int castVote(int candidID)
	{
		if(isVotingOpen)
		{
			cu.addVote(candidScreen.getCandidates().get(candidID), 1);
			Factory f = new Factory();
			SwitchCommand sc=new On();
			sc.working((f.getLamp("candidate Lamp")));
			lamp.on(candidID);
			return 1;
		}
		else
			System.out.println("Voting closed!!");
		return 0;
	}
}
