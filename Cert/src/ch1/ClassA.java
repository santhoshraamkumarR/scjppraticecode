package ch1;

public class ClassA {

	public static void main(String[] args) {
		ClassB classB=new ClassB();
		  classB.getValue();
System.out.println(classB.getValue());
	}

}
class ClassB{
public ClassC classC;
 public String getValue() {
  return classC.getValue();
 }
}


class ClassC{
public String value="10";
 public String getValue(){
  value="ClassB";
  return value;
 }
}
