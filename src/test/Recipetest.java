package test;
import junit.framework.TestCase;
import model.Recipe;
public class Recipetest extends TestCase {
    private Recipe recipe;
    public void setUpStage1(){
        recipe=new Recipe();
    }

    public void setUpStage2(){
        setUpStage1();
        recipe.addIngredients("Cebolla",315);
        recipe.addIngredients("Ajo",58);
        recipe.addIngredients("Arroz",520);
    }

    public void test1(){
        setUpStage1();
        recipe.addIngredients("Sal",12);
        assertEquals(1,recipe.getIngredients().size());
        assertEquals(12,recipe.getIngredients().get(0).getWeight());
        assertEquals("Sal",recipe.getIngredients().get(0).getName());
    }

    public void test2(){
        setUpStage2();
        recipe.addIngredients("Pimienta",6);
        assertEquals(4,recipe.getIngredients().size());
        assertEquals(6,recipe.getIngredients().get(3).getWeight());
        assertEquals("Pimienta",recipe.getIngredients().get(3).getName());
    }

    public void test3(){
        setUpStage2();
        recipe.addIngredients("Ajo",21);
        assertEquals(79,recipe.getIngredients().get(1).getWeight());
        assertEquals(3,recipe.getIngredients().size());
    }
    public void test4(){
        setUpStage2();
        recipe.removeIngredient("Ajo");
        assertEquals(2,recipe.getIngredients().size());
    }
}
