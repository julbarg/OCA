package chapter1;

import java.nio.file.*;
import java.nio.file.Paths;
import java.nio.file.Files;

import java.nio.*; //NO GOOD - a wildcards only matches class names, not "file.*Files"
//import java.nio.*.*; NO GOOD - you can only have one wildcard and it must be at the end
//import java.nio.files.Paths.*; NO GOOD you can¡t import methods. Only class names

public class InputImports {
	
	public void read(Files files){
		Paths.get("name");
	}

}
