package onlinetest;

import java.util.ArrayList;

public class BU
{
	ArrayList<Candidate> candidates = new ArrayList<Candidate>();
	
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
}
