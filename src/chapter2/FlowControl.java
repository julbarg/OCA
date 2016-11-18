package chapter2;

public class FlowControl {
	
	public void nestedLoops() {
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		for(int[] mySimpleArray: myComplexArray){
			for(int i=0; i<mySimpleArray.length; i++){
				System.out.print(mySimpleArray[i]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public void addOptionalLabels(){
		int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
		OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
		INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
			System.out.print(mySimpleArray[i]+"\t");
		}
			System.out.println();
		}
	}
	
	public void breakStatementLabel(){
		int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j]==searchValue) {
					positionX = i;
					positionY = j;
					break PARENT_LOOP;
				}
			}
		}
		if(positionX==-1 || positionY==-1) {
			System.out.println("Value "+searchValue+" not found");
		} else {
			System.out.println("Value "+searchValue+" found at: " +
					"("+positionX+","+positionY+")");
		}
		
	}
	
	public void breakStatement(){
		int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
		int searchValue = 2;
		int positionX = -1;
		int positionY = -1;
		PARENT_LOOP: for(int i=0; i<list.length; i++) {
			for(int j=0; j<list[i].length; j++) {
				if(list[i][j]==searchValue) {
					positionX = i;
					positionY = j;
					break;
				}
			}
		}
		if(positionX==-1 || positionY==-1) {
			System.out.println("Value "+searchValue+" not found");
		} else {
			System.out.println("Value "+searchValue+" found at: " +
					"("+positionX+","+positionY+")");
		}
		
	}
	
	public void continueStatement() {
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
		for (char x = 'a'; x <= 'c'; x++) {
			if (a == 2 || x == 'b')
				continue FIRST_CHAR_LOOP;
			System.out.print(" " + a + x);
			}
		}
	}
	
	public void continueStatementWithoutLabel() {
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
		for (char x = 'a'; x <= 'c'; x++) {
			if (a == 2 || x == 'b')
				continue;
			System.out.print(" " + a + x);
			}
		}
	}
	
	public static void main(String[] args) {
		FlowControl fc = new FlowControl();
		fc.nestedLoops();
		System.out.println();
		fc.addOptionalLabels();
		System.out.println();
		fc.breakStatementLabel();
		fc.breakStatement();
		System.out.println();
		fc.continueStatement();
		System.out.println();
		fc.continueStatementWithoutLabel();
	}

}
