import java.util.ArrayList;

public class TodoList {
    private ArrayList<Task> tasks;
    public TodoList(){
        this.tasks = new ArrayList<>();
    }

    public void add(String task){
        this.tasks.add(new Task(task, false));
    }

    public void print(){
        for(int i = 0; i < this.tasks.size(); i++){
            Task task = this.tasks.get(i);
            System.out.println((i+1)+". "+task.getTitle());
        }
        System.out.println();
    }

    public void remove(int number){
        if(this.tasks.size()>= number){
            this.tasks.remove(number - 1);
        }
    }

}
