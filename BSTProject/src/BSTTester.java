/*
 * TODO: Leo Wang 
 * TODO: 3/2/26
 * TODO: 6
 * TODO: Search Tree 
 */

 import java.lang.Comparable;

 public class BSTTester {
   public static void main(String[] args) {

    BST chris = new BST(); 
    chris.add("a"); 
    chris.add("r"); 
    chris.add("u"); 
    chris.add("n"); 
    chris.add("m"); 
    chris.add("e"); 
    chris.add("a"); 
    chris.add("d");
    chris.add("e");

    System.out.println("In order: ");
    chris.printInOrder();
    System.out.println("Post Order: ");
    chris.printPostOrder(); 
    System.out.println("Pre Order: ");
    chris.printPreOrder(); 
   
	
 }
}