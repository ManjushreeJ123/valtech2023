package testinggg;
import java.util.Random;
public class okkk{
	private static final char[] CHARACTERS = "abcdefghijklmnopqrstuvwxyz". toCharArray();
	private static final String[] LEVELS = {"Beginner", "intermediate", "advanced"};
	private static final String[] EXPERIENCE = {"None", "1-2 years",};
	
	public static String GetRandomName() {
		Random random = new Random();
		int minLength=3;
		int maxLength =10;
		int length = random.nextInt(maxLength - minLength+1)+minLength;
		
		StringBuilder name=new StringBuilder();
		for(int i =0;i<length;i++) {
			int index=random.nextInt(CHARACTERS.length);
			name.append(CHARACTERS[index]);
			
		}
		return name.toString();
		
	}
	public static int getRandomAge() {
		Random random=new Random();
		int minAge=18;
		int maxAge=100;
		return random.nextInt(maxAge-minAge+1)+minAge;
	}
	public static String getRandomLevel() {
		Random random=new Random();
		int index=random.nextInt(LEVELS.length);
		return LEVELS[index];
	}
	public static String getRandomExperience() {
		Random random = new Random();
		int index=random.nextInt(EXPERIENCE.length);
		return EXPERIENCE[index];
	}
	public static void main(String[] args) {
		String name = GetRandomName();
		int age = getRandomAge();
		String level = getRandomLevel();
		String experience=getRandomExperience();
		System.out.println("Name:" + name);
		System.out.println("age:" + age);
		System.out.println("level:" +level);
		System.out.println("experience:" + experience);
	}
	}
	
