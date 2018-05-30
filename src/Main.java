import java.io.*;
public class Main
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        Item[] items =new Item[6];
        items[0]=new Item("T-shirt","T-shirt",500.0,1);
        items[1]=new Item("Shirt","shirt",300.0,1);
        items[2]=new Item("Mobile","mobile",50000.0,1);
        items[3]=new Item("Shoes","shoes",2000.0,1);
        items[4]=new Item("Jeans","jeans",1200.0,1);
        items[5]=new Item("Belt","belt",400.0,1);
        ShoppingCart shop = new ShoppingCart();
        WishList wish=new WishList();
        while(true){
            System.out.println("Menu\n1.Add to shopping cart\n2.Add to wishlist\n3.Remove from shopping cart\n4.Remove from wishlist\n5.View shopping cart\n6.View wishlist\n7.Exit\nEnter your choice\n");
            int choice=Integer.parseInt(b.readLine());
            switch(choice)
            {
                case 1 :
                    System.out.println("Item deatils are");
                    System.out.format("%-10s %-15s %-10s %-10s","Name","Description","Quantity","Price\n");
                    for(int i=0;i<items.length;i++){
                      System.out.format("%-10s %-15s %-10s %-10s",items[i].getName(),items[i].getDescription(),items[i].getQuantity(),items[i].getPrice());
                      System.out.println();
                    }
                    while(true){
                        System.out.println("\nEnter the item name");
                    String name = b.readLine();
                    int index=0;
                    for(int i=0;i<items.length;i++){
                        if((items[i].getName()).equals(name)){
                            index=i;
                            break;
                        }
                    }
                    shop.addToCart(items[index]);
                    shop.setTotalPrice(items[index].getPrice());
                    System.out.println("Item added to cart successfully");
                    System.out.println("The total value of the cart is Rs"+shop.getTotalPrice());
                    System.out.println("Do you want to continue(yes/no)");
                    String c=b.readLine();
                    if(c.equals("no"))break;
                    }
                    
                    break;
                case 2 :
                    System.out.println("Item deatils are");
                    System.out.format("%-10s %-15s %-10s %-10s","Name","Description","Quantity","Price\n");
                    for(int i=0;i<items.length;i++)
                    {
                      System.out.format("%-10s %-15s %-10s %-10s",items[i].getName(),items[i].getDescription(),items[i].getQuantity(),items[i].getPrice());
                      System.out.println();
                    }
                    while(true){
                        int flag=0;
                        System.out.println("\nEnter the item name");
                    String name = b.readLine();
                    int index=0;
                    for(int i=0;i<items.length;i++){
                        if((items[i].getName()).equals(name)){
                            index=i;
                            break;
                        }
                    }
                    wish.addToCart(items[index]);
                    System.out.println("Item added to WishList successfully");
                    System.out.println("Do you want to continue(yes/no)");
                    String c=b.readLine();
                    while(true){
                    if(c.equals("no")){flag=1;break;}
                    else if(c.equals("yes")){break;}
                    else{System.out.println("Enter valid choice");c=b.readLine();}
                    
                    }
                    if(flag==1)break;
                    }
                    
                    break;
                case 3 :
                    while(true){
                        shop.displayCartInfo();
                        System.out.println("\nEnter the item name");
                    String name = b.readLine();
                    int index=0;
                    for(int i=0;i<items.length;i++){
                        if((items[i].getName()).equals(name)){
                            index=i;
                            break;
                        }
                    }
                    shop.removeFromCart(items[index]);
                    System.out.println("The total value of cart is Rs "+shop.getTotalPrice());
                    System.out.println("Do you want to continue(yes/no)");
                    String c=b.readLine();
                    if(c.equals("no"))break;
                    }
                    break;
                case 4 :
                	while(true){
                        wish.displayCartInfo();
                        System.out.println("\nEnter the item name");
                    String name = b.readLine();
                    int index=0;
                    for(int i=0;i<items.length;i++){
                        if((items[i].getName()).equals(name)){
                            index=i;
                            break;
                        }
                    }
                    wish.removeFromCart(items[index]);
                    System.out.println("Do you want to continue(yes/no)");
                    String c=b.readLine();
                    if(c.equals("no"))break;
                    }
                    break;
                case 5 :
                    shop.displayCartInfo();
                    break;
                case 6 :
                    wish.displayCartInfo();
                    break;
                case 7 :
                	return;
                
            }
        }
    }
}