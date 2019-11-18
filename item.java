public class item
{
   
   private String itemCode;
   private String name;
  
   ///////////////////////////////////////////////////////////////////////////////////////////
   
   public item(String itemCode, String name)
   {
       this.itemCode = itemCode;
       this.name = name;
   }
  
   ////////////////////////////////////////////////////////////////////////////////////////////
   
   public void display()
   {
       System.out.println("Item code -- " + this.itemCode);
       System.out.println("Name: " + this.name);
   }

}