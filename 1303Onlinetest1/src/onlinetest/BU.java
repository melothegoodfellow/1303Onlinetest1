package onlinetest;

import java.util.ArrayList;

public class BU extends EVM
{
	private ReadyLamp readyLamp;
	private ArrayList<Candidate> candidates = new ArrayList<Candidate>();
	
	public ArrayList<Candidate> getCandidates()
	{
		return candidates;
	}

	public void setCandidates(ArrayList<Candidate> candidates)
	{
		this.candidates = candidates;
	}

	public void addCandidate(String string)
	{
		candidates.add(new Candidate(string));
	}

	public void displayCandidates()
	{
		System.out.println("The Candidates are ");
		for (Candidate candidate : candidates)
		{
			System.out.println(candidate.getName());
		}
	}

	public void switchOn()
	{
		System.out.println("The CU is on");
	}
}
