public class SkillsGenerator {
	public int[] getRandomSkills() {
		int minimumValue = 1;
	    int maximumValue = 10;
	    int[] arrayForSkills = new int[7];
	      for (int i = 0; i < arrayForSkills.length; i++) 
	      {
	      arrayForSkills[i] = minimumValue + (int) (Math.random() * maximumValue);
	      }
		return arrayForSkills;
	}
}
