package onlinetest;

public class CandidateLamp
{
	CandidateScreen candidScreen = new CandidateScreen();
	
	public CandidateLamp()
	{
		
	}
	
	public void lampOn(int index)
	{
		System.out.println("The Candidate Lamp is on for "+candidScreen.getCandidates().get(index).getName());
	}
}
