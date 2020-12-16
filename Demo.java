package ch1;


import static ch1.utils.Repetition.twice;
  enum MyColor{
	RED(0xff0000),GREEN(0x00ff00),BLUE(0xff0000);
	private final int rgb;
	 MyColor(int rgb){this.rgb=rgb;}
	 public int getRGB(){return rgb;}
 };



public class Demo {

	public static void main(String[] args) {
    System.out.println(twice("pizza"));
    Element e = Element.FIRE;
    System.out.println(e);
    if(MyColor.RED.getRGB()<MyColor.BLUE.getRGB()){}

    
    
	}

}
