public class App {
     public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Locations Boracay = new Boracay();
        Locations Bicol = new Bicol();
        Locations Bohol= new Bohol();
        Locations Palawan = new Palawan();
        Locations Siargao = new Siargao();
        Locations Iloilo = new Iloilo();

        Tourist Me = new Me();

        Boracay.accept(Me);
        Bicol.accept(Me);
        Bohol.accept(Me);
        Palawan.accept(Me);
        Siargao.accept(Me);
        Iloilo.accept(Me);


     }
}
