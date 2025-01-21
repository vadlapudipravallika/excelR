//package Core_Java;
// Demo032 - wap to create a Hashset to store 
// Homogeneous string values
import java.util.HashSet;
class HashSetdemo2 {
//HashSet does not allow duplicates and it does 
// not guarantee of the 
//order in which the elements are added...
    void HashsetMethod(){
        HashSet <String>hashSet = new HashSet<String>();
		hashSet.add("INDIA");
		hashSet.add("AUSTRALIA");
		hashSet.add("BANGLADESH");
		hashSet.add("CHINA");
		hashSet.add("DUBAI");
		hashSet.add("INDIA");
		System.out.println(hashSet);
    }
	
}

public class demo032 {
    public static void main(String[] args) {
		HashSetdemo2 obj = new HashSetdemo2();
        obj.HashsetMethod();
	}
}