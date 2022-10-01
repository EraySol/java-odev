package methods2;



public class Main {

	public static void main(String[] args) {
	
		String mesaj="Hosgeldiniz Sayın İzleyiciler";
		String yenimesaj=mesaj.substring(0,11);
		System.out.println(yenimesaj);
		
		
		String cıtys=sehır();
		System.out.println(cıtys);
		
		int sayilar=topla(5,4);
		System.out.println(sayilar);
		
	}
	public static void ekle()
	{
		System.out.println("Eklendi");
	}
    
	public static void sil()
	{
		System.out.println("Silindi");
	}
	
	public static void guncelle()
	{
		System.out.println("Güncelle");
	}
	public static String sehır()
	{
		return "İzmir";
	}
	
	public static int topla(int sayi1,int sayi2)
	{
		return sayi1+sayi2;
	}
	
}
