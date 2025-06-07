package application;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        ChessMatch chessmatch= new ChessMatch();
        Scanner sc = new Scanner(System.in);

        while(true){
            UI.printBoard(chessmatch.getPieces());
            System.out.println();
            System.out.print("Which piece do you want to move? ");
            ChessPosition source = UI.readChessPosition(sc);
            System.out.println();
            System.out.print("Where do you want to move this piece to? ");
            ChessPosition target = UI.readChessPosition(sc);
            ChessPiece capturedPiece = chessmatch.performChessMove(source, target );
        }


    }

}
