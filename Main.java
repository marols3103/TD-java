import java.util.Scanner;

import classes.Operation;

public class Main {

    public static void main(String[] args) {
        int choix;
        Operation operation = new Operation(1000);
        System.out.println("Vous voulez faire une operation?");
        System.out.println("1 : Depot");
        System.out.println("2 : Retrait");
        System.out.println("Taper votre choix :");
        Scanner scanner = new Scanner(System.in);
        choix = scanner.nextInt();
        
        choisirOperation(choix, operation);
    }

    public static void choisirOperation(int choix, Operation operation) {
        float valueDepot;
        String operant ;
        float valueRetrait;
        switch (choix) {
            case 1:
                try{
                    System.out.print("Donner la somme à deposer:");
                    Scanner scanner = new Scanner(System.in);
                    valueDepot = scanner.nextFloat();
                    System.out.print("Donner  le nom de l'operant:");
                    operant = scanner.next();
                    operation.depot(valueDepot, operant);
                    break;
                } catch (Exception e) {
                    System.out.println(e);
                }
                
            case 2:
                try{
                    System.out.println("Donner la somme à retirer:");
                    Scanner scanner = new Scanner(System.in);
                    valueRetrait = scanner.nextInt();
                    System.out.print("Donner  le nom de l'operant:");
                    operant = scanner.next();
                    operation.retrait(valueRetrait, operant);

                    break;

                }catch(Exception e){
                    System.out.println(e);
                }
                
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
