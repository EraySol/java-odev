package ReferansDeger;

public class Main {

	public static void main(String[] args) {
    int sayi1=10;
	int sayi2;
	sayi2=sayi1;

	System.out.println(sayi2);

	int[]sayilar1=new int[]{1,2,3};
	int[]sayilar2;
	sayilar2=sayilar1;
	sayilar1[0]=10;
	System.out.println(sayilar2[0]);
	}

}
