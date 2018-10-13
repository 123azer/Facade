package facade;

public class Person {
	
	private String Nom;
	private Gender sexe;
	
	public Person()
	{
		Nom=new String();
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public Gender getSexe() {
		return sexe;
	}

	public void setSexe(Gender sexe) {
		this.sexe = sexe;
	}
	
	public void Me()
	{
		System.out.println("Mon Nom est "+Nom+" "+" je suis "+sexe);
	}
	
	
	

}
