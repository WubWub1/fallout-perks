public class ModifyingClass {
	public String getReverse(String sentence) {
		StringBuilder result = new StringBuilder(sentence.replaceAll("[\\W\\d+]","")).reverse();
        
        for (int i = 0; i < sentence.length(); i++) {
            if (!Character.isLetter(sentence.charAt(i))){
                result.insert(i, sentence.charAt(i));
            }
        }
        return result.toString();
		}
}
