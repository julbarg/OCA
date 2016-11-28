package chapter6;

import java.io.FileReader;
import java.io.IOException;

public class ThrowSecondException {
	public static void main(String[] args) {
		FileReader reader = null;
		try{
			reader = read();
		} catch (IOException e) {
			System.out.println("Main");
			try{
				if(reader != null){
					reader.close();
				}
			} catch (IOException inner) {
				System.out.println("Inner");
			}
		}
		
		System.out.println(ThrowSecondException.exceptionsOrder());
	}
	
	private static FileReader read() throws IOException {
		 // CODE GOES HERE
		return new FileReader("");
	}
	
	public void OCP() throws Exception{
		try{
			throw new RuntimeException();
		} catch (RuntimeException e) {
			throw new RuntimeException();
		} finally {
			throw new Exception();
		}
	}
	
	public static String exceptionsOrder() {
		String result = "";
		String v = null;
		try{
			try{
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException();
			} finally {
				result += "finally";
				throw new Exception();
			}
		} catch (RuntimeException e) {
			result += "runtime";
		} catch (Exception e) {
			result += "done";
		}
		return result;
	}
	

	
	

}
