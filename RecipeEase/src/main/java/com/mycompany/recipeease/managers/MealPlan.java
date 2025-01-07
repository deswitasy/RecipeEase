/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recipeease.managers;

import com.mycompany.recipeease.models.User;
import java.util.Date;

/**
 *
 * @author pistachya
 */
public class MealPlan extends User{
   private int mealPlanID;
    private Date date;
    private String mealType;
    private int recipeID;

    public MealPlan(int userID, String username, String password, String email, String role, int mealPlanID, Date date, String mealType, int recipeID) {
        super(userID, username, password, email, role);
        this.mealPlanID = mealPlanID;
        this.date = date;
        this.mealType = mealType;
        this.recipeID = recipeID;
    }

    // Metode Getter and Setter
     public int getMealPlanID() {
        return mealPlanID;
    }

    public void setMealPlanID(int mealPlanID) {
        this.mealPlanID = mealPlanID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    // Methods
    public void addMeal() {
        System.out.println(getUsername() + " Menambahkan makanan dengan jenis " + mealType + " dengan ID resep " + recipeID + " untuk rencana makan.");
    }

    public void removeMeal() {
        System.out.println(getUsername() + " Menghapus makanan dengan ID resep " + recipeID + " dari rencana makan.");
    }
}

