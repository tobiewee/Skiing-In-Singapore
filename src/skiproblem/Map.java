package skiproblem;

import java.util.ArrayList;

public class Map {
	private int rows;
	private int cols;
	private int length;
	private ArrayList<ArrayList<Integer>> map;
	
	public Map(){
		rows = 1;
		cols = 1;
		length = 1;
		map = new ArrayList<ArrayList<Integer>>();
	}
	
	public Map(int r, int c){
		rows = r;
		cols = c;
		length = 0;
		map = new ArrayList<ArrayList<Integer>>();
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
	
	public void addRow(ArrayList<Integer> newRow){
		map.add(newRow);
	}
	
	/*
	 * Problem Solver.
	 */
	public void findSolution(){
		//Perform tasks here.
	}
	
	/*
	 * Methods defined for Debug.
	 */
	public void printDimensions(){
		System.out.print(rows + " " + cols + '\n');
	}
	
	public void printMapData(){
		int cnt;
		for(ArrayList<Integer> row: map){
			cnt=0;
			for(int col: row){
				System.out.print(col);
				if(cnt != row.size()-1) System.out.print(" ");
				cnt++;
			}
			System.out.println();
		}
	}
}
