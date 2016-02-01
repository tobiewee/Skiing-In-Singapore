package skiproblem;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SkiSGSolver {

	private static InputStream file = null;
	private static InputStreamReader fileReader= null;
	private static BufferedReader br = null;

	public static void openFile(String fileLoc){
		try{
			file = new FileInputStream(fileLoc);
			fileReader = new InputStreamReader(file);
			br = new BufferedReader(fileReader);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static String readLine(){
		String lineText = null;
		try{
			lineText = br.readLine();
		}catch (Exception e){
			e.printStackTrace();
		}
		return lineText;
	}
	
	public static void closeFile(){
		try{
			if(file != null)file.close();
			if(fileReader != null)file.close();
			if(br != null) br.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws Exception{
		openFile("C:/Users/tObIeWeE/Desktop/ski_map.txt");
		String lineContent = null;
		while ((lineContent = readLine()) != null){
			System.out.println(lineContent);
		}
		closeFile();
	}
	
}
