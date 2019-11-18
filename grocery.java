public class grocery extends item implements discount, tax 
{
  
   private double price;
   private double units;
   private double discount;
  
   ////////////////////////////////////////////////////////////////////////////////////////////////
   
   public grocery(String itemCode, String name, double price, double units, double discount)
   {
       super(itemCode, name);
       this.price = price;
       this.units = units;
       this.discount = discount;
   }

   ////////////////////////////////////////////////////////////////////////////////////////////////
   
   @Override
   public double computeDiscount() 
   {
       return (units * price) * (discount / 100.00);
   }
  

   ////////////////////////////////////////////////////////////////////////////////////////////////
   
   @Override
   public double computeTax() 
   {
       return 0;
   }
   
   //////////////////////////////////////////////////////////////////////////////////////////////////
 
   public double computeTotalPrice()
   {
       double discount = computeDiscount();
       return (units * price) - discount + computeTax();
   }

   /////////////////////////////////////////////////////////////////////////////////////////////////
   
   public void displayGrocery()
   {
       super.display();
       System.out.println("Units - " + this.units + ", price - $" + this.price + ", Discount - " + this.discount + "%, Tax - 0");
       System.out.println("");
   }
   
}