package onlinetest;

public class Off extends LampState 
{
	public Off()
	{
		currentState = "Off";
	}

	@Override
	public void switchState(LampContext context, String type)
	{
		System.out.print("The "+type+ " Lamp is "+currentState);
		On on=new On();
		context.setLampState(on);
		System.out.print(" ."+context.getLampState().currentState+" the Lamp!!\t");
		
	}
}
