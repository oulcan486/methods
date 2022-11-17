package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        sayiBulma();
	}

	public static void sayiBulma() {
		int[] sayilar = { 2, 4, 22, 15, 64, 38, 9 };

		int aranacak = 55;

		boolean state = false;

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] == aranacak) {
				state = true;
				break;
			}

		}

		if (state) {
			Message("Sayi vardir: "+aranacak);
		} else {
			Message("Sayi yoktur: "+aranacak);
		}
	}
    
	
	public static void Message(String message) {
		System.out.println(message);
	}
}
