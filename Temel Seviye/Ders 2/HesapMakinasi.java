import java.util.Scanner;
public class HesapMakinasi {

	public static void main(String[] args) {
		int durum = 1;
		while(durum==1) {
			Scanner input = new Scanner(System.in);
			
			
			System.out.print("��lem Se�iniz (+,*,-,/):");
			String operator = input.nextLine();
			
			
			
			System.out.print("�lk Say�y� Giriniz:");
			int number1 = input.nextInt();
			
			System.out.print("�kinci Say�y� Giriniz:");
			int number2 = input.nextInt();
			
			
			
			switch(operator) {
				case "+":
					System.out.println("Toplam: "+(number1+number2));
					break;
				case "*":
					System.out.println("�arma: "+(number1*number2));
					break;
				case "-":
					System.out.println("��karma: "+(number1-number2));
					break;
				case "/":
					System.out.println("B�lme: "+(number1/number2));
					break;
				default:
					System.out.println("B�yle Bir ��lem Bulunmamaktad�r.");
					
			}

			System.out.print("Devamm� (1/0):");
			durum = input.nextInt();
			
		}
	
		
		System.out.print("��k�� Yapt�n�z");
	}

}
