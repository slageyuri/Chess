package application;

import Boardgame.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        ChessMatch chessmatch= new ChessMatch();
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                UI.clearScreen(); //only works in Windows terminal
                UI.printBoard(chessmatch.getPieces());
                System.out.println();
                System.out.print("Which piece do you want to move? ");
                ChessPosition source = UI.readChessPosition(sc);

                System.out.println();
                System.out.print("Where do you want to move this piece to? ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
            }
            catch (ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }


    }

}
