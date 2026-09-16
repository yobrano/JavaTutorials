public class Task{
    private String title = "";
    private boolean isComplete = false;

    public String getTitle(){
        return this.title;
    }

    public boolean getIsComplete(){
        return this.isComplete;
    }

    public String toString(){
        return this.title+" ("+this.isComplete+")";
    }

    public Task(String title, boolean isComplete){
        this.title = title;
        this.isComplete = isComplete;
    }

    public void complete(){
        this.isComplete = true;
    }

    


}