# ChessGame
Chess #2 (Rooks & Knights)

Certain considerations:
1. Chess is 8X8 grid Matrix where squares are noted using letter and number where letter indicates column and number indicates row.
2. Chess piece are either Black(B) or White(W) color and piece type can be either Rook(R) or Knight(K)
3. Piece type can be only K or R
4. Piece color can only be W or B
5. Piece position can be between [a-h][1-8] where a8 is top left corner, h8 top right corner, a1 bottom left corner, h1 is bottom right corner of chess board
6. No more than 2 Rooks or knights of same color are allowed on chess board
7. Two pieces can not be placed on same Square.
8. Rooks and Knight moves are defined as per the requirement in problem statement.

This program returns valid moves for Rooks and Knights on Chess based on the piece positions.

E.g
Input to the program
Number of Piece : 1
Type : R
Color : W
Position : c3

Expected output:
Valid moves : [c4 c5 c6 c7 c8 d3 e3 f3 g3 h3 c2 c1 b3 a3 ]
