public class MainResult {
    public static void main(String[] args) {
    	Correspondence correspondence = new Correspondence();
    	String sentence = correspondence.byConsole();
    	
    	ModifyingClass reversedCorrespondence = new ModifyingClass();
    	String resultForConsole = reversedCorrespondence.getReverse(sentence);
    	
    	Notification result = new Notification();
    	result.getForConsole(resultForConsole);
    }
}