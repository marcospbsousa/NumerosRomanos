
public class Romanos {

	
	public int conversor(String romano){
		int soma = 0;
		for (int i = 0; i < romano.length(); i++){
			char c = romano.charAt(i);
			if (c == 'I'){
				soma += 1;
			}else if (c == 'V'){
				soma += 5;
			}else if (c == 'X'){
				soma += 10;
			}else if (c == 'L'){
				soma += 50;
			}
		}
		return soma;
	}
}
