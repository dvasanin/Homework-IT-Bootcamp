package SestaNedelja;

import SestaNedelja.rs.itbootcamp.dao.FoodDao;
import SestaNedelja.rs.itbootcamp.dao.FoodDaoSQL;
import SestaNedelja.rs.itbootcamp.dao.MealDao;
import SestaNedelja.rs.itbootcamp.dao.MealDaoSQL;
import SestaNedelja.rs.itbootcamp.model.FoodModel;
import SestaNedelja.rs.itbootcamp.model.MealModel;

import java.util.Scanner;

public class Test {
    private static FoodModel userNewFood() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite id: ");
        int id = sc.nextInt();
        System.out.println("Unesite name: ");
        String name = sc.next();
        System.out.println("Unesite kcal: ");
        double kcal = sc.nextDouble();
        System.out.println("Unesite proteine: ");
        double proteins = sc.nextDouble();
        System.out.println("Unesite UH: ");
        double carbs = sc.nextDouble();
        System.out.println("Unesite masti: ");
        double fats = sc.nextDouble();
        return new FoodModel(id, name, kcal, proteins, carbs, fats);
    }

    private static MealModel userNewMeal() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite id: ");
        int id = sc.nextInt();
        System.out.println("Unesite name: ");
        String name = sc.next();
        System.out.println("Unesite desc: ");
        String desc = sc.next();
        System.out.println("Unesite difficulty: ");
        String diff = sc.next();
        return new MealModel(id, name, desc, diff);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodDao fd = new FoodDaoSQL();
        MealDao md = new MealDaoSQL();

        //Test za food - utorak
        String menu = """
                0. Exit
                1. Dodaj u tabelu Food
                2. Prikazi tabelu Food
                """;

        int choice = 5;
        while (choice != 0) {
            System.out.println(menu);
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    fd.insert(userNewFood());
                    break;
                case 2:
                    System.out.println(fd.getAllFood());
                    break;
            }
        }
        //Test za meal - utorak
        String menu1 = """
                0. Exit
                1. Dodaj u tabelu Meal
                2. Prikazi tabelu Meal
                3. Find a meal
                4. Show ingredient names
                5. Show full ingredient list
                """;
        int choice1 = 5;
        while (choice1 != 0) {
            System.out.println(menu1);
            choice1 = sc.nextInt();
            switch (choice1) {
                case 0:
                    break;
                case 1:
                    md.insert(userNewMeal());
                    break;
                case 2:
                    System.out.println(md.getAllMeals());
                    break;
                case 3:
                    System.out.println("Enter meal id: ");
                    int findAMeal = sc.nextInt();
                    System.out.println(md.getMeal(findAMeal));
                case 4:
                    System.out.println("Ingredients of what meal? Enter meal id: ");
                    int findIngredientNames = sc.nextInt();
                    System.out.println(md.getFoodMealNames(findIngredientNames));
                case 5:
                    System.out.println("Ingredients of what meal? Enter meal id: ");
                    int findAllIngredients = sc.nextInt();
                    System.out.println(md.getFoodMealNames(findAllIngredients));
            }
        }
    }
}