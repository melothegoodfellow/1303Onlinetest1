package onlinetest;

public class EVM
{
	BU bu = new BU();
	CU cu = new CU();
	ReadyLamp readyLamp = new ReadyLamp();
	
	public void switchOn()
	{
		cu.switchOn();
		bu.switchOn();
		readyLamp.on();
	}
	
}