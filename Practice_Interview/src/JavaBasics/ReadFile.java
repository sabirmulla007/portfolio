package JavaBasics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import com.fasterxml.jackson.databind.jsontype.impl.AsExistingPropertyTypeSerializer;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		FileReader fr;
		int c = 0;
		try {
			fr = new FileReader("D:\\acceleration\\workspace\\Practice_Interview\\propoerty file\\newFile");
			while ((c = fr.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		fr = new FileReader("D:\\acceleration\\workspace\\Practice_Interview\\propoerty file\\newFile");
		System.out.println();
		System.out.println(fr.read());
	
	}
}