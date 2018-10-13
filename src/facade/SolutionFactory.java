package facade;

public class SolutionFactory {

	public static void main(String[] args) {
		SolutionFactory factory= new SolutionFactory();
		factory.CreatePerson("Azize", Gender.Male).Me();
		factory.CreatePerson("Aziza", Gender.Female).Me();
	}
	
	public Person CreatePerson(String Nom,Gender gender) {
		if(gender==Gender.Male)
			return new Male(Nom);
		else 
			{
			if(gender==Gender.Female)
			  return new Female(Nom);
		    else
		      return null;
			}
	}

}
