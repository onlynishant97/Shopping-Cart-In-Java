public class Cart {
    Item[] cartArray=new Item[6];
    public Cart(){        
    }
    public Cart(Item[] cartArray){
    }
    public void setCartArray(Item[] cartArray){
        for(int i=0;i<cartArray.length;i++){
            this.cartArray[i]=new Item(cartArray[i].getName(),cartArray[i].getDescription(),cartArray[i].getPrice(),cartArray[i].getQuantity());
        }
    }
    public Item[] getCartArray(){
        return cartArray;
    }
}
