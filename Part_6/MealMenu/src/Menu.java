import java.util.ArrayList;

public class Menu{
    private ArrayList<String> menu;
    public Menu(){
        this.menu = new ArrayList<>();
    }

    public void addMeal(String meal){
        this.menu.add(meal);
    }

    public void removeMeal(String meal){
        this.menu.remove(meal);
    }

    public void clearMenu(){
        this.menu.clear();
    }

    public void printMeals(){
        for(String meal : this.menu){
            System.out.println(meal);
        }
    }

}