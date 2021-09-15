package SestaNedelja.rs.itbootcamp.dao;

import SestaNedelja.rs.itbootcamp.db.DatabaseConnection;
import SestaNedelja.rs.itbootcamp.model.FoodModel;
import SestaNedelja.rs.itbootcamp.model.MealModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MealDaoSQL implements MealDao {
    private static final Connection conn = DatabaseConnection.getConnection();

    @Override
    public void insert(MealModel mm) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("INSERT INTO meal VALUES (?,?,?,?)");
            st.setInt(1, mm.getMeal_id());
            st.setString(2, mm.getMeal_name());
            st.setString(3, mm.getMeal_desc());
            st.setString(4, mm.getMeal_difficulty());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("DELETE FROM meal WHERE meal_id=?");
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(MealModel mm) {
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement("UPDATE meal " +
                    "SET meal_name=?, " +
                    "meal_desc=?, " +
                    "food_difficulty=? " +
                    "WHERE meal_id = ?");
            st.setString(1, mm.getMeal_name());
            st.setString(2, mm.getMeal_desc());
            st.setString(3, mm.getMeal_difficulty());
            st.setInt(4, mm.getMeal_id());
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public MealModel getMeal(int id) {
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM meal WHERE meal_id = " + id);
            rs.next();
            return new MealModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<MealModel> getAllMeals() {
        List<MealModel> allMeals = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM meal");
            while (rs.next()) {
                MealModel newMeal = new MealModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );

                allMeals.add(newMeal);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return allMeals;
    }

    @Override
    public List<String> getFoodMealNames(int meal_id) {
        List<String> ingredientsInMeal = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT food_name FROM food f" +
                    " INNER JOIN mealfood mf ON f.food_id = mf.food_id" +
                    " WHERE meal_id = " + meal_id);
            while (rs.next()) {
                ingredientsInMeal.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ingredientsInMeal;
    }

    @Override
    public List<FoodModel> getFoodMeal(int meal_id) {
        List<FoodModel> detailedIngredients = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM food f" +
                    " INNER JOIN mealfood mf ON f.food_id = mf.food_id" +
                    " WHERE meal_id = " + meal_id);
            while (rs.next()) {
                FoodModel fm = new FoodModel(rs.getInt(1),
                        rs.getString(2), rs.getDouble(3),
                        rs.getDouble(4), rs.getDouble(5), rs.getDouble(6));
                detailedIngredients.add(fm);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return detailedIngredients;
    }
}
