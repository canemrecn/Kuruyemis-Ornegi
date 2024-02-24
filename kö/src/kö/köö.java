package kö;

public class köö {
	public static void main(String[] args) {
	/*BİR KURUYEMİŞCİ TOPTANCIDAN 12 KİLO LEBLEBİNİN KİLOSUNU 3.5 TL, 
	 * 25 KİLO FINDIK KİLOSUNU 15.7 TL, 40 KİLO BADEMİN KİLOSUNU 22 TL’DEN ALMIŞTIR. 
	 * BU ÜRÜNLERİ SATARKEN LEBLEBİNİN KİLOSUNU %50 , FINDIK KİLOSUNU%40, BADEMİN 
	 * KİLOSUNU %60 FAZLASINA SATMIŞTIR. KURUYEMİŞCİ O GÜNKÜ KAZANDIĞI PARA İLE 
	 * DÜKKANIN PARASINI ÖDEMEK İSTEMEKTEDİR. KİRA TUTARI 500 TLDİR. KAZANDIĞI 
	 * PARA EĞER 500 TL’DEN FAZLA İSE KİRAYI ÖDEYEBİLSİN, DEĞİLSE ÖDEYEMESİN. 
	 */
		double leblebi = 3.5;
		double findik = 15.7;
		double badem = 22;
		
		double maliyetTutar = (leblebi*12) + (findik*25) + (badem*40 );
		
		double satisTutari = ((leblebi*1.5))*12 + ((findik*1.4)*25) + ((badem*1.6)*40);
		
		double karTutar = satisTutari - maliyetTutar;
		if(karTutar>500)
		{
			System.out.println("Kirayi odeyebilirsiniz");
		}
		else {
			System.out.println("Kirayi odemek icin paraniz yeterli degil");
		}
	}

}


