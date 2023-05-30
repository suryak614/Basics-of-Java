import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char mainMenu = 'Y';
        int select;
        String[] menu = {"\nView the complete list of our products", "Check the available count for a specific product", "View the specifications and details of a specific product", "Modify the details of a specific product", "Update the inventory for a specific product", "Exit"};
        String[] invo = {"       101         Mobile", "       102          Laptop", "       103          Tablet", "       104          Portable HDD", "       105          Bluetooth Headphone", "       106         Smart-watch", "       107         Digital Camera","       108         Portable Power bank", "       109            Printer", "       110           Wireless Router"};
        
           
        
        while(mainMenu == 'Y' || mainMenu == 'y'){
            System.out.println
        ("-----------------------------------------------------------------------------------------------------\n Welcome to the SmartPoint Electronics Store\n-----------------------------------------------------------------------------------------------------");
            for (String i: menu)
                System.out.println(i);
            System.out.println("\n\nPlease choose an option from the above menu: ");     
            select = sc.nextInt();
            
            switch (select) {
                case 1:
                option1(invo);
                break;

                case 2:
                break;

                case 3:
                break;

                case 4:
                break;

                case 5: 
                
                break;

                case 6:
                exit1 ();
                break;


            }
            
            
           System.out.print("\nEnter “Y” to return to the main menu or “N” to Exit: ");
           mainMenu = sc.next().charAt(0);
           if (mainMenu == 'N' || mainMenu == 'n')
            exit1();
        
        }
        
    }

    public static void exit1 (){
        System.out.println("Thank you for visiting SmartPoint!\n\n");
    }

    public static void option1 (String[] invo1){
        System.out.println
        ("-----------------------------------------------------------------------------------------------------\n List of all Products\n-----------------------------------------------------------------------------------------------------\n");
        System.out.println("Product ID   Product Name\n");
        for (String i: invo1)
                System.out.println(i);
    }

            
    }

