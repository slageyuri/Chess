package chess;

import Boardgame.Board;
import chess.Pieces.King;
import chess.Pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch(){
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int i=0; i< board.getRows(); i++){
                for(int j=0; j<board.getColumns(); j++){
                    mat[i][j] = (ChessPiece) board.piece(i,j);
                }
        }
        return mat;
    }
    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }
    private void initialSetup(){
        placeNewPiece('h',1,new Rook(board, Color.BLACK));
        placeNewPiece('e',1,new King(Color.WHITE, board));
        placeNewPiece('e',8,new King(Color.BLACK, board));

    }


}
