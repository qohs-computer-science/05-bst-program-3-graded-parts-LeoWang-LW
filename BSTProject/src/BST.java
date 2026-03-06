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
        } // end if 

        if(newVal.compareTo(current.getValue()) <= 0)
        {
            current.setLeft(addHelper(current.getLeft(), newVal));
        } // end if 
        else{
            current.setRight(addHelper(current.getRight(), newVal));
        } // end else 
        return current; 
    } // end addHelper

    public boolean delete(Comparable old){
        if(find(old) == false){
            return false;
        } // end if
        
        root = deleteHelper(old, root); 
        size--; 
        return true;
    } // end delete

    private TreeNode deleteHelper(Comparable val, TreeNode subroot){
        if(subroot == null)
            return null;

        int compare = val.compareTo(subroot.getValue()); 

        if(compare <= 0){
            subroot.setLeft(deleteHelper(val, subroot.getLeft())); 
        } // end if 
        else if(compare > 0){
            subroot.setRight(deleteHelper(val, subroot.getRight()));

        } // end else if 
        else{
            if(subroot.getLeft() == null && subroot.getRight() == null){
                return null;
            } // end if 
            else if(subroot.getLeft() == null){
                return subroot.getRight();
            } // end else if 
            else if(subroot.getRight() == null){
                return subroot.getLeft(); 
            } // end else if 
            else{
                Comparable sucessorVal = findMin(subroot.getRight()); 
                subroot.setValue(sucessorVal); 
                subroot.setRight(deleteHelper(sucessorVal, subroot.getRight()));
            } // end else 
        }// end else 

        return subroot; 
    } // end deleteHelper 

    private Comparable findMin(TreeNode subroot){
        if(subroot.getLeft() == null){
            return subroot.getValue();
        } // end if 
        return findMin(subroot.getLeft());
    } // end findMin 

    public boolean replace(Comparable old, Comparable toAdd){
        if(find(old)){
            delete(old); 
            add(toAdd); 
            return true;
        } // end if
        else{
            add(toAdd);
            return false; 
        } // end else
    } // end replace 

    public boolean find(Comparable toFind){
        return findHelper(root, toFind);
    } // end find 

    private boolean findHelper(TreeNode current, Comparable val){
        if(current == null){
            return false; 
        } // end if 
        if(val.compareTo(current.getValue()) == 0){
            return true;
        } // end if 

        if(val.compareTo(current.getValue()) <=0){
            return findHelper(current.getLeft(), val);
        } // end if 
        else{
            return findHelper(current.getRight(), val); 
        } // end else 
    } // end findHelper


    public void printInOrder(){
        printInOrderHelper(root);
    } // end printInOrder

    private void printInOrderHelper(TreeNode current){
        // base case: empty subtree
        if(current == null){
            return;
        } // end if 
        // recursive traversal
        printInOrderHelper(current.getLeft()); 
        System.out.print(current.getValue() + " "); 
        printInOrderHelper(current.getRight()); 
    } //end printInOrderHelper

    public void printPreOrder(){
        printPreOrderHelper(root); 
    } // end printPreOrder

    private void printPreOrderHelper(TreeNode current){
        if(current == null){
            return; 
        } // end if statement 
        System.out.print(current.getValue() + " "); 
        printPreOrderHelper(current.getLeft()); 
        printPreOrderHelper(current.getRight()); 
    } // end printPreOrderHelper

    public void printPostOrder(){
        printPostOrderHelper(root); 
    } // end printPostOrder

    private void printPostOrderHelper(TreeNode current){
        if(current == null){
            return;
        } // end if statement 
        printPostOrderHelper(current.getLeft());
        printPostOrderHelper(current.getRight()); 
        System.out.print(current.getValue() + " ");
    } // end printPostOrderHelper



} // end class

