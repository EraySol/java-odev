package Method;

public class Main {

	public static void main(String[] args) {
		
     sayıBulmaca();
	}
	public static void sayıBulmaca()
	{
		int[]sayilar= {1,3,5,7,9,11};
		int aranacak=10;
		Boolean varMı=false;
		for (int sayi : sayilar) {
			if (aranacak==sayi) {
				varMı=true;
			}
			break;
		}
		String mesaj="";
		if (varMı) {
			mesaj="Sayi Mevcuttur"+ aranacak;
			mesajver(mesaj);
		} else {
			mesajver("Sayi Mevcut degildir"+ aranacak);
			
		}

		}
		public static void mesajver(String mesaj) 
		{
		System.out.println(mesaj);	
		}
}
