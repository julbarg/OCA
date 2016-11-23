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
	
	/*
	 * Rules for JavaBeans naming conventions
	 */
	private boolean playing;
	private String name;
	
	public boolean getPlaying() { return playing; }  //NO isPlatin()
	public boolean isPlaying() { return playing; } // YES
	public String name() { return name; } // NO getName()
	public void updateName(String n) { name = n; } //NO setName
	public void setname(String n) { name = n; } // YES

}
