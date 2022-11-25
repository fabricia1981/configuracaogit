package br.com.chess;

import br.com.board.game.Board;
import br.com.board.game.Piece;

/**
 * @author FGALLO
 *
 */
public class ChessPiece extends Piece {

	private Color color;

	public ChessPiece(Board board,Color color) {
		super(board);
		this.color = color;
	}
	//ela pode ser apenas acessada 
	public Color getColor() {
		return color;
	}

	//Não gerar o set pois não quero que a cor de uma peça seja modificada
	//public void setColor(Color color) {
		//this.color = color;
	}
	
	

