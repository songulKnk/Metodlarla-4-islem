import java.util.Scanner;

public class Fonksiyon {
	

	static void topla() {
		Scanner input= new Scanner(System.in);
		System.out.print("Birinci say�:");
		int birinci=input.nextInt();
		System.out.print("�kinci say�:");
		int ikinci=input.nextInt();
		int toplam= birinci+ikinci;
		System.out.println("toplam:" +toplam );
		menu();
	}

	static void cikar() {
		Scanner input= new Scanner(System.in);
		System.out.print("Birinci say�:");
		int birinci=input.nextInt();
		System.out.print("�kinci say�:");
		int ikinci=input.nextInt();
		int fark= birinci-ikinci;
		System.out.println("��kan:" +fark );
		menu();
	}

	static void carp() {
		Scanner input= new Scanner(System.in);
		System.out.print("Birinci say�:");
		int birinci=input.nextInt();
		System.out.print("�kinci say�:");
		int ikinci=input.nextInt();
		int carpim= birinci*ikinci;
		System.out.println("carpim:" +carpim );
		menu();
	}

	static void bol() {
		Scanner input= new Scanner(System.in);
		System.out.print("Birinci say�:");
		int birinci=input.nextInt();
		System.out.print("�kinci say�:");
		int ikinci=input.nextInt();
		int bolum= birinci/ikinci;
		System.out.println("b�l�m:" +bolum );
		menu();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		
		
	}
		
		
		static String menu() {
			Scanner input= new Scanner(System.in);
			System.out.println("Hangi i�lemi yapmak istiyorsunuz?"
					+ "\nToplama(+)"
					+ "\n��karma(-)" 
					+ "\n�arpma(*)"
					+ "\nB�lme(/)"
					+ "\n��k��(-1)");
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
				System.out.println("\nG�le g�le");
				break;
			default:
				System.out.println("Yanl�� se�im");
				break;
			
			
			}
			return secim;
					

		}}
