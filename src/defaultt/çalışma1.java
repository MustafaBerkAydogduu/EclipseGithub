package defaultt;
import java.util.Scanner;
public class çalışma1 {
	public static void main(String[] args) {
		Scanner k1 =new Scanner(System.in);
		System.out.print("Sayı Giriniz :");
		int gsayı=k1.nextInt();
		
		System.out.println("\n"+palindromik(gsayı));
	}
	static boolean palindromik(int sayı) {
		int bkalan,terssayı=0;
		for(int tmp=sayı ;tmp!=0 ;tmp/=10) {
			bkalan=tmp%10;
			terssayı=(terssayı*10)+bkalan;
		}
		if(terssayı==sayı)
			return true;
		else
			return false;
	}
}