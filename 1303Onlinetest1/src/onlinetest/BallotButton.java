package onlinetest;

public class BallotButton extends Button
{
	public void openVoting()
	{
		//CandidateButton cb = new CandidateButton();
		CandidateButton.setVotingOpen(true);
	}
}
