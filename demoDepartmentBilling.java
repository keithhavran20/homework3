public class demoDepartmentBilling 
{
   public static void main(String[] args) 
   	{
       
       grocery go1 = new grocery("11", "Bread", 1.50, 2, 0);
       grocery go2 = new grocery("12", "Apple", 0.75, 6, 1);
       
       //////////////////////////////////////////////////////////////////////////////////////////
       
       clothing cloth1 = new clothing("21", "Jeans", "Levis", 35, 1, 0);
       clothing cloth2 = new clothing("22", "Dress Shirt", "Izod", 25, 2, 10);
       
       ////////////////////////////////////////////////////////////////////////////////////////////
       
       double totalPrice = 0;
       totalPrice = go1.computeTotalPrice() + go2.computeTotalPrice() + cloth1.computeTotalPrice() + cloth2.computeTotalPrice();
       
       ////////////////////////////////////////////////////////////////////////////////////////////
       
       go1.displayGrocery();
       go2.displayGrocery();
       cloth1.displayClothing();
       cloth2.displayClothing();
       
       /////////////////////////////////////////////////////////////////////////////////////////////
       
       float grandTotal = (float)totalPrice;
       String twoDecimal = String.format ("%,.2f", grandTotal);
       
       //////////////////////////////////////////////////////////////////////////////////////////
       
       System.out.println("");
       System.out.printf("Your grand total is $" + twoDecimal);
       System.out.println("");
       
   }  
}