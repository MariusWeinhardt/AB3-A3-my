package Main;
import Dinosaurier.Dinosaurier;
import Zivilisation.Dinoliste;
import Zivilisation.Stamm;

public class Spieler {
String name;
Stamm stamm;
Dinoliste Dinos;

Spieler(String name){
	this.name= name;
	stamm=null;
	Dinos=null;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Stamm getStamm() {
	return stamm;
}

public void setStamm(Stamm stamm) {
	this.stamm = stamm;
	verwalteDinos();
}
//kopiert die Liste bzw greift auf die liste zu
public void verwalteDinos(){
	Dinos=this.stamm.getListe();
}

void aktiondurchführen(){
	System.out.println("ich "+name+" mach was");
}

}







