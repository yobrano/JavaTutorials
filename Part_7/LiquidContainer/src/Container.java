public class Container{
    private int volume = 0;
    private int maxVolume = 100;

    public Container(){

    }
    public void add(int amount){
        int newVolume = amount + this.volume;
        boolean isVolumeIncreased = newVolume > this.volume;
        boolean isOverFilled = newVolume > this.maxVolume;
        
        if(isOverFilled){
            this.volume = this.maxVolume;
        }else{
            if(isVolumeIncreased){
                this.volume = newVolume;
            }
        }
        
    }

    public void remove(int amount){
        int newVolume = this.volume - amount;
        boolean isVolumeDecreased =  newVolume < this.volume;
        boolean isOverDrawn = newVolume < 0;
        if(isOverDrawn){
            this.volume = 0;
        }else{
            if(isVolumeDecreased){
                this.volume = newVolume;
            }
        }
    }

    public int contains(){
        return this.volume;
    }

    public String toString(){
        return this.volume + "/"+ this.maxVolume;
    }
}