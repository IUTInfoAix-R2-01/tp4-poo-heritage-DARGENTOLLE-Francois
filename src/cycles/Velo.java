package cycles;
import java.util.Random;
public class Velo {
	private double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private /*Random */ int genAlea;
	
	public double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	public void setDEFAUT_BRAQUET(double DEFAUT_BRAQUET) {
		this.DEFAUT_BRAQUET = DEFAUT_BRAQUET;
	}
	public Velo(double braquet, double diamRoue) {
		super();
		this.braquet = braquet;
		this.diamRoue = diamRoue;
	}
	
	public Velo(double braquet) {
		super();
		this.braquet = braquet;
	}
	
	public Velo() {
		this.braquet = DEFAUT_BRAQUET;
		this.diamRoue = 2.0;
	}
	public int getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(int genAlea) {
		//Random alea = new Random() ;
		this.genAlea = genAlea;
	}
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	@Override
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance( double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale*braquet*diamRoue*genAlea;
	}
	


	public static void main(String[] args) {
		Velo v1 = new Velo();
		Velo v2 = new Velo(5.5, 2.3);
		Velo v3 = new Velo();
		
		v3.setBraquet(6.2);
		v3.setDiamRoue(2.2);
		v3.setGenAlea(5);
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println("braquet :" + v1.getBraquet());
		System.out.println("braquet :" + v2.getBraquet());
		System.out.println("braquet :" + v3.getBraquet());
		System.out.println("diam roue :" + v1.getDiamRoue());
		System.out.println("diam roue :" + v2.getDiamRoue());
		System.out.println("diam roue :" + v3.getDiamRoue());
		System.out.println("gen Alea :" + v2.getGenAlea());
		System.out.println("Puisssance :" + v3.getPuissance(5.4));
	}

}

