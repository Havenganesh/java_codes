package fileWR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandles {
	public static void main(String[] args) {
		byte[] data=fileReading(args[0]);
		fileWriting(args[1], data);
	}
	static void fileWriting(String path, byte[] data) {
		File newFile = new File(path);
		try {
			newFile.createNewFile();
			FileOutputStream fout = new FileOutputStream(newFile);
			fout.write(data);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static byte[] fileReading(String path) {
		byte[] data = {};
		try {
			FileInputStream fin = new FileInputStream(path);
			data = fin.readAllBytes();
			for (int i = 0; i < data.length; i++) {
				System.out.print((char) data[i]);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return data;
	}

}
