import java.util.Random;

public class Jar {
    private String ItemType;
    private int MaxItemCount;

    public Jar(String itemType, int maxItemCount){
        this.ItemType = itemType;
        this.MaxItemCount = maxItemCount;
    }

    public String getItemType(){
        return ItemType;
    }

    public void setItemType(String itemType){
       this.ItemType = itemType;
    }

    public int getMaxItemCount(){
        return MaxItemCount;
    }

    public void setMaxItemCount(int maxItemCount){
        this.MaxItemCount = maxItemCount;
    }

    public int fill(){
        Random random = new Random();
        int maxItemsAllowed = getMaxItemCount();
        int randomNumberGen = random.nextInt(maxItemsAllowed);

        return randomNumberGen;
    }
}