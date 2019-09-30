package Inherit;

 class Inheritance {
  
  

  
public static void main(String[] args) {
   
   Box a = new Box(2,3,4);
  System.out.println("Box a " + a.toString()) ;
  System.out.println("Box a surface area: " + a.getArea());
  Box b = new Box(4,7,4);
  System.out.println("Box b " + b.toString()) ; 
  System.out.println("Box b surface area: " + b.getArea());
 System.out.println(a.equal(a,b)); 
  Geometric4Tester c = new Geometric4Tester();
  
  
  }
}
  class Rectangle {
   
   private  int lenght;
   private  int width;
   private static  int area;
   
   public  Rectangle(int l,int w){
    
     
     setWidth(w);
     setLength(l);
     setArea(getLength(),getWidth());
     
     }
     
   public  int getLength(){
     return lenght;
   }
   public  int getWidth(){
     return width;
   }
   public   void setLength(int Lenght){
     
     this.lenght = Lenght;
   }
   public  void setWidth(int Width){
      this.width = Width;
   }
   public int getArea(){
     return area;
   }
   public void setArea(int l , int w){
     
     area = l*w;
   }
   public String toString(){
     return "Lenght : " + lenght + " Width: " + width + " Area: " + area;
   }
   
  
}//End

class Triangle{
  private double side1;
  private double side2;
  private double side3;
  private double area;
  
  public Triangle(double Side1 ,double Side2 , double Side3){
    setSide1(Side1);
    setSide2(Side2);
    setSide3(Side3);
  }
  public double getSide1(){
    return side1;
  }
   public double getSide2(){
    return side2;
  }
   public double getSide3(){
    return side3;
  }
  public void setSide1(double Side1){
    this.side1 = Side1;
  }
  public void setSide2(double Side2){
    this.side2 = Side2;
  }
  public void setSide3(double Side3){
    this.side3 = Side3;
  }
  public String toString(){
    return "Side 1 = " + side1 + " Side 2 = " + side2 + " Side 3 = "+ side3;
  }
  public void setArea(double Side1,double Side2, double Side3){
    
    double p = (Side1 + Side2 + Side3)/2;//Perimeter.
    this.area = Math.sqrt(p*(p-Side1)*(p-Side2)*(p-Side3));
  }
  public double getArea(){
    return area;
  }
}
 class Box extends Rectangle{
   private int height;
   
   public Box(int l, int w, int h){
     super(l,w);
     setHeight(h);
     
   }
   public void setHeight(int Height){
     this.height = Height;
   }
   public int getHeight(int Height){
     return height;
   }
   public String toString(){
     return "[Box  : width = "+ super.getWidth()+ " length = " + super.getLength()+ " height = " + height + "]";
   }//I called the methods in the super class .Since the variable in super class is private I cant call it.
   
   public int  getArea(){
    
     return 2*(height * super.getLength()) + 2*(height*super.getWidth()) + 2*(super.getWidth()* super.getLength());
   }
   public boolean equal(Box a, Box b){
   
    System.out.print("Check if Box a and Box b are equal? ");
     if(a.height == b.height && a.getLength()== b.getLength() && a.getWidth() == b.getWidth() ){
       return true;
     }
     else 
     return false;
     
     
   }
 }//End of class
 
 class IsoscelesRight extends Triangle{
 
   public IsoscelesRight(double equalSide){
   super(0,0,0);
    setEqualSide(equalSide);
    setNotEqualSide(equalSide);
    
   }
   public void setEqualSide(double equalside){
     
     super.setSide1(equalside);
     super.setSide2(equalside);
   }
   public double  getEqualSide(){
     
     return super.getSide1();
   }
   public void setNotEqualSide(double notEqual){
     
     super.setSide3(notEqual*Math.sqrt(2.0));
   }
   
   
   public double getNotEqualSide(){
     return super.getSide3();
   }
   public String toString(){
     return "[IsoscelesRight: equal side = " + getEqualSide() + " ,non equal side = " + getNotEqualSide() + "]";
   }
   public double getArea(){
    
    double p = (getEqualSide()+ getEqualSide() + getNotEqualSide())/2;
    
    return Math.sqrt(p*(p-getEqualSide())*(p-getEqualSide())*(p-getNotEqualSide()));
   }
   public boolean equal(IsoscelesRight c,IsoscelesRight d ){
   System.out.print("Check if IsoscelesRight c and IsoscelesRight  d are equal? ");
     if(c.getEqualSide() == d.getEqualSide()){
       return true;
     }
     else
     return false;
   }
 }
 class Geometric4Tester{
 
   public Geometric4Tester (){
   IsoscelesRight c = new IsoscelesRight(3);
   IsoscelesRight d = new IsoscelesRight(3);
   System.out.println("IsoscelesRight c : " + c.toString());
   System.out.println("IsoscelesRight c area: " + c.getArea());
   System.out.println("IsoscelesRight d : " + d.toString());
   System.out.println("IsoscelesRight d area: " + d.getArea());
   System.out.println(c.equal(c,d));
   }
  
 }
 
 