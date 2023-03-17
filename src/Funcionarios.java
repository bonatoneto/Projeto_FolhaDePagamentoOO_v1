
public class Funcionarios {
	public String nomeFuncionario;
	public int mes;
	public int ano;
	public int numHorasTrabalhadas;
	public float valorHora;
	
	public float calculaSalarioBruto() {
			return valorHora * numHorasTrabalhadas;
		}	
	
	public float calculaIR() {
		float salBruto = calculaSalarioBruto();
		if (salBruto <= 1372.81) {
			return 0;
		} else {
			if (salBruto <= 2743.25) {
				return (float) ((salBruto * .15) - 205.92);
			} else {
				return (float) ((salBruto * .275) - 548.82);
			}
		}
	}
	
	public float calculaINSS() {
		float salBruto = calculaSalarioBruto();
		if (salBruto <= 868.29) {
			return (float) (salBruto * 0.08);
		} else {
			if (salBruto < 1447.14) {
				return (float) (salBruto * 0.09);
			} else {
				if (salBruto < 2894.28) {
					return (float) (salBruto * 0.11);
				} else {
					return (float) 318.37;
				}
			}
		}
	}
	
	public float calculaFGTS() {
		float salBruto = calculaSalarioBruto();
		return (float) (salBruto * 0.8);
	}
	
	public float calculaSalarioLiquido() {
		float salBruto = calculaSalarioBruto();
		float IR = calculaIR();
		float INSS = calculaINSS();
		return salBruto - IR - INSS;
	}
}