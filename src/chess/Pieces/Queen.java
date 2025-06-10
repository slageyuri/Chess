package chess.Pieces;

import Boardgame.Board;
import Boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Queen extends ChessPiece {


    public Queen(Board board, Color color){
        super(color, board);

    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0,0);

        //above the piece
        p.setValues(position.getRow()-1, position.getColumn()); // -1 to go up in the matrix rows
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
            p.setRow(p.getRow()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true; //piece that can be captured
        }

        //left
        p.setValues(position.getRow(), position.getColumn()-1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
            p.setColumn(p.getColumn()-1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true; //piece that can be captured
        }

        //right
        p.setValues(position.getRow(), position.getColumn()+1);
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
            p.setColumn(p.getColumn()+1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true; //piece that can be captured
        }

        //below
        p.setValues(position.getRow()+1, position.getColumn());
        while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()]=true;
            p.setRow(p.getRow()+     1);
        }
        if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()]=true; //piece that can be captured
        }

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
        return "Q";
    }


}
