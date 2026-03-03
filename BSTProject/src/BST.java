// Leo Wang 
// Pd. 6 
// 3/2/26 

import java.lang.Comparable;

public class BST implements BSTInterface
{
    private TreeNode root; 
    private int size; 

    public BST()
    {
        root = null; 
        size = 0; 
    } // end BST

    public int size(){
        return size; 
    } // end size 

    public boolean isEmpty(){
        return size == 0;
    } // end isEmpty

    public void add(Comparable newVal){
        root = addHelper(root, newVal); 
        size++; 
    } // end add

    private TreeNode addHelper(TreeNode current, Comparable newVal)
    {
        if(current == null){
            return new TreeNode(newVal);
        }

        if(newVal.compareTo(current.getData()) <= 0)
        {
            current.setLeft(addHelper(current.getLeft(), newVal));
        }
        else{
            current.setRight(addHelper(current.getRight(), newVal));
        }
        return current; 
    } // end addHelper

    public void printInOrder(){
        printInOrderHelper(root);
    } // end printInOrder

    private void printInOrderHelper(TreeNode current){
        if(current != null){
            printInOrderHelper(current.getLeft()); 
            System.out.print(current.getData() + " "); 
            printInOrderHelper(current.getRight()); 
        } // end if statement 
    } //end printInOrderHelper

    public void printPreOrder(){
        printPreOrderHelper(root); 
    } // end printPreOrder

    private void printPreOrderHelper(TreeNode current){
        if(current != null){
            System.out.print(current.getData() + " "); 
            printPreOrderHelper(current.getLeft()); 
            printPreOrderHelper(current.getRight()); 
        } // end if statement 
    } // end printPreOrderHelper

    public void printPostOrder(){
        printPostOrderHelper(root); 
    } // end printPostOrder

    private void printPostOrderHelper(TreeNode current){
        if(current != null){
            printPostOrderHelper(current.getLeft());
            printPostOrderHelper(current.getRight()); 
            System.out.print(current.getData() + " "); 
        } // end if statement 
    } // end printPostOrderHelper

} // end class

