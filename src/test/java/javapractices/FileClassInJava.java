package javapractices;

import java.io.File;
import java.io.IOException;

public class FileClassInJava {

	public static void main(String[] args) throws IOException {

		File file = new File("C:/Users/Admin/Desktop/file.txt");

		// file.createNewFile();
		// file.delete();

		System.out.println(file.exists());

		System.out.println(file.canExecute());

		System.out.println(file.getAbsolutePath());

		// file.renameTo(new File("C:/Users/Admin/Desktop/newfile.txt"));

		System.out.println(file.length());

		System.out.println(file.isDirectory());

		System.out.println(file.isFile());

		System.out.println(file.isHidden());

		System.out.println(file.lastModified());

	}

}
