package skiproblem;

public class MapPoint {
	private int pointValue;
	private int pointRow;
	private int pointCol;
	
	public MapPoint(){
		pointValue = 0;
		pointRow = 0;
		pointCol = 0;
	}
	
	public int getPointValue() {
		return pointValue;
	}
	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}
	public int getPointRow() {
		return pointRow;
	}
	public void setPointRow(int pointRow) {
		this.pointRow = pointRow;
	}
	public int getPointCol() {
		return pointCol;
	}
	public void setPointCol(int pointCol) {
		this.pointCol = pointCol;
	}
}
