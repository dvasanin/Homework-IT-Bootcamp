package SestaNedelja.rs.itbootcamp.dao;

import SestaNedelja.rs.itbootcamp.model.FoodModel;

import java.util.List;

public interface FoodDao {
    void insert(FoodModel fm);

    void addToMeal(int meal_id, int food_id, double mass);

    void delete(int id);

    void update(FoodModel fm);

    FoodModel getFood(int id);

    List<FoodModel> getAllFood();
}
