import java.util.ArrayList; 

public class CafeUtil { 
    public int getStreakGoal() {
        int sum = 0; 

        for(int x = 0; x < 11; x++){
            sum += x; 
        }
        return sum; 
    } 

    public double getOrderTotal(double[] prices){
        double sum = 0; 

        for(double i: prices){
            sum += i; 
        }
        return sum; 
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int x = 0; x < menuItems.size(); x++){
            System.out.println(x + " " + menuItems.get(x));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please Enter Your Name: ");

        String username = System.console().readLine(); 

        System.out.println("Hello, " + username + "!");
        System.out.println("There are " + customers.size() + " people in front of you");

        customers.add(username);
        
        System.out.println(customers);
    }

}   