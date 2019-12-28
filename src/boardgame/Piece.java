package boardgame;

public abstract class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves();       //retorna uma matriz de movimentos possiveis
	
	public boolean possibleMove(Position position) {     // retorna verdadeiro ou falso se for possivel mover para essa posicao
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {           //checa se há algum movimento possivel, ou a peca ta travada
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j< mat.length; j++) {
				if(mat[i][j] == true) {                 
					return true;
				}
			}
		}
		return false;
	}
	
	
}
