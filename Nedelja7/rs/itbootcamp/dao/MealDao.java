package SestaNedelja.rs.itbootcamp.dao;

import SestaNedelja.rs.itbootcamp.model.FoodModel;
import SestaNedelja.rs.itbootcamp.model.MealModel;

import java.util.List;

public interface MealDao {
    void insert (MealModel mm);
    void delete (int id); //meal id
    void update (MealModel mm);
    MealModel getMeal (int id);
    List <MealModel> getAllMeals();
    List <String>getFoodMealNames(int meal_id);
    List <FoodModel> getFoodMeal(int meal_id); //Сва храна за јело са id = meal_id
}
