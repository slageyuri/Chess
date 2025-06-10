package chess.Pieces;

import Boardgame.Board;
import Boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {

    public Pawn(Board board, Color color) {
        super(color, board);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        if(getColor() == Color.WHITE){
            //NORMAL MOVEMENT
            p.setValues(position.getRow()-1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                mat[p.getRow()][p.getColumn()]=true;
            }
            //FIRST MOVEMENT (CHECK IF FIRST 2 POSITIONS AHEAD OF THE PAWN ARE EMPTY
            p.setValues(position.getRow()-2, position.getColumn());
            Position p2 = new Position(position.getRow()-1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getMoveCount()==0 && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2)){
                mat[p.getRow()][p.getColumn()]=true;
            }
            //CAPTURE LEFT
            p.setValues(position.getRow()-1, position.getColumn()-1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()]=true;
            }
            //CAPTURE RIGHT
            p.setValues(position.getRow()-1, position.getColumn()+1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()]=true;
            }

        }
        else{
            //NORMAL MOVEMENT
            p.setValues(position.getRow()+1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                mat[p.getRow()][p.getColumn()]=true;
            }
            //FIRST MOVEMENT (CHECK IF FIRST 2 POSITIONS AHEAD OF THE PAWN ARE EMPTY
            p.setValues(position.getRow()+2, position.getColumn());
            Position p2 = new Position(position.getRow()+1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getMoveCount()==0 && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2)){
                mat[p.getRow()][p.getColumn()]=true;
            }
            //CAPTURE LEFT
            p.setValues(position.getRow()+1, position.getColumn()-1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()]=true;
            }
            //CAPTURE RIGHT
            p.setValues(position.getRow()+1, position.getColumn()+1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()]=true;
            }
        }


        return mat;
    }

    @Override
    public String toString(){
        return "P";
    }
}
