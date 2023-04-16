package test5_15apil;

public class IPLTeam {
	
	void play(){
		System.out.println("Teams are Playing");
	}

}
class CSK extends IPLTeam{
	@Override
	void play(){
		System.out.println("CSK team Playing");
	}
}
class RCB extends IPLTeam {
	@Override
	void play(){
		System.out.println("RCB team Playing");
	}
}
