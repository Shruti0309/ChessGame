package main.java;

import java.util.List;

import main.java.model.Piece;


/**
 *  Represents type of piece to be placed chess e.g Knight or Rook
 *  
 */
public interface PieceType {
	
	public List<String> possibleMoves(Piece[][] chessBoard, Piece piece);
	
}
