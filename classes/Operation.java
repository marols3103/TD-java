
 package classes;
 import java.time.LocalDate;

public class Operation {
    private float  solde ;
    //constructeur pour charger le solde
    public Operation(float solde){
        this.solde = solde;
    }
    //fonction getter pour le solde 
    public float getSolde(){
        return solde;
    }

    // une  operation  depot

    public void depot(float valueDepot,String fullName){
        try{
            if(valueDepot>0){
                solde = solde + valueDepot;
                LocalDate dateDepot = LocalDate.now();
                System.out.println(fullName +" "+"a fait le depot de "+" "+ valueDepot +"le" + " " + dateDepot);
            }
        }catch(Exception e){
            System.err.println(e);

        }
        
    }
    //  retrait d'argent
    public void retrait(float valueRetrait,String fullName){
        try{
            if(solde>= valueRetrait){
                solde -= valueRetrait;
                LocalDate dateRetrait = LocalDate.now();
                System.out.println( fullName +" "+ " a fait un retrait" + valueRetrait + "le" + " "+  dateRetrait);
            }
        }catch(Exception e ){
            System.out.println(e);

        }
    }  
}
