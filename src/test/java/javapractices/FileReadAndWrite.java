package javapractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadAndWrite {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/Users/Admin/Desktop/file.txt");

		// FileInputStream fileInputStream = new FileInputStream(file);

//		FileOutputStream fileOutputStream = new FileOutputStream(file);
//
//		fileOutputStream.write(65);
//
//		fileOutputStream.close();

//		FileWriter fileWriter = new FileWriter(file);
//		fileWriter.write("Welcome to Java Programming");
//		fileWriter.close();

		FileInputStream fileInputStream = new FileInputStream(file);

		int i;

		while ((i = fileInputStream.read()) != -1) {
			System.out.print((char) i);
		}

		fileInputStream.close();

	}

}
