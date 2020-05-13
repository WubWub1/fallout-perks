
public class Main {

	public static void main(String[] args) {
		CharactersName name = new CharactersName();
		name.setName();
		
		SkillsGenerator generator = new SkillsGenerator();
		int[] arrayForListOfSkills = generator.getRandomSkills();
		
		ListOfSkills list = new ListOfSkills();
		list.getList(arrayForListOfSkills);
	}

}
