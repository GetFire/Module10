package HomeWork_inspired_by_LOTR;

/**
 * Created by User on 13.01.2017.
 */
public class Cake {
    private String name;
    private String recipe;
    private String shape;

    public Cake(String name, String recipe, String shape) {
        this.name = name;
        this.recipe = recipe;
        this.shape = shape;
    }

    public Cake() {
        this.name = "Тортик";
        this.recipe = "3 яйца, крем, печка";
        this.shape = "Урезаный цилиндр";
    }

    public String getName() {
        return name;
    }

    public String getRecipe() {
        return recipe;
    }

    public String getShape() {
        return shape;
    }
}
