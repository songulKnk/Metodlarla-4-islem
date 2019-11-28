import java.util.Scanner;

public class Fonksiyon {
	

	static void topla() {
		Scanner input= new Scanner(System.in);
		System.out.print("Birinci sayý:");
		int birinci=input.nextInt();
		System.out.print("Ýkinci sayý:");
		int ikinci=input.nextInt();
		int toplam= birinci+ikinci;
		System.out.println("toplam:" +toplam );
		menu();
	}

	static void cikar() {
		Scanner input= new Scanner(System.in);
		System.out.print("Birinci sayý:");
		int birinci=input.nextInt();
		System.out.print("Ýkinci sayý:");
		int ikinci=input.nextInt();
		int fark= birinci-ikinci;
		System.out.println("Çýkan:" +fark );
		menu();
	}

	static void carp() {
		Scanner input= new Scanner(System.in);
		System.out.print("Birinci sayý:");
		int birinci=input.nextInt();
		System.out.print("Ýkinci sayý:");
		int ikinci=input.nextInt();
		int carpim= birinci*ikinci;
		System.out.println("carpim:" +carpim );
		menu();
	}

	static void bol() {
		Scanner input= new Scanner(System.in);
		System.out.print("Birinci sayý:");
		int birinci=input.nextInt();
		System.out.print("Ýkinci sayý:");
		int ikinci=input.nextInt();
		int bolum= birinci/ikinci;
		System.out.println("bölüm:" +bolum );
		menu();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
		
	}
		
		
		static String menu() {
			Scanner input= new Scanner(System.in);
			System.out.println("Hangi iþlemi yapmak istiyorsunuz?"
					+ "\nToplama(+)"
					+ "\nÇýkarma(-)" 
					+ "\nÇarpma(*)"
					+ "\nBölme(/)"
					+ "\nÇýkýþ(-1)");
			String secim=input.next();
			//return secim;
		
			switch(secim) {
			
			case "+":
				topla();
				break;
			case "-":
				cikar();
				break;
			case "*":
				carp();
				break;
			case "/":
				bol();
				break;
			case "-1":
				System.out.println("\nGüle güle");
				break;
			default:
				System.out.println("Yanlýþ seçim");
				break;
			
			
			}
			return secim;
					

		}}
