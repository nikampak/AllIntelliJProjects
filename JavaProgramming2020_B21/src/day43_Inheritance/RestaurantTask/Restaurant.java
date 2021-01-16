package day43_Inheritance.RestaurantTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public static boolean hasKitchen;
    public static boolean hasCashier;

    public String owner;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;

    public Restaurant(String owner){
        this.owner =owner;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    static {
        hasKitchen = true;
        hasCashier = true;
    }

    public void hireSever(Server server){ // this method adds 1 server at a time
        servers.add(server);
    }

    public void hireServer(Server[] servers) { // adds All at once an Array of servers
        this.servers.addAll(Arrays.asList(servers)); // option #1
  //      for (Server each : servers){
  //          hireSever(each);    // option #2 hiring each server one by one
  //      }
    }

    public void hireChef(Chef chef){
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs){
        this.chefs.addAll( Arrays.asList( chefs ));
    }

    public void terminateEmployee(String ID){
        servers.removeIf(p -> p.ID.equals(ID));
        chefs.removeIf(p -> p.ID.equals((ID)));
    }
    public String toString(){
        return "Owner: "+owner +
                "\nTotal Number of Employee:" + (servers.size() + chefs.size()) +
                "\nservers: "+servers.size() +
                "\nChefs: "+chefs.size();
    }
}
