package chapter3;

public class MutableImmutable {
	//Mutable
	private String s;
	
	public void setS(String s){
		this.s = s;
	}
	
	public String getS (){
		return s;
	}
	
	//Immutable
	final class Immutable {
		private String s;
		
		public String getS(){
			return s;
		}
	}

}
