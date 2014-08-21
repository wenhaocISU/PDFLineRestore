package com.wenhaoc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PDFLineRestorer {
	
	public static void main(String[] args) {
		try {
			// here is the fork version
		File srcFile = new File(args[0]);
		BufferedReader in = new BufferedReader( new FileReader(srcFile));
		File outFile = new File(args[1]);
	
		}
		out.write(outLine);
		in.close();
		out.flush();
		out.close();
		}	catch (Exception e) {e.printStackTrace();}
	}
	
	
}
