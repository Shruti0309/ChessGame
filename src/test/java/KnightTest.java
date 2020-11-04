package test.java;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import main.java.Knight;
import main.java.model.Piece;
import main.java.utils.ChessUtils;

public class KnightTest {

	Piece[][] chess = new Piece[8][8];
	Knight knight = new Knight();
	
	@Test
	public void test_Valid_Knight_Moves() {
		
		String[] expectedMoves = {"a3","a5","b2","d2","b6","d6","e3","e5"};
		Piece knightObj = new Piece("W", "c4", "N"); 
		ChessUtils.placePieceoOnBoard(chess, knightObj);
		ChessUtils.printChessBoard(chess);
		List<String> actualMoves = knight.possibleMoves(chess, knightObj); 
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : Arrays.asList(expectedMoves)) {
			knightObj.setPiecePosition(s);
			ChessUtils.placePieceoOnBoard(chess, knightObj);
		}
		ChessUtils.printChessBoard(chess);
		
	}
	
	@Test
	public void test_Valid_Knight_Moves_With_Same_Color_Piece() {
		
		String[] expectedMoves = {"a3","b2","d2","b6","d6","e3","e5"};
		Piece knightObj = new Piece("W", "c4", "N");
		Piece rookObj = new Piece("W", "a5", "R");
		ChessUtils.placePieceoOnBoard(chess, knightObj);
		ChessUtils.placePieceoOnBoard(chess, rookObj);
		ChessUtils.printChessBoard(chess);
		
		List<String> actualMoves = knight.possibleMoves(chess, knightObj);
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : Arrays.asList(expectedMoves)) {
			knightObj.setPiecePosition(s);			
			ChessUtils.placePieceoOnBoard(chess, knightObj);
		}
		ChessUtils.printChessBoard(chess);
		
	}
	
	
	
	@Test
	public void test_Valid_Knight_Moves_With_Different_Color_Piece() {
		
		String[] expectedMoves = {"a3","a5","b2","d2","b6","d6","e3","e5"};
		Piece knightObj = new Piece("W", "c4", "N");
		Piece rookObj = new Piece("B", "a5", "R");
		ChessUtils.placePieceoOnBoard(chess, knightObj);
		ChessUtils.placePieceoOnBoard(chess, rookObj);
		ChessUtils.printChessBoard(chess);
		
		List<String> actualMoves = knight.possibleMoves(chess, knightObj); 	
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : Arrays.asList(expectedMoves)) {
			knightObj.setPiecePosition(s);			
			ChessUtils.placePieceoOnBoard(chess, knightObj);
			
		}
		ChessUtils.printChessBoard(chess);
		
	}
	
	@Test
	public void test_Valid_Knight_Moves_At_Top_Left_Corner() {
		
		String[] expectedMoves = {"c7","b6"};
;		Piece knightObj = new Piece("W", "a8", "N");
		ChessUtils.placePieceoOnBoard(chess, knightObj);
		ChessUtils.printChessBoard(chess);
		
		List<String> actualMoves = knight.possibleMoves(chess, knightObj); 
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : Arrays.asList(expectedMoves)) {
			knightObj.setPiecePosition(s);			
			ChessUtils.placePieceoOnBoard(chess, knightObj);
		}
		ChessUtils.printChessBoard(chess);
		
	}
	

	@Test
	public void test_Valid_Knight_Moves_At_Top_Right_Corner() {
		
		String[] expectedMoves = {"f7","g6"};
		Piece knightObj = new Piece("W", "h8", "N");
		ChessUtils.placePieceoOnBoard(chess, knightObj);
		ChessUtils.printChessBoard(chess);
		
		List<String> actualMoves = knight.possibleMoves(chess, knightObj); 
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : Arrays.asList(expectedMoves)) {
			knightObj.setPiecePosition(s);			
			ChessUtils.placePieceoOnBoard(chess, knightObj);
		}
		ChessUtils.printChessBoard(chess);
		
	}
	
	
	
	@Test
	public void test_Valid_Knight_Moves_At_Right_Bottom_Corner() {
		
		String[] expectedMoves = {"f2","g3"};
		Piece knightObj = new Piece("W", "h1", "N");
		ChessUtils.placePieceoOnBoard(chess, knightObj);
		ChessUtils.printChessBoard(chess);
		
		List<String> actualMoves = knight.possibleMoves(chess, knightObj); 
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : Arrays.asList(expectedMoves)) {
			knightObj.setPiecePosition(s);			
			ChessUtils.placePieceoOnBoard(chess, knightObj);
		}
		ChessUtils.printChessBoard(chess);
		
	}
	
	
	@Test
	public void test_Valid_Knight_Moves_At_Left_Bottom_Corner() {
		
		String[] expectedMoves = {"b3","c2"};
		Piece knightObj = new Piece("W", "a1", "N");
		ChessUtils.placePieceoOnBoard(chess, knightObj);
		ChessUtils.printChessBoard(chess);
		
		List<String> actualMoves = knight.possibleMoves(chess, knightObj);
		assertTrue(actualMoves.containsAll(Arrays.asList(expectedMoves)));
		for(String s : Arrays.asList(expectedMoves)) {
			knightObj.setPiecePosition(s);			
			ChessUtils.placePieceoOnBoard(chess, knightObj);
			
		}
		ChessUtils.printChessBoard(chess);
		
	}
}
