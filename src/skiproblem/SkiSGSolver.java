package skiproblem;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import skiproblem.Map;

public class SkiSGSolver {

	private static Map skiMap = null; // one and only Map to solve.
	private static int currLineNo = 0; // to track no of lines read.
	
	private static InputStream file = null;
	private static InputStreamReader fileReader= null;
	private static BufferedReader br = null;

	private static void openFile(String fileLoc){
		try{
			file = new FileInputStream(fileLoc);
			fileReader = new InputStreamReader(file);
			br = new BufferedReader(fileReader);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	private static void initMap(String [] tmp){
		int rows = stringToInt(tmp[0]);
		int cols = stringToInt(tmp[1]);
		skiMap = new Map(rows, cols);
	}
	
	private static String readLine(){
		String lineText = null;
		try{
			lineText = br.readLine();
		}catch (Exception e){
			e.printStackTrace();
		}
		return lineText;
	}
	
	private static void closeFile(){
		try{
			if(file != null)file.close();
			if(fileReader != null)file.close();
			if(br != null) br.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static int stringToInt(String s){
		return Integer.parseInt(s);
	}
	
	private static ArrayList<Integer> stringToRowData(String[] tmp){
		ArrayList<Integer> rowData = new ArrayList<Integer>();
		for(int i = 0; i < tmp.length; i++){
			rowData.add(stringToInt(tmp[i]));
		}
		return rowData;
	}
	
	private static void readMapData(){
		String lineContent = null;
		String [] tmp = null;
		
		while ((lineContent = readLine()) != null){
			tmp = lineContent.split(" ");
			if(currLineNo == 0){
				//initialize map
				initMap(tmp);
			} else{
				//add ArrayList to map
				skiMap.addRow(stringToRowData(tmp));
			}
			currLineNo++;
		}
	}
	
	public static void main(String[] args) throws Exception{
		openFile("resources/map/map_4x4.txt");
		readMapData();
		closeFile();
		skiMap.findSolution();
		
		// Debugging
		skiMap.printDimensions();
		skiMap.printMapData();
		skiMap.printHighestPoint();
		skiMap.printLowestPoint();
		skiMap.printSearchLimit();
	}
	
}
