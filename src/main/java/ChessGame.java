package main.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

import main.java.model.Piece;
import main.java.utils.ChessUtils;

public class ChessGame {

	/** This method finds the valid moves for the given piece on chess board
	 * @param chess - chess board 8*8 matrix
	 * @param pieceList - List of pieces for which valid moves are to be found
	 * @return void
	 */
	public static void process(Piece[][] chess, List<Piece> pieceList) {
		for (Piece pieceObj : pieceList) {
			if (!ChessUtils.placePieceoOnBoard(chess, pieceObj)) {
				System.out.println("Your input is invalid");
				return;
			}
		}
		ChessUtils.printChessBoard(chess);
		List<String> rookMoves = null;
		List<String> knightMoves = null;
		System.out.println("Valid Moves ");
		for (Piece object : pieceList) {
			if (object.getPieceType().equals("R")) {
				Rook rookObj = new Rook();
				rookMoves = rookObj.possibleMoves(chess, object);

				System.out.print("R on "+object.getPiecePosition()+" : ");
				System.out.print("[");
				for (String rookMove : rookMoves) {
					System.out.print(rookMove + " ");
					object.setPiecePosition(rookMove);
				}
				System.out.print("]");
				System.out.println();
			} else {
				Knight knightObj = new Knight();
				knightMoves = knightObj.possibleMoves(chess, object);

				System.out.print("K on "+object.getPiecePosition()+" : ");
				System.out.print("[");
				for (String knightMove : knightMoves) {
					System.out.print(knightMove + " ");
					object.setPiecePosition(knightMove);
				}
				System.out.print("]");
				System.out.println();
			}
		}

	}

	/** Validates input from user 
	  Validation is implemented for piece color, piece type and if piece is within the valid chess board range
	 * @param pieceObject
	 * @return boolean
	 */
	private static boolean validatePiece(Piece pieceObject, Map<String,Integer> map) {
		String pieceObjectCount = pieceObject.getPieceType()+pieceObject.getPieceColor();
		String pattern = "[a-h][1-8]";
		

		if (!(pieceObject.getPieceColor().equals("W") || pieceObject.getPieceColor().equals("B"))) {
			System.out.println("Invalid Piece Color, Please Try Again: ");
			return false;
		}
		if (!(pieceObject.getPieceType().equals("R") || pieceObject.getPieceType().equals("N"))) {
			System.out.println("Invalid Piece Type, Please Try Again: ");
			return false;
		}
		if (!Pattern.matches(pattern, pieceObject.getPiecePosition()) || 
				!ChessUtils.isValidSquare(new Piece[8][8], ChessUtils.getColumn(pieceObject.getPiecePosition()),
				ChessUtils.getRow(pieceObject.getPiecePosition()))) {
			System.out.println("Invalid Piece position, Please Try Again: ");
			return false;
		}

		if(map.get(pieceObjectCount) > 2) {
			System.out.println("More than 2 same Piece not allowed, Please Try Again: ");
			return false;
		}
		return true;
	}

	/** This method accepts input from user
	 * @param inputScanner : piece details
	 * @return List<Piece>
	 */
	public static List<Piece> getInput(Scanner inputScanner) {

		List<Piece> pieceList = new ArrayList<Piece>();
		Map<String,Integer> map = new HashMap<>();
		

		String colour = "", type = "", position = "";
		System.out.println("Enter the number of pieces: ");
		int pieces = 0;
		do {
			while (!inputScanner.hasNextInt()) {
				String input = inputScanner.next();
				System.out.printf("\"%s\" is not a valid number.Try again \n", input);
			}
			pieces = inputScanner.nextInt();
		}while(pieces < 0);

		for (int i = 1; i <= pieces; i++) {
			int value = 1;
			boolean isValid = false;
			Piece pieceObject = null;
			do {
				System.out.println("Piece : " + i);
				System.out.println("Enter colour (W/B): ");
				colour = inputScanner.next();
				System.out.println("Enter Type (R/N): ");
				type = inputScanner.next();
				System.out.println("Enter position :");
				position = inputScanner.next();
				
				pieceObject = new Piece(colour, position, type);
				String pieceObjectCount = pieceObject.getPieceType()+pieceObject.getPieceColor();
				if(map.containsKey(pieceObjectCount)) {

					map.put(pieceObjectCount,map.get(pieceObjectCount)+1);
				}
				else {
					map.put(pieceObjectCount, value);
				}
				isValid = validatePiece(pieceObject,map);
			} while (isValid == false);
			pieceList.add(pieceObject);
		}


		return pieceList;
	}



	/* Starting point of the Application 
	 * This application takes chess piece input from user and displays it's possible
	 * moves on chess board 
	 * */
	public static void main(String[] args) {

		String answer;
		do {
			System.out.flush();
			Scanner input = new Scanner(System.in);
			Piece[][] chess = new Piece[8][8];
			List<Piece> pieceList = getInput(input);
			if(pieceList != null && pieceList.size() > 0) {
				process(chess, pieceList);
			}
			System.out.println("\nContinue (Y/N)?: ");
			answer = input.next();
		} while (answer.equalsIgnoreCase("Y"));

	}

}
