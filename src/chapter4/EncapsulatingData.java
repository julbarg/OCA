package chapter4;

public class EncapsulatingData {

	private int numberEggs;

	public int getNumberEggs() {
		return numberEggs;
	}
	
	public void setNumberEggs(int numberEggs) {
		if (numberEggs >= 0) {
			this.numberEggs = numberEggs;
		}
	}

}
