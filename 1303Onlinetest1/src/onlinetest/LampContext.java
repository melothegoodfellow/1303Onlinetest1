package onlinetest;

public class LampContext {

	private LampState lampState;

	public LampContext(LampState doorState) {
		this.lampState = doorState;
	}

	public void Switch(String type){
		lampState.switchState(this, type);
	}

	public LampState getLampState() {
		return lampState;
	}

	public void setLampState(LampState lampState) {
		this.lampState = lampState;
	}

}
