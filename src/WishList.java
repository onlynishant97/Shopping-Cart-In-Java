class WishList extends Cart implements CartManager
 {
    //fill code here
     private Item recentItem;
    public WishList(){}
    public WishList(Item[] cartArray,Item recentItem){
        for(int i=0;i<cartArray.length;i++){
            this.cartArray[i]=new Item(cartArray[i].getName(),cartArray[i].getDescription(),cartArray[i].getPrice(),cartArray[i].getQuantity());
        }            
    }
    public Item getRecentItem(){
        return recentItem;
    }
    public void setRecentItem(Item recentItem){
        this.recentItem = recentItem;
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
        for(int i=index;i<cartArray.length-1;i++) {
        	cartArray[i]=cartArray[i+1];
        }
    }
    
    public void displayCartInfo(){
        System.out.format("%-10s %-15s %-10s %-10s","Name","Description","Quantity","Price\n");
        System.out.println("WishList");
                for(int i=0;i<cartArray.length;i++){
                	if(cartArray[i]==null)break;
        System.out.format("%-10s %-15s %-10s %-10s",cartArray[i].getName(),cartArray[i].getDescription(),cartArray[i].getPrice(),cartArray[i].getQuantity());
        System.out.println();

                }
    }
 }