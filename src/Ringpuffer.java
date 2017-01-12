
public class Ringpuffer {
Spieler[] spieler;
int maxanzahl=4;
int aktuell=0;
int Ende=maxanzahl-1;


	Ringpuffer(int maxanzahl,Spieler spieler1, Spieler spieler2, Spieler spieler3, Spieler spieler4){
		spieler=new Spieler[]{spieler1,spieler2,spieler3,spieler4};
	}
	
	void nächsterspieler(){
		if(aktuell<Ende)
			aktuell++;
		else{
			aktuell=0;
		}
	}
	
	void aktiondurchführen(){
		
	}
}
