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
		Factory f = new Factory();
		SwitchCommand sc=new On();
		sc.working((f.getLamp("On Lamp")));
		sc.working((f.getLamp("Ready Lamp")));
	}
	
}