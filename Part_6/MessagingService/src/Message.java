import java.time.LocalDate;

public class Message{
    private String content;
    public String getContent(){
        return this.content;
    }

    private String sender;
    public String getSender(){
        return this.sender;
    }

    private LocalDate timeStamp;
    public LocalDate getTimeStamp(){
        return this.timeStamp;
    }


    public Message(String sender, String content){
        this.sender = sender;
        this.content = content;
        this.timeStamp = LocalDate.now();
    }

    public String toString(){
        return "("+this.timeStamp+") "+this.sender+" : "+this.content;
    }

    public int getLength(){
        return this.content.length();
    }
    public boolean equals(Object other){
        if(this == other){
            return true;
        }

        if(!(other instanceof Message)){
            return false;
        }

        Message otherMessage = (Message) other;
        if(
            (this.sender.equals(otherMessage.getSender()))&&
            (this.content.equals(otherMessage.getContent()))&&
            (this.timeStamp.equals(otherMessage.getTimeStamp()))
        ){
            return true;
        }
        return false;


    }



}