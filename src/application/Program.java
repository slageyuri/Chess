package application;

import Boardgame.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {


        ChessMatch chessmatch= new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                UI.clearScreen(); //only works in Windows terminal
                UI.printMatch(chessmatch, captured);
                System.out.println();
                System.out.print("Which piece do you want to move? ");
                ChessPosition source = UI.readChessPosition(sc);
                boolean[][]possibleMoves = chessmatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(chessmatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Where do you want to move this piece to? ");
                ChessPosition target = UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessmatch.performChessMove(source, target);

                if(capturedPiece!=null){
                    captured.add(capturedPiece);
                }
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
