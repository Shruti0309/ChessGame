package main.java.utils;

import main.java.model.Piece;

/**
 * Helper class containing bunch of related methods to be reused across application 
 */
public class ChessUtils {

	/** Checks if target square is within the range of chess board
	 * @param chessBoard
	 * @param column
	 * @param row
	 * @return boolean
	 */
	
	public static boolean isValidSquare(Piece[][] chessBoard, int nxtcolumn, int nxtrow) {
		return ((nxtrow) > 0 && (nxtcolumn) > 0) && ((nxtrow) <= chessBoard.length && (nxtcolumn) <= chessBoard.length);
	}

	/** Check if target square is empty
	 * @param chessBoard
	 * @param column
	 * @param row
	 * @return boolean
	 */
	
	public static  boolean isValidSquareEmpty(Piece[][] chessBoard, int column, int row) {
		if(chessBoard[row][column] == null) {
			return true;
		}
		return false;

	}
	
	/** Checks if piece can be moved to the target square
	 * @param chessBoard
	 * @param piece
	 * @param column
	 * @param row
	 * @return boolean
	 */
	public static boolean isValidMove(Piece[][] chessBoard, Piece piece, int column, int row) {
		if (chessBoard[row - 1][column - 1] != null
				&& !ChessUtils.checkType(chessBoard[row - 1][column - 1], piece)) {
			return false;
		}
		return true;
	}
	
	/** Check if objects are of different type
	 * @param piece object1
	 * @param  piece object2
	 * @return boolean
	 */
	public static boolean checkType(Piece object1, Piece object2) {

		String type1 = object1.getPieceColor();
		String type2 = object2.getPieceColor();
		if(!type1.equalsIgnoreCase(type2)) {
			return true;
		}
		return false;
	}

	/** Returns the target square for piece
	 * @param column
	 * @param row
	 * @return String index
	 */
	public static String getTargetIndex(int column, int row) {
		char ch = (char) ((column) + 64);
		String index = String.valueOf(ch).toLowerCase().concat(String.valueOf(row));
		return index;
	}

	/** Returns row index
	 * @param position
	 * @return int
	 */
	public static int getRow(String position) {
		int row = Integer.parseInt(position.substring(1));
		return row;
	}

	/** Returns column index
	 * @param position
	 * @return int
	 */
	public static int getColumn(String position) {
		int column = position.toUpperCase().charAt(0) - 64;
		return column;
	}

	/** Places the piece on target square 
	 * @param chess
	 * @param pieceObject
	 * @return boolean
	 */
	public static boolean placePieceoOnBoard(Piece[][] chess,Piece pieceObject) {


		String color = pieceObject.getPieceColor();
		String type = pieceObject.getPieceType();
		String position = pieceObject.getPiecePosition();


		if((color.equals("W") || color.equals("B")) && 
				(type.equals("R") || type.equals("N"))){
			int column = position.toUpperCase().charAt(0) - 65;
			int row = Integer.parseInt(position.substring(1)) - 1;
			if(isValidSquareEmpty(chess,column,row)) {
				chess[row][column] = pieceObject;
				return true;
			}
		}

		return false;
	}

	/** Prints the chess board
	 * @param chessBoard
	 */
	public static void printChessBoard(Piece[][] chessBoard) {
		System.out.println();
		System.out.println("--------------------------------");
		for(int row = chessBoard.length -1 ; row >= 0 ; row--) {
			for(int col = 0; col < chessBoard[row].length; col++) {
				if(chessBoard[row][col] != null) {

					System.out.print(chessBoard[row][col].getPieceType()+":"+chessBoard[row][col].getPieceColor()+"|");
				}
				else {
					System.out.print("   |");
				}
			}
			System.out.println();
			System.out.println("--------------------------------");

		}
	}
}
