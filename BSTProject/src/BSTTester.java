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
    System.out.println("Binary search tree test: "); 
    System.out.println("Is Empty test: ");
    System.out.println(chris.isEmpty()); 
    System.out.println(chris.size()); 
    System.out.println("Add method test: Adding ORCHARDQUINCE");
    chris.add("O");
    chris.add("R");
    chris.add("C");
    chris.add("H");
    chris.add("A");
    chris.add("R");
    chris.add("D");
    chris.add("Q");
    chris.add("U");
    chris.add("I");
    chris.add("N");
    chris.add("C");
    chris.add("E");
    System.out.println("New size of chris binary tree : " + chris.size()); 

    System.out.println("In order (A-Z): ");
    chris.printInOrder();
    System.out.println(); 
    System.out.println("Post Order (root last): ");
    chris.printPostOrder(); 
    System.out.println(); 
    System.out.println("Pre Order (root first): ");
    chris.printPreOrder(); 
    System.out.println(); 

    System.out.println("Find method test: "); 
    BST emptyTree = new BST(); 
    System.out.println("Base case: finding 'O' in an empty tree " + emptyTree.find("O"));
    System.out.println("Average case: finding middle value " + chris.find("H"));
    System.out.println("Last case: find 'A' " + chris.find("A")); 
    System.out.println("Not found case: find 'Z'" + chris.find("z")); 

    System.out.println("Delete method test: "); 
    System.out.println("Tree size before deleting: " + chris.size()); 
    System.out.println("Delete 'Z' (not in tree): " + chris.delete("z")); 
    System.out.println("Delete leftmost node: 'A' " + chris.delete("A")); 
    System.out.println("Delete node with one child: 'E' " + chris.delete("E")); 
    System.out.println("Delete node that is root or has 2 kids: 'O' " + chris.delete("O")); 
    System.out.println("Average case: Delete duplicates: 'R'" + chris.delete("R")); 
    System.out.println("Tree size after 4 deletions: " + chris.size()); 
    System.out.println("In-order still works after delete: ");
    chris.printInOrder(); 


    System.out.println("Replace method testing: "); 
    System.out.println("Tree before replace: "); 
    chris.printInOrder();
    System.out.println(); 
    System.out.println("Average case: Replace 'H' with 'G' ");
    System.out.println(chris.replace("H", "G")); 
    chris.printInOrder();
    System.out.println(); 
    System.out.println("Not found case: Replace 'Z' with 'B' "); 
    System.out.println(chris.replace("Z", "B")); 
    chris.printInOrder(); 
    System.out.println();
    System.out.println("First case: Replace root value "); 
    System.out.println(chris.replace("Q", "P")); 
    chris.printInOrder(); 
    System.out.println(); 
    System.out.println("Final tree size: "); 
    System.out.println(chris.size()); 
    System.out.println("isEmpty() last case: "); 
    BST arun = new BST(); 
    arun.add("A"); 
    System.out.println("Arun tree (1 node) isEmpty: " + arun.isEmpty()); 
    arun.delete("A"); 
    System.out.println("After deleting 1 node: " + arun.isEmpty()); 
    System.out.println("Size after deleting only node: " + arun.size()); 
 }
}