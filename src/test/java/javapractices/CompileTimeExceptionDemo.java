package javapractices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * This method is used to read a file from the given path
	 * @param path the path of the file to be read
	 * @throws FileNotFoundException if the file is not found at the given path
	 * @throws ArithmeticException if there is an arithmetic error in the method
	 */
	public void readFile(String path) throws FileNotFoundException, ArithmeticException {

		File file = new File(path);
		FileInputStream fileinputStream = new FileInputStream(file);
		int num=10;
		int result=num/0;

	}

}
