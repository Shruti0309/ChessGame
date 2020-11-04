package main.java.model;



public class Piece {

	private String pieceColor;
	private String piecePosition;
	private String PieceType;

	public Piece() {

	}

	public Piece(String pieceColor, String piecePosition, String pieceType) {
		super();
		this.pieceColor = pieceColor;
		this.piecePosition = piecePosition;
		PieceType = pieceType;
	}

	public String getPieceColor() {
		return pieceColor;
	}
	public void setPieceColor(String pieceColor) {
		this.pieceColor = pieceColor;
	}
	public String getPiecePosition() {
		return piecePosition;
	}
	public void setPiecePosition(String piecePosition) {
		this.piecePosition = piecePosition;
	}
	public String getPieceType() {
		return PieceType;
	}
	public void setPieceType(String pieceType) {
		PieceType = pieceType;
	}

	@Override
	public String toString() {
		return "Piece [pieceColor=" + pieceColor + ", piecePosition=" + piecePosition + ", PieceType=" + PieceType
				+ "]";
	}
}
