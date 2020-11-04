package test.java;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.java.Rook;
import main.java.model.Piece;
import main.java.utils.ChessUtils;

public class RookTest {
	
	Piece[][] chess = new Piece[8][8];
	Rook rook = new Rook();

	@Test
	public void test_Valid_Rook_Moves() {
		Piece rookObj = new Piece("W", "c4", "R"); 
		String[] expectedMoves = {"c5","c6","c7","c8","d4","e4","f4","g4","h4","c3","c2","c1","b4","a4"};
				
		ChessUtils.placePieceoOnBoard(chess, rookObj);
		ChessUtils.printChessBoard(chess);
		List<String> actualMoves = rook.possibleMoves(chess, rookObj); 
		
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : actualMoves) {
			rookObj.setPiecePosition(s);
			ChessUtils.placePieceoOnBoard(chess, rookObj);
		}
		ChessUtils.printChessBoard(chess);
		
	}
	
	@Test
	public void test_Valid_Rook_Moves_at_Right_top_Corner() {
		
		Piece rookObj = new Piece("W", "h8", "R"); 
		String[] expectedMoves = {"h7","h6","h5","h4","h3","h2","h1","a8","b8","c8","d8","e8","f8","g8"};
				
		ChessUtils.placePieceoOnBoard(chess, rookObj);
		ChessUtils.printChessBoard(chess);
		List<String> actualMoves = rook.possibleMoves(chess, rookObj); 
		
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : actualMoves) {
			rookObj.setPiecePosition(s);
			ChessUtils.placePieceoOnBoard(chess, rookObj);
		}
		ChessUtils.printChessBoard(chess);
		
	}
	
	@Test
	public void test_Valid_Rook_Moves_at_Left_top_Corner() {
		this.chess = new Piece[8][8];
		Piece rookObj = new Piece("W", "a8", "R"); 
		String[] expectedMoves = {"a7","a6","a5","a4","a3","a2","a1","h8","b8","c8","d8","e8","f8","g8"};
				
		ChessUtils.placePieceoOnBoard(chess, rookObj);
		ChessUtils.printChessBoard(chess);
		List<String> actualMoves = rook.possibleMoves(chess, rookObj); 
		
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : actualMoves) {
			rookObj.setPiecePosition(s);
			ChessUtils.placePieceoOnBoard(chess, rookObj);
		}
		ChessUtils.printChessBoard(chess);
	}
	
	@Test
	public void test_Valid_Rook_Moves_at_Left_Bottom_Corner() {
		this.chess = new Piece[8][8];
		Piece rookObj = new Piece("W", "a1", "R"); 
		String[] expectedMoves = {"a8","a7","a6","a5","a4","a3","a2","h1","b1","c1","d1","e1","f1","g1"};
		ChessUtils.placePieceoOnBoard(chess, rookObj);
		ChessUtils.printChessBoard(chess);
		List<String> actualMoves = rook.possibleMoves(chess, rookObj); 
		
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : actualMoves) {
			rookObj.setPiecePosition(s);
			ChessUtils.placePieceoOnBoard(chess, rookObj);
		}
		ChessUtils.printChessBoard(chess);
	}
	
	
	@Test
	public void test_Valid_Rook_Moves_at_Right_Bottom_Corner() {
		this.chess = new Piece[8][8];
		Piece rookObj = new Piece("W", "h1", "R"); 
		String[] expectedMoves = {"h7","h6","h5","h4","h3","h2","h8","a1","b1","c1","d1","e1","f1","g1"};
				
		ChessUtils.placePieceoOnBoard(chess, rookObj);
		ChessUtils.printChessBoard(chess);
		List<String> actualMoves = rook.possibleMoves(chess, rookObj); 
		
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : actualMoves) {
			rookObj.setPiecePosition(s);
			ChessUtils.placePieceoOnBoard(chess, rookObj);
		}
		ChessUtils.printChessBoard(chess);
	}
	
	@Test
	public void test_Valid_Rook_Moves_With_Same_Color_Piece() {
		this.chess= new Piece[8][8];
		String[] expectedMoves = {"a4","a3","a2","a1","a6","a7","a8","b5"};
		Piece knightObj = new Piece("W", "c5", "N");
		Piece rookObj = new Piece("W", "a5", "R");
		ChessUtils.placePieceoOnBoard(chess, knightObj);
		ChessUtils.placePieceoOnBoard(chess, rookObj);
		ChessUtils.printChessBoard(chess);
		List<String> actualMoves = rook.possibleMoves(chess, rookObj); 
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : Arrays.asList(expectedMoves)) {
			rookObj.setPiecePosition(s);
			ChessUtils.placePieceoOnBoard(chess, rookObj);
		}
		ChessUtils.printChessBoard(chess);
		
	}
	
	@Test
	public void test_Valid_Rook_Moves_With_Different_Color_Piece() {
		this.chess= new Piece[8][8];
		String[] expectedMoves = {"a4","a3","a2","a1","a6","a7","a8","b5","c5"};
		Piece knightObj = new Piece("W", "c5", "N");
		Piece rookObj = new Piece("B", "a5", "R");
		ChessUtils.placePieceoOnBoard(chess, knightObj);
		ChessUtils.placePieceoOnBoard(chess, rookObj);
		ChessUtils.printChessBoard(chess);
		List<String> actualMoves = rook.possibleMoves(chess, rookObj); 
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : Arrays.asList(expectedMoves)) {
			rookObj.setPiecePosition(s);
			ChessUtils.placePieceoOnBoard(chess, rookObj);
		}
		ChessUtils.printChessBoard(chess);
		
	}

	
	
}
