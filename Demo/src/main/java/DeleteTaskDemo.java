import java.util.ArrayList;

public class DeleteTaskDemo {
    public static void main(String[] args){
        ArrayList<String> tasks =new ArrayList<>();
        tasks.add("Buy groceries");
        tasks.add("Call doctor");
        tasks.add("Finish report");

        System.out.println("Available Tasks");
        for(String t:tasks){
            System.out.println(" "+t);
        }
    }
}
