package test;
import Exeptions.IngredientExeption;
import junit.framework.TestCase;
import model.Ingredient;

public class ingredienttest extends TestCase {
    private Ingredient ingredient;
    public void setUpStage1(){
        ingredient= new Ingredient("Tomate",245);
    }
    public void test1()  {
        setUpStage1();
        try{
            ingredient.addWeight(54);
            assertEquals(299,ingredient.getWeight());
        }catch (IngredientExeption e){
            assertNotNull(e);
        }

    }

    public void test2(){
        setUpStage1();
        try{
            ingredient.addWeight(-100);
            fail();
        }catch (IngredientExeption e){
            assertNotNull(e);
            assertEquals(245,ingredient.getWeight());
        }
    }

    public void test3(){
        setUpStage1();
        try{
            ingredient.removeWeight(-100);
            assertEquals(200,ingredient.getWeight());
        }catch (IngredientExeption e){
            assertNotNull(e);
        }
    }

    public void test4(){
        setUpStage1();
        try{
            ingredient.removeWeight(-100);
            fail();
        }catch (IngredientExeption e){
            assertNotNull(e);
            assertEquals(245,ingredient.getWeight());
        }
    }
}