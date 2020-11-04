package main.java;

import java.util.ArrayList;
import java.util.List;

import main.java.model.Piece;
import main.java.utils.ChessUtils;

/**
 * Implements functionality related to piece Rook
 */
public class Rook implements PieceType {

	/**
	 * Returns list of all possible rook moves
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

		for (int i = row; i < chessBoard.length; i++) {
			if (chessBoard[i][column-1] != null ) {
				boolean result = ChessUtils.checkType(chessBoard[i][column-1], piece);
				if (result) {
					String index = ChessUtils.getTargetIndex(column, i+1);
					list.add(index);
				}
				break;
			} else {
				String index = ChessUtils.getTargetIndex(column, i+1);
				list.add(index);
			}
		}
		for (int i = column ; i < chessBoard.length; i++) {
			if (chessBoard[row-1][i] != null) {
				boolean result = ChessUtils.checkType(chessBoard[row-1][i], piece);
				if (result) {
					String index = ChessUtils.getTargetIndex(i+1, row);
					list.add(index);
				}
				break;
			} else {
				String index = ChessUtils.getTargetIndex(i+1, row);
				list.add(index);
			}
		}
		
		for (int i = row - 2; i >= 0; i--) {
			if (chessBoard[i][column-1] != null ) {
				boolean result = ChessUtils.checkType(chessBoard[i][column-1], piece);
				if (result) {
					String index = ChessUtils.getTargetIndex(column, i+1);
					list.add(index);
				}
				break;
			} else {
				String index = ChessUtils.getTargetIndex(column, i+1);
				list.add(index);
			}
		}
		for (int i = column - 2 ; i >= 0; i--) {
			if (chessBoard[row-1][i] != null) {
				boolean result = ChessUtils.checkType(chessBoard[row-1][i], piece);
				if (result) {
					String index = ChessUtils.getTargetIndex(i+1, row);
					list.add(index);
				}
				break;
			} else {
				String index = ChessUtils.getTargetIndex(i+1, row);
				list.add(index);
			}
		}
		return list;
	}

	

}
