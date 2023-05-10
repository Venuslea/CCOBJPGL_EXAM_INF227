public class Me implements Tourist {

    static int budget = 1000;
    

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
        System.out.println("my budget is " + getBudget());

        if ( budget > boracay.airFare  ){
            System.out.println("Boracay Crystal KayaK <3" );
            budget -= boracay.airFare;
            
        }else{
            System.out.println("insufficient Money");
        }

      checkBudget();
        
    }

    public void visit(Bicol bicol) {

        if(budget >bicol.airFare){
            System.out.println("Bicol Spicy Icecream <3");
            budget -= bicol.airFare;
        }else{
            System.out.println("insufficient Money");
        }

        checkBudget();
    }
    public void visit(Bohol bohol) {
        if(budget >bohol.airFare){
            System.out.println("Bohol Peanut kisses <3 ");
            budget -= bohol.airFare;
        }else{
            System.out.println("insufficient Money");
        }

        checkBudget();
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Palawan twin lagoon <3");
            budget -= palawan.airFare;
        }else{
            System.out.println("insufficient Money");
        }

        checkBudget();
    }

    public void visit(Siargao siargao) {
        if(budget >siargao.airFare){
            System.out.println("Siargao Surf!!");
            budget -= siargao.airFare;
        }else{
            System.out.println("insufficient Money");
        }

        checkBudget();
    }

    public void visit(Iloilo iloilo) {
        if(budget >iloilo.airFare){
            System.out.println("Iloilo Fishing!!!");
            budget -= iloilo.airFare;
        }else{
            System.out.println("insufficient Money");
        }

        checkBudget();
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}