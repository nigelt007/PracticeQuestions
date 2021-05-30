package com.nigel.puzzles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AmEx2 {
	
	public void readLines(String fileName) throws IOException {
		File file = new File(fileName);
		
		FileInputStream fis = new FileInputStream(fileName);
		while(fis.read()!=-1) {
			fis.read();
		}
		
		List<String> s = new ArrayList<>();
		
		
		
	}

}
