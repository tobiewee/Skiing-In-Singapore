package skiproblem;

import java.util.ArrayList;

public class Map {
	private int width;
	private int height;
	private int length;
	private ArrayList map;
	
	public Map(){
		width = 1;
		height = 1;
		length = 1;
		map = new ArrayList<ArrayList<Integer>>();
	}
	
	public Map(int w, int h){
		width = w;
		height = h;
		length = 0;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public int getLength(){
		return length;
	}
}
