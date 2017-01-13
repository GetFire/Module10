package HomeWork_inspired_by_LOTR;

public class Task3 {
    public static void main(String[] args) {
        Cake cake = null;
//        System.out.println(cake.getName());

        try {
            System.out.println(cake.getRecipe());
        }catch (NullPointerException ex){
            System.out.println("Oops! Something wrong!");
        }


    }
}
