package br.com.board.game;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int column) {
	
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	// O que é Override? 
	//é reescrever um metodo que foi herdado, 
	//aonde seu comportamento na classe Pai se difere do seu comportamento na classe filha, ou seja 
	//elas possuem o mesmo nome, mas funcionalidades ou ações diferentes. Obs Se você não reecrever o metodo 
	//ele terá o comportamento da classe Pai, que pela logica é uma implementação 
	
	@Override
	public String toString() {
		return row + "," + column;
				
	}
	
}
