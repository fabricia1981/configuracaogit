package br.com.board.game;

public class Piece {
	
	protected Position position;
	private Board board;
	
	//
	public Piece(Board board) {
		this.board = board;
	}
	
	//(protected) não ficará publico, somente classes de um mesmo pacote pode acessar
		protected Board getBoard() {
			return board;
		}
		 
		//não vou permetir que meu tabuleiro seja alterado e nesse caso teremos só o getBoard
		//public void setBoard(Board board) {
			//this.board = board;
		//}

	
	
	
	

}
