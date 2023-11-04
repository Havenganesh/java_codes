package fileWR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		String path="/home/ganesh/Documents/http-server/index.html";
		var data=fileReading(path);
		fileWriting(data,"file1");
	}
	
	static byte[] fileReading(String path) {
		FileInputStream fin;
		byte[] data= {};
		try {
			fin = new FileInputStream(path);
			data=fin.readAllBytes();
			for(byte a:data) {
				System.out.print((char)a);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
		return data;
	}
	static void fileWriting(byte[] data,String fileName) {
		FileOutputStream fout;
		String path="src/fileWR/"+fileName;
		File file=new File(path);
			try {
				file.createNewFile();
				fout=new FileOutputStream(file);
				fout.write(data);
			} catch (FileNotFoundException e) {
				System.out.println(e);
			} catch (IOException e) {
				System.out.println(e);
			}
		
	}

}
