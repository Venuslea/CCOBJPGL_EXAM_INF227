public interface Tourist {

        int budget = 1000;
    
        void visit();
    
        void visit(Boracay boracay);
    
        void visit(Bicol bicol);
        
        void visit(Bohol bohol);
    
        void visit(Palawan palawan);
    
        void visit(Siargao siargao);
    
        void visit(Iloilo iloilo);
    
        default void visit(Locations locations) {
            System.out.println("Arrived on a location");
        };
    
        void checkBudget();
    }
    

