package model;

import java.util.ArrayList;

public class Recipe {
    public void addIngredients(String n, int w) {
        if(ingredients.size()==0){
            ingredients.add(new Ingredient(n,w));
        }else{
            for(int i=0;i<ingredients.size();i++) {
                if (ingredients.get(i).getName().equalsIgnoreCase(n)) {
                    ingredients.get(i).setWeight(ingredients.get(i).getWeight()+w);
                    return;
                }
            }
                ingredients.add(new Ingredient(n,w));
        }

    }
    public void removeIngredient(String n){
        for (int i=0;i<ingredients.size();i++){
           if(ingredients.get(i).getName().equalsIgnoreCase(n)){
               ingredients.remove(ingredients.get(i));
           }
        }
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

}
