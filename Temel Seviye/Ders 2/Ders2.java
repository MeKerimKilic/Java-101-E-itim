import java.util.Scanner;

public class Ders2 {
	
	public static void main6(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen �lk Say�y� Giriniz:");
		int sayi1 = input.nextInt();
		System.out.print("L�tfen �kinci Say�y� Giriniz:");
		int sayi2 = input.nextInt();
		System.out.println("Toplam: "+(sayi1+sayi2));
	}
	
	
	
	public static void main5(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen Mesaj Giriniz: ");
		String mesaj = input.nextLine();
		System.out.println("Mesaj�n�z: "+mesaj);
		
		System.out.println("L�tfen Mesaj Girinz");
		mesaj = input.nextLine();
		System.out.println("Mesaj�n�z: "+mesaj);
	}
	
	
	public static void main4(String[] args) {
		String ayDegeriStr= "�ubat";
		int ayDeger=-1;
		switch(ayDegeriStr.toLowerCase()) {
			case "ocak":
				ayDeger=1;
				break;
			case "�ubat":
				ayDeger=2;
				break;
			case "mart":
				ayDeger=3;
				break;
			case "nisan":
				ayDeger=4;
				break;
			case "may�s":
				ayDeger=5;
				break;
			case "haziran":
				ayDeger=6;
				break;
			case "temmuz":
				ayDeger=7;
				break;
			case "a�ustos":
				ayDeger=8;
				break;
			case "eyl�l":
				ayDeger=9;
				break;
			case "ekim":
				ayDeger=10;
				break;
			case "kas�m":
				ayDeger=11;
				break;
			case "aral�k":
				ayDeger=12;
				break;
			default:
				ayDeger=-1;
				break;
		
		}
		System.out.println(ayDegeriStr + " ay� y�l�n "+ ayDeger+ ". ay�d�r");
	}
	
	
	public static void main3(String[] args) {
		/*int aydegeri=7;
		switch(aydegeri) {
			case 1:
			case 2:
				System.out.println("ay de�eri 1 veya 2 e�it");
				break;
				
			case 3:
				System.out.println("ay de�eri 3 e�it");
			case 4:
				System.out.println("ay de�eri 4 e�it");
				break;
			case 5:
				System.out.println("ay de�eri 5 e�it");
				break;
			default:
				System.out.println("Default");
				break;
			case 6:
				System.out.println("ay de�eri 6 e�it");
				break;
		}*/
		
		
	}
	public static void main2(String[] args) {
		/*int x = -1;
		if(x>0) {
			int z = x*5;
			System.out.println("z De�eri: "+z);
		}else {
			System.out.println("x 0 dan k���k veya e�it");
		}*/
		
		/*String x ="Ba�ak�ehir";
		String y ="Kerim K�l��";
		System.out.println(x.equals(y));
		if(x.equals(y)) {
			System.out.println("E�it");
		}else {
			System.out.println("E�it De�il");
		}*/
		
		/*int x = -50;
		
		if(x>90) {
			System.out.println(" x 90'dan B�y�k");
		}else if(x>=80) {
			System.out.println(" x 90 ile 80 Aras�nda");
		}else if(x>=70) {
			System.out.println(" x 80 ile 70 Aras�nda");
		}else if(x>=60) {
			System.out.println(" x 70 ile 60 Aras�nda");
		}else if(x>=50) {
			System.out.println(" x 60 ile 50 Aras�nda");
		}else if(x>=40) {
			System.out.println(" x 50 ile 40 Aras�nda");
		}else if(x>=30) {
			System.out.println(" x 40 ile 30 Aras�nda");
		}else if(x>=20) {
			System.out.println(" x 30 ile 20 Aras�nda");
		}else if(x>=10) {
			System.out.println(" x 20 ile 10 Aras�nda");
		}else if(x>=0) {
			System.out.println(" x 10 ile 0 Aras�nda");
		}else {
			System.out.println(" 0 'dan k���kt�r");
		}*/
		
		/*int x=6;
		if(x>5 && x<10) {
			System.out.println("x 10 ile 5 aras�nda");
		}else {
			System.out.println("x 10 dan b�y�k veya 5 den k���k");
		}*/
		
		int x=11;
		if(x>10 || x<10) {
			System.out.println("x 10 dan k���k veya 5 den b�y�k");
		}else {
			System.out.println("x 10 e�it");
		}
	
		
	}
	
	public static void main1(String[] args) {
		//If Else
		
		int A=5,B=7;
		System.out.println(A);
		System.out.println(B);
		
		if(A*B==35) {
			System.out.println("E�it");
		}else {
			System.out.println("E�it De�il");
		}
		
		A=30;B=6;

		if(A+B>35) {
			System.out.println(" 35 ten B�y�k");
		}else if(A+B==35) {
		
			System.out.println("Toplam 35");
		
		}else if(A+B==34) {
		
			System.out.println("Toplam 34");
		
		}else if(A+B==33) {
		
			System.out.println("Toplam 33");
		
		}else{
			System.out.println(" 33 ten K���k");
		}
	
		System.out.println("��lem Bitti");
	}

}
