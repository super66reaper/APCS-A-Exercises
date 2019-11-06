public class PantryTester {
    public static void main(String[] args) {
        Jam goose = new Jam( "Gooseberry", "7/4/86", 12);
        Jam apple = new Jam( "Crab Apple", "9/30/99", 8);
        Jam rhub  = new Jam( "Rhubarb", "10/31/99", 16);
        
        Communicator com = new Communicator(goose, apple, rhub);

        com.listJams();
        
    }
}