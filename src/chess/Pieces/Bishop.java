package chess.Pieces;

import Boardgame.Board;
import Boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece {


    public Bishop(Board board, Color color) {
        super(color, board);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        //NORTHWEST (UP-LEFT)
        p.setValues(position.getRow()-1, position.getColumn()-1); // -1 to go up in the matrix rows
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
            p.setValues(p.getRow()-1, p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true; //piece that can be captured
        }

        //NORTHEAST (UP-RIGHT)
        p.setValues(position.getRow()-1, position.getColumn()+1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() - 1, p.getColumn() + 1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true; //piece that can be captured
        }

        //SOUTHWEST (DOWN-LEFT)
        p.setValues(position.getRow()+1, position.getColumn()-1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
            p.setValues(p.getRow()+1, p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true; //piece that can be captured
        }

        //SOUTHEAST (DOWN-RIGHT)
        p.setValues(position.getRow()+1, position.getColumn()+1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
            mat[p.getRow()][p.getColumn()] = true;
            p.setValues(p.getRow() + 1, p.getColumn() + 1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true; //piece that can be captured
        }

        return mat;
    }

    @Override
    public String toString(){
        return "B";
    }
}
