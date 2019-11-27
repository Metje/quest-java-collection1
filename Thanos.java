import java.util.*;

public class Thanos {

	public static void main(String[] args) {

		// TODO 1 : Create an empty heroes list

		ArrayList<Hero> heroes = new ArrayList<>();

		// TODO 2 : Add those heroes to the list
		heroes.add(new Hero("Black Widow", 34));
		heroes.add(new Hero("Captain America", 100));
		heroes.add(new Hero("Vision", 3));
		heroes.add(new Hero("Iron Man", 48));
		heroes.add(new Hero("Scarlet Witch", 29));
		heroes.add(new Hero("Thor", 1500));
		heroes.add(new Hero("Spider-Man", 18));
		heroes.add(new Hero("Hulk", 49));
		heroes.add(new Hero("Doctor Strange", 42));

		// name: Black Widow, age: 34
		// name: Captain America, age: 100new
		// name: Vision, age: 3
		// name: Iron Man, age: 48
		// name: Scarlet Witch, age: 29
		// name: Thor, age: 1500
		// name: Spider-Man, age: 18
		// name: Hulk, age: 49
		// name: Doctor Strange, age: 42

		// TODO 3 : It's Thor birthday, now he's 1501
		for (Hero hero : heroes) {
			if (hero.getName().equals("Thor"))
				hero.setAge(1501);
		}
		ausgabeHeroes(heroes);

		// TODO 4 : Shuffle the heroes list
		Collections.shuffle(heroes);
		ausgabeHeroes(heroes);

		// TODO 5 : Keep only the half of the list

		List<Hero> halfHeroes =  heroes.subList(0, heroes.size() / 2);

		// TODO 6 : Loop throught the list and display the name of the remaining heroes
		ausgabeHeroes(halfHeroes);
	}

	public static void ausgabeHeroes(List<Hero> heroes) {

		for (Hero hero : heroes) {
			System.out.println("Name: " + hero.getName() + " Alter: " + hero.getAge());
		}
		System.out.println("-----------------------------");

	}
}