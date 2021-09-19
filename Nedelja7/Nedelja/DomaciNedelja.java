//Required imports

/*
import rs.itbootcamp.dao.MealDao;
import rs.itbootcamp.dao.MealDaoSQL;
import rs.itbootcamp.model.MealModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
*/

//Required for testing

/*
public static void main(String[] args) {
    static MealDao md = new MealDaoSQL();
    
    Scanner sc = new Scanner(System.in);
    String string = sc.nextLine();
    search(string);
}
*/

public static void search(String string) {
        List<MealModel> allMeals = md.getAllMeals();
        List<String> searchQuery = new ArrayList<>();
        String[] arrayOfStrings = string.replaceAll(", "," ").replaceAll(","," ").split(" "); //StrahinjaTBC Update Domaci.md - Budite mastoviti!
        for (int i = 0; i < allMeals.size(); i++) {
            for (int j = 0; j < arrayOfStrings.length; j++) {
                string = arrayOfStrings[j];
                if (allMeals.get(i).getMeal_name().toLowerCase().contains(string.toLowerCase())
                        || allMeals.get(i).getMeal_desc().toLowerCase().contains(string.toLowerCase())) {
                    searchQuery.add(allMeals.get(i).getMeal_name());
                    break;
                }
            }
        }
        System.out.println(searchQuery);
}
