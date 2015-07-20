package onlinetest;

public class CandidateButton extends Button 
{
	CandidateScreen candidScreen = new CandidateScreen();
	CandidateLamp lamp = new CandidateLamp();
	CU cu = new CU();
	
	public void castVote(int candidID)
	{
		cu.addVote(candidScreen.getCandidates().get(candidID), 1);
		lamp.lampOn(candid);
	}
}
