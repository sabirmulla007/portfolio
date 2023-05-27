package JavaBasics;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter fileWriter = new FileWriter(
					"D:\\acceleration\\workspace\\Practice_Interview\\propoerty file\\newFile");
			fileWriter.write("Add new line ");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}