package recurssionBackTracking;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
	public static void helper(char[][] board ,List<List<String>> allBoard ,int col) {
		if(col == board.length) {
			saveBoard(board , allBoard);
			return;
		}
		for(int row = 0 ; row<board.length ; row++) {
			if(isSafe(row, col , board)) {
				board[row][col] = 'Q';
				helper(board, allBoard, col+1);//if safe then call next col
				board[row][col] ='.'; //if not safe then put . using backtracking
			}
		}
	}
	
	public static void saveBoard(char[][] board, List<List<String>> allBoard) {
		String  row ="";
		List<String> newBoard = new ArrayList<>();
		for(int i=0;i<board.length ; i++ ) {
			row ="";
			for(int j = 0 ; j<board[0].length ;j++) {
				if(board[i][j] == 'Q')
					row += 'Q';
				row +='.';
			}
			newBoard.add(row);
		}
		allBoard.add(newBoard);
		
	}
	public static boolean isSafe(int row , int col , char[][ ] board) {
		 // Horizontal
		 for(int j = 0 ; j< board.length ;j++) {
			 if(board[row][j] == 'Q') return false;
		 }
		//vertical row wise
		 for(int i = 0 ; i< board.length ; i++) {
			 if(board[i][col] == 'Q') return false;
		 }
		 // Upper left row -- ; col -- 
		 int r= row, c = col;
		 while (c>=0 && r>=0){
			if(board[r][c] == 'Q') return false;
			r--;c--;
		 }
		 //upper right
		 r= row; c = col;
		 while (r>=0 && c<board.length) {
			if(board[r][c]== 'Q') return false;
			r--; c++;
		 }
		 //Lower left
		 r= row; c = col;
		 while (r<board.length && c>=0) {
			 if(board[r][c] == 'Q') return false;
	         r++;c--;
	         }
		 //lower right
         r = row ; c = col;
         while(r<board.length && c<board.length) {
        	 if(board[r][c] == 'Q') return false;
        	 r++;c++;
         }
         return true;
	}
		
         
		
	


	public List<List<String>> sloveNQueen(int n){
		List<List<String>> allBoard = new ArrayList<>();
		char[][] board = new char[n][n];
		helper(board, allBoard, 0);
		return allBoard;
	}
}
