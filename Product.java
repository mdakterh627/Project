
package evidence2;


public class Product {

   
    
    private int id;
    private String Name;
    private int Quantity;
    private float Price;
    
    public Product(){
    
    
    }

    public Product(int id, String Name, int Quantity, float Price) {
        this.id = id;
        this.Name = Name;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getQuantity() {
        return Quantity;
    }

    public float getPrice() {
        return Price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }
    
    
}
