package com.wenhaoc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PDFLineRestorer {
	
	public static void main(String[] args) {
		try {
		File srcFile = new File("/home/wenhaoc/Documents/pdfSource.txt");
		BufferedReader in = new BufferedReader( new FileReader(srcFile));
		File outFile = new File("/home/wenhaoc/Documents/pdfOut.txt");
		PrintWriter out = new PrintWriter(new FileWriter(outFile, true));
		String inLine = "", outLine = "";
		String[] splits;
		while ((inLine = in.readLine())!=null) {
			splits = inLine.trim().split(" ");
			if (inLine.equals("")) {
				if (outLine.endsWith(" "))
					outLine = outLine.substring(0, outLine.length()-1);
				outLine = outLine + "\n\n";
				continue;
			}
			for (int i = 0; i< splits.length-1; i++)
				outLine = outLine + splits[i] + " ";
			String lastWord = splits[splits.length-1];
			if (lastWord.endsWith("-"))
				outLine = outLine + lastWord.substring(0, lastWord.length()-1);
			else outLine = outLine + lastWord + " ";
		}
		out.write(outLine);
		in.close();
		out.flush();
		out.close();
		}	catch (Exception e) {e.printStackTrace();}
	}
	
	
}
