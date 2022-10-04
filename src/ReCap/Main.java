package ReCap;

public class Main {

    public static void main(String[] args)
    {
        ReCap reCap=new ReCap();
        int sonuc=reCap.Topla(5,7);
        System.out.println(sonuc);
        sonuc=reCap.Bol(10,2);
        System.out.println(sonuc);
        sonuc=reCap.Carp(5,2);
        System.out.println(sonuc);
        sonuc=reCap.Cikar(10,2);
        System.out.println(sonuc);
    }
}
