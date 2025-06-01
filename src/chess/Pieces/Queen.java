package chess.Pieces;

import Boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {


    public Queen(Board board, Color color){
        super(color, board);

    }

    @Override
    public String toString(){
        return "Q";
    }


}
