package onlinetest;

public class Factory
{
	Lamp lamp;

	public Lamp getLamp(String type)
	{
		if(type.equalsIgnoreCase("ready lamp"))
			lamp = new ReadyLamp();
		else if(type.equalsIgnoreCase("Busy Lamp"))
			lamp = new BusyLamp();
		else if(type.equalsIgnoreCase("Candidate Lamp"))
			lamp = new CandidateLamp();
		else if(type.equalsIgnoreCase("On Lamp"))
			lamp = new OnLamp();
		return lamp;
	}

	public void setLamp(Lamp lamp)
	{
		this.lamp = lamp;
	}
	
	
}
