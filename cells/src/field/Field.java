package field;

import java.util.ArrayList;


import location.Location;
import cell.Cell;

public class Field {
	Location sd=new Location(1,2);
	
	private static final Location[] adjacent = {
		new Location(-1,-1), new Location(-1,0),new Location(-1,1),
		new Location(0,-1), new Location(0,0),new Location(0,1),
		new Location(1,-1), new Location(1,0),new Location(1,1)
	};
	private int width;
	private int height;
	private Cell[][] field;
	
	
	public Field(int width, int height) {
		this.width = width;
		this.height = height;
		field = new Cell[height][width];
	}
	
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	
	public Cell place(int row, int col, Cell o) {
		Cell ret = field[row][col];
		field[row][col] = o;
		return ret;
	}
	
	public Cell get(int row, int col) {
		return field[row][col];
	}
	
	public Cell[] getNeighbour(int row, int col) {
		ArrayList<Cell> list = new ArrayList<Cell>();
		for ( int i=-1; i<2; i++ ) {
			for ( int j=-1; j<2; j++ ) {
				int r = row+i;
				int c = col+j;
				if ( r >-1 && r<height && c>-1 && c<width && !(r== row && c == col) ) {
					list.add(field[r][c]);
				}
			}
		}
		return list.toArray(new Cell[list.size()]);
	}
	
	public Cell remove(int x, int y)
	{
		Cell ret = field[x][y];
		field[x][y] = null;
		return ret;
	}
	public Cell remove(Cell cell)
	{
		for(int i=0; i<width; i++)
			for(int j=0; j<height; j++)
				if(field[i][j] == cell)
				{
					field[i][j] = null;
				}
		return cell;
	}
	
	public void move(int row, int col, Location loc)
	{
		field[loc.x][loc.y] = field[row][col];
		field[row][col] = null;
	}
	
	public Location[] getFreeNeighbour(int row, int col)
	{
		ArrayList<Location> list = new ArrayList<Location>();
		for(int i=0; i<9; i++)
		{
			int x = row+adjacent[i].x;
			int y = col+adjacent[i].y;
			if( x>=0&&y>=0&&x<width&&y<height&&field[x][y] == null)
				list.add(new Location(x,y));
		}
		return list.toArray(new Location[list.size()]);
	}
	public void clear() {
		for ( int i=0; i<height; i++ ) {
			for ( int j=0; j<width; j++ ) {
				field[i][j] = null;
			}
		}
	}
	public void placeRandomAdj(int row, int col,Cell cell)
	{
		Location[] loc = getFreeNeighbour(row,col);
		if(loc.length>0)
		{
			Location temp = loc[(int)(loc.length*Math.random())];
			field[temp.x][temp.y] = cell;
		}
	}
}
