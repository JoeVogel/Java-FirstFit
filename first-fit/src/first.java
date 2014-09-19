import java.util.Scanner;

public class first {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("N� processos:");
		int p = in.nextInt();

		System.out.println("N� blocos de mem�ria:");
		int m = in.nextInt();

		int tamProcessos[] = new int[p];
		SegMemoria segMemoria[] = new SegMemoria[m];

		int i = 0;
		for (i = 0; i < p; i++) {
			System.out.println("Tamanho do processo " + (i + 1) + ":");
			tamProcessos[i] = in.nextInt();
		}

		for (i = 1; i <= m; i++) {
			System.out.println("Entre o tamanho do segmento de mem�ria " + i);
			SegMemoria seg = new SegMemoria();
			seg.id = i;
			seg.size = in.nextInt();
			segMemoria[i - 1] = seg;
		}

		int j;

		for (i = 0; i < p; i++) {
			for (j = 0; j < m; j++) {
				if (segMemoria[j].size >= tamProcessos[i]) {
					segMemoria[j].size -= tamProcessos[i];

					System.out.println("Processo " + (i + 1)
							+ " alocado no espa�o de mem�ria " + segMemoria[j].id
							+ ". Espa�o restante ap�s a aloca��o " + segMemoria[j].size);
					break;
				}
			}
			if (j == m) {
				System.out.println("N�o h� mais mem�ria disponivel");
			}
		}

	}
}
