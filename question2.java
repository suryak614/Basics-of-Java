import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char mainMenu = 'Y';
        int select;
        String[] menu = {"\nView the complete list of our products", "Check the available count for a specific product", "View the specifications and details of a specific product", "Modify the details of a specific product", "Update the inventory for a specific product", "Exit"};
        String[] invo = {"       101         Mobile", "       102          Laptop", "       103          Tablet", "       104          Portable HDD", "       105          Bluetooth Headphone", "       106         Smart-watch", "       107         Digital Camera","       108         Portable Power bank", "       109            Printer", "       110           Wireless Router"};
        
        int[] count = {10, 20, 30, 40, 50, 25, 70, 80, 90, 100};
        
        String[] detail = {"DETAIL1", "Detail2", "Detail3", "DETAIL1", "DETAIL1", "Compatibility - ios and Android | Water Resistance | Battery Life - 2days | GPS, fitness tracking, sleep monitoring, step counting, and more", "DETAIL1", "DETAIL1", "DETAIL1", "DETAIL1"};
        int pos;
        int opp;
        int num;

        while(mainMenu == 'Y' || mainMenu == 'y'){
            System.out.println
        ("-----------------------------------------------------------------------------------------------------\n Welcome to the SmartPoint Electronics Store\n-----------------------------------------------------------------------------------------------------");
            for (String i: menu)
                System.out.println(i);
            System.out.print("\n\nPlease choose an option from the above menu: ");     
            select = sc.nextInt();
            
            switch (select) {
                case 1:
                option1(invo);
                break;

                case 2:
                option2(invo, count);
                break;

                case 3:
                option3(invo, count, detail);
                break;

                case 4:
                break;

                case 5: 
                System.out.print("Enter the Product ID: ");
                pos = sc.nextInt();
                System.out.println("\nAdd inventory\nSubtract inventory\n\nPlease choose an option from the above menu: ");
                opp = sc.nextInt();
                System.out.println("Current available inventory is ");
                System.out.println(count[pos-101] );
                if (opp == 1){
                    System.out.println("Please enter the count to be added: ");
                    num = sc.nextInt();
                    count[pos-101]+= num;
                    
                }
                if (opp == 2){
                    System.out.println("Please enter the count to be subtracted: ");
                    num = sc.nextInt();
                    count[pos-101]-= num;
                    
                }
                
                System.out.println("\n-----------------------------------------------------------------------------------------------------\n");
        
         System.out.println(invo[pos-101]);
         System.out.print("\nTotal available count: ");
         System.out.println(count[pos-101]);
         System.out.println("\n-----------------------------------------------------------------------------------------------------\n");


                break;

                case 6:
                
                break;


            }
            
            
           System.out.print("\nEnter “Y” to return to the main menu or “N” to Exit: ");
           mainMenu = sc.next().charAt(0);
           if (mainMenu == 'N' || mainMenu == 'n')
            exit1();
        
        }
        
    }

    public static void exit1 (){
        System.out.println("Thank you for visiting SmartPoint!\n");
    }

    public static void option1 (String[] invo1){
        System.out.println
        ("-----------------------------------------------------------------------------------------------------\n List of all Products\n-----------------------------------------------------------------------------------------------------\n");
        System.out.println("Product ID   Product Name\n");
        for (String i: invo1)
                System.out.println(i);
    }

    public static void option2 (String[] invo1, int[] item){
        // System.out.print{"Enter the Product ID: "};
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.print("Enter the Product ID: ");
        id = sc.nextInt();
        System.out.println("\n-----------------------------------------------------------------------------------------------------\n");
        
         System.out.println(invo1[id-101]);
         System.out.print("\nTotal available count: ");
         System.out.println(item[id-101]);
         
    }

    public static void option3 (String[] invo1, int[] item, String[] invo2){
        // System.out.print{"Enter the Product ID: "};
        Scanner sc = new Scanner(System.in);
        int id;
        System.out.print("Enter the Product ID: ");
        id = sc.nextInt();
        System.out.println("\n-----------------------------------------------------------------------------------------------------\n");
        
         System.out.println(invo1[id-101]);
         System.out.print("\nTotal available count: ");
         System.out.println(item[id-101]);
         System.out.println();
         System.out.println(invo2[id-101]);
         
    }

            
    }

