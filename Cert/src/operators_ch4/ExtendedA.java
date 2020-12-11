package operators_ch4;

class ClassA{
public int numberOfInstances;
protected ClassA(int numberOfInstances){
 this.numberOfInstances=numberOfInstances;
}
}
public class ExtendedA extends ClassA{	
protected ExtendedA(int numberOfInstances) {
 super(numberOfInstances);
}
public static void main(String[] args){
 ExtendedA ext=new ExtendedA(420);
 System.out.println(ext.numberOfInstances);
} 
}