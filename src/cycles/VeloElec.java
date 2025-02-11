package cycles;

public class VeloElec extends Velo{
	private double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double  facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(diamRoue, braquet);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = 25.0;
	}

	public double getDEFAUT_COUPLE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}

	public void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		DEFAUT_COUPLE_MOTEUR = 2.2;
	}

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}

	@Override
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	@Override
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale)*facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		VeloElec v11 = new VeloElec(2.3, 5.5, 36.0);
		VeloElec v12 = new VeloElec(4.6, 0.2);
		VeloElec v13 = new VeloElec();
		
		v13.setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(23.0);
		v13.setFacteurPuissanceMoteur(52.0);
		System.out.println("Facteur :" + v13.getFacteurPuissanceMoteur());
		System.out.println("defaut :" + v13.getDEFAUT_COUPLE_MOTEUR());
		System.out.println("Puissance :" + v11.getPuissance(5.2));
		System.out.println(v11);
		System.out.println(v12);
		System.out.println(v13);
		
	}
	
	
	
}
