package skiproblem;

import java.util.ArrayList;

public class Map {
	private int rows;
	private int cols;
	private int length;
	//private ArrayList map;
	
	public Map(){
		rows = 1;
		cols = 1;
		length = 1;
		//map = new ArrayList<ArrayList<Integer>>();
	}
	
	public Map(int r, int c){
		rows = r;
		cols = c;
		length = 0;
	}
	
	public int getRows(){
		return rows;
	}
	
	public int getCols(){
		return cols;
	}
	
	public int getLength(){
		return length;
	}
}
