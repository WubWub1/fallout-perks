public class CharactersSkills {
	private int strength;
	private int perception;
	private int endurance;
	private int charisma;
	private int intelligence;
	private int agility;
	private int luck;
	CharactersSkills(int strength, int perception, int endurance, int charisma, int intelligence, int agility, int luck)
	{
		this.strength = strength;
		this.perception = perception;
		this.endurance = endurance;
		this.charisma = charisma;
		this.intelligence = intelligence;
		this.agility = agility;
		this.luck = luck;
	}
	@Override
	public String toString() {
		return "Strength=" + strength + "\nPerception=" + perception + "\nEndurance=" + endurance
				+ "\nCharisma=" + charisma + "\nIntelligence=" + intelligence + "\nAgility=" + agility + "\nLuck="
				+ luck;
	}
}
