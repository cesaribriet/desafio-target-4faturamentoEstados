package target_faturamentoEstado;

public class Main {

	public static void main(String[] args) {

		double fatSp = 67836.43;
		double fatRj = 36678.66;
		double fatMg = 29229.88;
		double fatEs = 27165.48;
		double fatOutros = 19849.53;
		
		double valorTotal = fatSp + fatRj + fatMg + fatEs + fatOutros;
		
		double porcSp = fatSp / valorTotal * 100;
		double porcRj = fatRj / valorTotal * 100;
		double porcMg = fatMg / valorTotal * 100;
		double porcEs = fatEs / valorTotal * 100;
		double porcOutros = fatOutros / valorTotal * 100;
		
		System.out.printf("A representacao do estado SP foi de %.2f%% \n", porcSp);
		System.out.printf("A representacao do estado RJ foi de %.2f%% \n", porcRj);
		System.out.printf("A representacao do estado MG foi de %.2f%% \n", porcMg);
		System.out.printf("A representacao do estado ES foi de %.2f%% \n", porcEs);
		System.out.printf("A representacao dos demais estados foi de %.2f%%", porcOutros);
	}

}
