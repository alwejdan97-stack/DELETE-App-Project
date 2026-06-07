import java.util.ArrayList;

public class DeleteTaskDemo {
    public static void main(String[] args){
        ArrayList<String> tasks =new ArrayList<>();
        tasks.add("Buy groceries");
        tasks.add("Call doctor");
        tasks.add("Finish report");

        System.out.println("*** Show Available Tasks ***");
        for(String t:tasks){
            System.out.println(" "+t);
        }

        String taskToDelete="Go to gym";
        boolean taskFound=false;
        for(int i=0;i<tasks.size();i++){
            if(tasks.get(i).equals(taskToDelete)){
                tasks.remove(taskToDelete);
               taskFound=true;
                System.out.println(taskToDelete+" Removed SUCCESSFULLY...");
                break;
            }
        }
        if(!taskFound){
            System.out.println(taskToDelete+" NOT Found, NO Deletion Performed...");
        }

        System.out.println("*** Show Available Tasks After Deleting ***");
        for(String t:tasks){
            System.out.println(" "+t);
        }
    }
}
