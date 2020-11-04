package main.java;

import java.util.ArrayList;
import java.util.List;

import main.java.model.Piece;
import main.java.utils.ChessUtils;

/**
* Implements functionality related to piece Knight
*/
public class Knight implements PieceType {

	/**
	 * Returns list of all possible knight moves
	 * @param chess board array
	 * @param piece object
	 * @return list of possible Moves
	 *
	 */
	@Override
	public List<String> possibleMoves(Piece[][] chessBoard, Piece piece) {

		List<String> list = new ArrayList<>();
		String position = piece.getPiecePosition();
		int column = ChessUtils.getColumn(position);
		int row = ChessUtils.getRow(position);

	
		if (ChessUtils.isValidSquare(chessBoard, column - 2, row - 1)
				&& ChessUtils.isValidMove(chessBoard, piece, column - 2, row - 1)) {
			String index = ChessUtils.getTargetIndex(column - 2, row - 1);
			list.add(index);
		}

		if (ChessUtils.isValidSquare(chessBoard, column - 2, row + 1)
				&& ChessUtils.isValidMove(chessBoard, piece, column - 2, row + 1)) {
			String index = ChessUtils.getTargetIndex(column - 2, row + 1);
			list.add(index);
		}

		if (ChessUtils.isValidSquare(chessBoard, column + 2, row - 1)
				&& ChessUtils.isValidMove(chessBoard, piece, column + 2, row - 1)) {
			String index = ChessUtils.getTargetIndex(column + 2, row - 1);
			list.add(index);
		}

		if (ChessUtils.isValidSquare(chessBoard, column + 2, row + 1)
				&& ChessUtils.isValidMove(chessBoard, piece, column + 2, row + 1)) {
			String index = ChessUtils.getTargetIndex(column + 2, row + 1);
			list.add(index);
		}

		if (ChessUtils.isValidSquare(chessBoard, column - 1, row - 2)
				&& ChessUtils.isValidMove(chessBoard, piece, column - 1, row - 2)) {
			String index = ChessUtils.getTargetIndex(column - 1, row - 2);
			list.add(index);
		}

		if (ChessUtils.isValidSquare(chessBoard, column + 1, row - 2)
				&& ChessUtils.isValidMove(chessBoard, piece, column + 1, row - 2)) {
			String index = ChessUtils.getTargetIndex(column + 1, row - 2);
			list.add(index);
		}

		if (ChessUtils.isValidSquare(chessBoard, column - 1, row + 2)
				&& ChessUtils.isValidMove(chessBoard, piece, column - 1, row + 2)) {
			String index = ChessUtils.getTargetIndex(column - 1, row + 2);
			list.add(index);
		}

		if (ChessUtils.isValidSquare(chessBoard, column + 1, row + 2)
				&& ChessUtils.isValidMove(chessBoard, piece, column + 1, row + 2)) {
			String index = ChessUtils.getTargetIndex(column + 1, row + 2);
			list.add(index);
		}

		return list;
	}

}
