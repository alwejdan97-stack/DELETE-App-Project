package ProductApp.Demo.Services;

import ProductApp.Demo.Entities.EventRegistration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RegistrationService {
    Map<Integer, EventRegistration> registrations=new HashMap<>();

    public RegistrationService(){
        registrations.put(101, new EventRegistration("E1-01", "Ahmed"));
        registrations.put(102, new EventRegistration("E2-02", "Sara"));
        registrations.put(103, new EventRegistration("E3-03", "John"));
    }

    public String deleteMultipleByIds(List<Integer> ids){
        List<Integer> deletedIds=new ArrayList<>();
        List<Integer> notFoundIds=new ArrayList<>();

        for(Integer id:ids){
            if(registrations.containsKey(id)){
                registrations.remove(id);
                deletedIds.add(id);
            }else{
                notFoundIds.add(id);
            }
        }
        return "Deletion COMPLETED...\n"+
                "Total Request: "+ ids.size()+"\n"+
                "Total Successful Deleted: "+deletedIds.size()+"\n"+
                "Deleted IDs: "+deletedIds.toString().replace("[","").replace("]","")+"\n"+
                "NOT Found IDs: "+notFoundIds.toString().replace("[","").replace("]","");
    }
}
