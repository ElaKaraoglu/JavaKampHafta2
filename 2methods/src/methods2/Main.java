package methods2;

public class Main {
	public static void main(String[] args){
   String mesaj="bugün hava çok güzel";
   String yeni_mesaj=sehirver();
   System.out.println(yeni_mesaj);
   int toplam=topla(5,3);
   System.out.println(toplam);
   int toplam2=topla2(1,2,3,4,5);
   System.out.println(toplam2);
}
	
	
	public static void ekle() {
		System.out.println("eklendi");
	}
	public static void sil() {
		System.out.println("silindi");
	}
	public static void güncelle() {
		System.out.println("güncellendi");
	}
	public static int topla(int sayı1,int sayı2) {
		return sayı1+sayı2;
	}
	public static String sehirver() {
		return "Ankara";
	}
	public static int topla2(int... sayılar) {
		int toplam=0;
		for(int sayı:sayılar) {
			toplam=toplam+sayı;
		}
		return toplam;
	}
}