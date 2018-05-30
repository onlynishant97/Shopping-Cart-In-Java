
class ShoppingCart extends Cart implements CartManager
{
    private double totalPrice;
    public ShoppingCart(){
        totalPrice=0;
    }
    public ShoppingCart(Item[] cartArray,double totalprice){
        this.totalPrice+=totalPrice;
        for(int i=0;i<cartArray.length;i++){
            this.cartArray[i]=new Item(cartArray[i].getName(),cartArray[i].getDescription(),cartArray[i].getPrice(),cartArray[i].getQuantity());
        }
    }
    public double getTotalPrice(){
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice){
        this.totalPrice+=totalPrice;
    }
    public void addToCart(Item item){
        int c=0;
        for(int i=0;i<cartArray.length;i++){
            if(cartArray[i]!=null)c++;
        }
        cartArray[c++]=item;
    }
    public void removeFromCart(Item item){
        int index=0;
        for(int i=0;i<cartArray.length;i++)
        {
        	if(cartArray[i]==null)break;
            if((cartArray[i].getName()).equals(item.getName()))
            {
                index = i;
                break;
            }
        }
        this.totalPrice-=cartArray[index].getPrice();
        for(int i=index;i<cartArray.length-1;i++) {
        	cartArray[i]=cartArray[i+1];
        }
    }
    
    public void displayCartInfo(){
    	System.out.println("Shopping Cart");
        System.out.format("%-10s %-15s %-10s %-10s","Name","Description","Quantity","Price\n");
                for(int i=0;i<cartArray.length;i++){
                	if(cartArray[i]==null)break;
        System.out.format("%-10s %-15s %-10s %-10s",cartArray[i].getName(),cartArray[i].getDescription(),cartArray[i].getPrice(),cartArray[i].getQuantity());
                System.out.println();
                
                }
    }
}