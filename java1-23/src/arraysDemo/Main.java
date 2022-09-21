package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String ogrenci1 = "Fatih";
		String ogrenci2 = "Sıla";
		String ogrenci3 = "Ecrin";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		
		
		String [] ogrenciler = new String[3];
		ogrenciler[0] = "Fatih";
		ogrenciler[1] = "Sıla";     
		ogrenciler[2] = "Ecrin";
		
		for(int i=0; i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("--------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
		
	}

}
