package com.mycompany.assignment;

/**
 *
 * @author Gueest
 */
import java.util.Scanner;
public class Assignment {

    public static void main(String[] args) {
        int Stime,Etime,Rental=0;
        System.out.println("Enter the Start and end time in hours :");
        Scanner input= new Scanner(System.in);
        Stime= input.nextInt();
        Etime= input.nextInt();
        if (Stime > Etime){
            System.out.println("Invalid");
        }
        else if((Stime<0 || Stime >23) ||(Etime <1 || Etime> 24)) {
            System.out.println("Invalid");
        }  
        
        else{
            for (int i = Stime; i < Etime; i++) {
            if((i>=0 && i<7) ||(i>=21 && i<24)) {
                Rental= Rental+500;
            }
            else if((i>=7 && i<14) || (i>=19 && i<21)){
                Rental= Rental+1000;
            }
            else if(i>=14 && i<=19){
                Rental= Rental+1500;
            }
            }
            System.out.println("The customer will pay:" + Rental);
        }
    }
}
------------------------------------------------------------------------------------------------

package com.mycompany.mushrooms;

/**
 *
 * @author Gueest
 */
import java.util.Scanner;
public class Mushrooms {

    public static void main(String[] args) {
        String gills,forest,Convexcup,ring;
        System.out.println("Answer the question with yes or no");
        Scanner input= new Scanner(System.in);
        System.out.println("Does your mashroom have a ring?");
        ring=input.nextLine();
        if(ring.equalsIgnoreCase("yes")){
            System.out.println("Does your mashroom grow in forest:");
            forest=input.nextLine();
            if (forest.equalsIgnoreCase("yes")){
                System.out.println("your mushroom is Amanite tue-mouche");
            }
            else if(forest.equalsIgnoreCase("no")){
                System.out.println("Does your mushroom have a convexcup?");
                Convexcup=input.nextLine();
                if(Convexcup.equalsIgnoreCase("yes")){
                    System.out.println("your mushroom is Agaric Jaunissant");
                }
                else if(Convexcup.equalsIgnoreCase("no")){
                    System.out.println("your mushroom is Coprin chevelu");
                }
                else{
                    System.out.println("Invalid input");
                }
            }
            else{
               System.out.println("Invalid input"); 
            }
        }
        else if(ring.equalsIgnoreCase("no")){
            System.out.println("Does your mashroom have gills:");
            gills = input.nextLine();
            if(gills.equalsIgnoreCase("yes")){
            System.out.println("Does your mashroom have a convex cup?");
                Convexcup=input.nextLine();
                if(Convexcup.equalsIgnoreCase("yes")){
                    System.out.println("your mushroom is Pied bleu");
                }
                else if(Convexcup.equalsIgnoreCase("no")){
                   System.out.println("your mushroom is Girolle"); 
                }
                else{
                  System.out.println("Invalid input");
                }
        }
            else if(gills.equalsIgnoreCase("no")){
                System.out.println("your mushroom is Cepe de bordeau");
            }
            else{
                System.out.println("Invalid input");
            }
        }
        else{
          System.out.println("Invalid input");  
        }
    }}
