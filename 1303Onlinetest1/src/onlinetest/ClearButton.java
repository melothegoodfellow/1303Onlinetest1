package onlinetest;

public class ClearButton extends Button
{
	public void clearVoting()
	{
		CU.map.clear();
		CandidateScreen.candidates.clear();
	}
}
