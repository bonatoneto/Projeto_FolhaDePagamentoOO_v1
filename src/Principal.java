
public class Principal {
	public static void main(String[] args) {
		int opcao;
		boolean verifica = false;
		Funcionarios funcionarios = null;
		do {
			System.out.println("1 - Ler dados do funcionario");
			System.out.println("2 - Calcular salario liquido");
			System.out.println("3 - Sair");
			opcao = Console.readInt("Informe a opcao desejada");
			switch (opcao) {
			case 1:
				funcionarios = new Funcionarios();
				funcionarios.nomeFuncionario = Console.readString("Informe o nome do funcionario:");
				funcionarios.mes = Console.readInt("Informe o mes:");
				funcionarios.ano = Console.readInt("Informe o ano:");
				funcionarios.numHorasTrabalhadas = Console.readInt("Informe o numero de horas trabalhadas:");
				funcionarios.valorHora = Console.readFloat("Informe o valor da hora de trabalho:");
				verifica = true;
				break;
			case 2:
				if (verifica == true) {
					System.out.println("Salario bruto: " + funcionarios.calculaSalarioBruto());
					System.out.printf("IR: " + funcionarios.calculaIR());
					System.out.println("INSS: " + funcionarios.calculaINSS());
					System.out.println("FGTS: " + funcionarios.calculaFGTS());
					System.out.println("Salario Liquido: " + funcionarios.calculaSalarioLiquido());
					break;
				} else {
					System.out.println("E necessario infromar os dados do funcionario para calcular o salario liquido!");
				}
			}
		} while (opcao != 3); 
	}
}