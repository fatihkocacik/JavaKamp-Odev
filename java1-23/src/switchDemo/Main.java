package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mükkemmel - Dersi Geçtiniz!!");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi - Dersi Geçtiniz!!");
			break;
		case 'D':
			System.out.println("Fena Değil - Dersi Geçtiniz!!");
			break;
		case 'F':
			System.out.println("Malesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz.");
		}
	}

}
