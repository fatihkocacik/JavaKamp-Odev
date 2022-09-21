package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'E';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("'" + harf + "'" + " Harfi kalın seslidir.");
			break;
		default:
			System.out.println("'" + harf + "'" + " Harfi ince seslidir.");
		}

	}

}
