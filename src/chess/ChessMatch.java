package chess;

import Boardgame.Board;
import Boardgame.Position;
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
    private void initialSetup(){
        board.placePiece(new Rook(board, Color.BLACK), new Position(0,0));
        board.placePiece(new King(Color.WHITE, board), new Position(0,4));
        board.placePiece(new King(Color.BLACK, board), new Position(7,4));
    }


}
