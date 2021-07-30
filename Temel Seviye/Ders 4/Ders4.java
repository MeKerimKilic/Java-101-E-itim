import Hesap.Hesap;
import java.util.Scanner;
public class Ders4 {
	
	public static void main(String[] args) {
		
		Hesap hesap= new Hesap();
		boolean durum = true;
		while(durum) {
			float fiyat = 0;
			float kdvOran = 0;
			boolean kdvDahil = false;
			int sayi1 = 0;
			int sayi2 = 0;
			int[] sayiListesi = null;
			Scanner input = new Scanner(System.in);
			
			System.out.print("��lem Se�iniz (++,+,-,**,*,/,kdv):");
			String operator = input.nextLine();
			
			if(operator.equals("kdv")) {
				System.out.print("Fiyat:");
				 fiyat = input.nextFloat();
				
				System.out.print("KDV Oran�:");
				 kdvOran = input.nextFloat();
				System.out.print("KDV Dahilmi (true/false):");
				 kdvDahil = input.nextBoolean();
				
			}else if(operator.equals("++") || operator.equals("**")) {
				System.out.print("Ka� tane say�y� gireceksiniz:");
				int uzunluk = input.nextInt();
				sayiListesi= new int[uzunluk];
				for(int i=0;i<uzunluk;i++) {
					System.out.print((i+1) +". Sayi:");
					sayiListesi[i]=input.nextInt();
				}
				
			}else {
				System.out.print("�lk say�y� giriniz:");
				 sayi1 = input.nextInt();
				
				System.out.print("�kinci Say�y� Giriniz");
				 sayi2 = input.nextInt();
			}
		
			
			
			
			switch(operator) {
				case "++":
					System.out.println( "Toplam: "+Hesap.toplama2(sayiListesi));
					break;
				case "+":
					System.out.println( sayi1+ " + " +sayi2+" = "+Hesap.toplama(sayi1,sayi2));
					break;
				case "**":
					System.out.println("�arp�m: " + Hesap.carpma2(sayiListesi));
					break;
				case "*":
					System.out.println(sayi1+ " X " +sayi2+" = " + Hesap.carpma(sayi1,sayi2));
					break;
				case "-":
					System.out.println( sayi1+ " - " +sayi2+" = "+Hesap.cikarma2(sayi1,sayi2));
					break;
				case "/":
					System.out.println(sayi1+ " X " +sayi2+" = " + Hesap.bolme(sayi1,sayi2));
					break;
				case "kdv":
				
					Hesap.kdvHesapla(fiyat,kdvOran,kdvDahil);
					break;
				default:
					System.out.println("B�yle Bir ��lem Bulunamad�.");
					
			}

			System.out.print("Devamm� (true/false):");
			durum = input.nextBoolean();
			
		}
	
		
		
	
	}
	
	
	public static void main2(String[] args) {
		int[] sayiListesi= new int[8];
		sayiListesi[0]=1;
		sayiListesi[1]=2;
		sayiListesi[2]=3;
		sayiListesi[3]=4;
		sayiListesi[4]=5;
		sayiListesi[5]=6;
		sayiListesi[6]=7;
		sayiListesi[7]=8;
		int[] sayiListesi2= {1,2,3,4,5,6,7,8};
		System.out.println(sayiListesi[3]);
	}
	
	public static void main1(String[] args) {
		int x=5,y=7;
		System.out.println("Metot'a girmeden �nce: "+" x="+x+" y="+y);
		deneme(x,y);
		
		System.out.println("Metot'tan ��k�nca: "+" x="+x+" y="+y);
		
	}
	
	public static void deneme(int x,int y) {
		System.out.println("Metot'un i�i i�lemlerden �nce: "+" x="+x+" y="+y);
		x+=15;
		y+=5;
		System.out.println("Metot'tun i�i i�lemlerden sonra: "+" x="+x+" y="+y);
		
	}

}
