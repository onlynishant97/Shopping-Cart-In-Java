public class Item {
	String name;
    String description;
    Double price;
    Integer quantity;
    public Item(){
    }
    public Item(String name,String description,double price,Integer quantity){
        this.name=name;
        this.description=description;
        this.price=price;
        this.quantity=quantity;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setPrice(Double price){
        this.price=price;
    }
    public Double getPrice(){
        return price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public Integer getQuantity(){
        return quantity;
    }
}
