package Abstraction;

public class TeleviSion extends HomeApplinces implements RemoteControler {
	
	int volumeLevel = 50;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Current Volume Level : "+this.volumeLevel;
	}

	@Override
	public int increaseVolume() {
		// TODO Auto-generated method stub
		this.volumeLevel++;
		return this.volumeLevel;
	}

	@Override
	public int decreaseVolume() {
		// TODO Auto-generated method stub
		this.volumeLevel--;
		return this.volumeLevel;
	}

}
