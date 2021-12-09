package Basics;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOperation {
	static File file;
	public static void createFile(String pathOfFile)  {//C:\Users\kapthula\Desktop\JSE\New folder\abc.txt
		file =new File(pathOfFile);
		if(!file.exists()) {
				try {
					file.createNewFile();
				}  catch (IOException e) {
					createFolders("C:\\Users\\kapthula\\Desktop\\JSE\\TOM");
					try {
						file =new File("C:\\Users\\kapthula\\Desktop\\JSE\\TOM\\jerry.txt");
						file.createNewFile();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
		}else {
			System.out.println("File already exist");
		}
	}
	
	
	
	public static String createFolder(String pathOfFolder) {
		file =new File(pathOfFolder);
		if(!file.exists()) {
			file.mkdir();
		}else {
			System.out.println("The folder is already exist");
		}
		return pathOfFolder;
	}
	
	public static String createFolders(String pathOfFolder) {
		file =new File(pathOfFolder);
		if(!file.exists()) {
			file.mkdirs();
		}else {
			System.out.println("The folders structure are already exist");
		}
		return pathOfFolder;
	}
	
	public static void main(String[] args) {
		createFile("C:\\Users\\kapthula\\Desktop\\JSE\\TOM\\jerry.txt");
		/*
		
		String folderPath=System.getProperty("user.dir")+ File.separator + "Example"+ File.separator + "Example"+ File.separator + "Example";
		String path =createFolders(folderPath);
		//file =new File(System.getProperty("user.dir")+ File.separator + "Example123");
		//System.out.println(file.isDirectory());
		//System.out.println(path);
		//System.out.println(file.delete());
		//path=path+File.separator+"Tom.html";
		//createFile(path);
		System.out.println(file.delete());
		folderPath=System.getProperty("user.dir")+ File.separator + "Example"+ File.separator + "Example";
		file =new File(folderPath);
		System.out.println(file.delete());
		folderPath=System.getProperty("user.dir");
		file =new File(folderPath);
		System.out.println(file.delete());\
		*/
	}
}
