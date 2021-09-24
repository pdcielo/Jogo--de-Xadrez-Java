package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while (true) {
			try {
				UI.clearScreen();
				System.out.print("Legenda das peças:");
				System.out.println();
				System.out.print("P - Pawn (Peão) | R - Rook (Torre) | N - Knight (Cavalo)");
				System.out.println();
				System.out.println("B - Bishop (Bispo) | Q - Queen (Rainha) | K - King (Rei)");
				System.out.println();
				
				UI.printBoard(chessMatch.getPieces());			
				System.out.println();
				System.out.print("Escolha a peça que você quer mover: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				System.out.println();
				System.out.print("Escolha o local aonde quer colocar a peça: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				ChessPiece capturedPiece = chessMatch.perfomChessMove(source, target);
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}
