package chess.Pieces;

import Boardgame.Board;
import Boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(color, board);
    }

    @Override
    public String toString(){
        return "K";
    }
    private boolean canMove(Position position){
        Board board;
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor()!= getColor(); //can move if the position is empty or there's an enemy piece

    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);

        //above
        p.setValues(position.getRow()-1, position.getColumn() );
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        //below
        p.setValues(position.getRow()+1, position.getColumn() );
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        //left
        p.setValues(position.getRow(), position.getColumn()-1 );
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        //right
        p.setValues(position.getRow(), position.getColumn()+1 );
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        //northwest (up-left)
        p.setValues(position.getRow()-1, position.getColumn()-1 );
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        //northeast (up-right)
        p.setValues(position.getRow()-1, position.getColumn()+1 );
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        //southwest (down-left)
        p.setValues(position.getRow()+1, position.getColumn()-1 );
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        //southeast (down-right)
        p.setValues(position.getRow()+1, position.getColumn()+1 );
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()]=true;
        }
        return mat;
    }


}
