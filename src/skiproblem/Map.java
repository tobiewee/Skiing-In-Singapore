package skiproblem;

import java.util.ArrayList;
import skiproblem.MapPoint;

public class Map {	
	private int rows;
	private int cols;
	private int maxDrop;
	private ArrayList<ArrayList<Integer>> map;
	
	// Storing Highest and Lowest points in Map, as Start and End.
	private MapPoint highest;
	private MapPoint lowest;
	
	public Map(){
		rows = 1;
		cols = 1;
		maxDrop = 0;
		map = new ArrayList<ArrayList<Integer>>();
		highest = new MapPoint();
		lowest = new MapPoint();
	}
	
	public Map(int r, int c){
		rows = r;
		cols = c;
		maxDrop = 0;
		map = new ArrayList<ArrayList<Integer>>();
		highest = new MapPoint();
		lowest = new MapPoint();
	}
	
	public int getRows(){
		return rows;
	}
	
	public int getCols(){
		return cols;
	}
	
	public int getMaxDrop(){
		return maxDrop;
	}
	
	public void addRow(ArrayList<Integer> newRow){
		map.add(newRow);
	}
	
	/*
	 * Problem Solver.
	 */
	private void checkSetHighest(int ptVal, int row, int col){
		if(ptVal > highest.getPointValue()){
			highest.setPointValue(ptVal);
			highest.setPointRow(row);
			highest.setPointCol(col);
		}
	}
	
	private void checkSetLowest(int ptVal, int row, int col){
		if(ptVal < lowest.getPointValue()){
			lowest.setPointValue(ptVal);
			lowest.setPointRow(row);
			lowest.setPointCol(col);
		}
	}
	
	private void findHighestAndLowest(){
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				int ptVal = map.get(i).get(j);
				if(i == 0 && j == 0){
					highest.setPointValue(ptVal);
					lowest.setPointValue(ptVal);
					//No need to set coordinates as is already 0.
				} else{
					checkSetHighest(ptVal, i , j);
					checkSetLowest(ptVal, i, j);
				}
			}
		}
	}
	
	private void findSearchLimit(){
		maxDrop = highest.getPointValue() - lowest.getPointValue();
	}
	
	public void findSolution(){
		//Perform tasks here.
		findHighestAndLowest();
		findSearchLimit();
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
	
	public void printHighestPoint(){
		System.out.println("Highest Point: " + highest.getPointValue());
	}
	
	public void printLowestPoint(){
		System.out.println("Lowest Point: " + lowest.getPointValue());
	}
	
	public void printSearchLimit(){
		System.out.println("Largest possible drop (Search Limit): " + maxDrop);
	}
}
