
/**
 *
 * JOHN ROMAINE CAGUBCUB
 */
// class assigning left and right child
class Node {
    int key;
    Node left, right;

public Node(int item){
key = item;
left = right = null;
}
}
//The Tree code
class FEA2tree {
    Node root;
    FEA2tree() {root = null;}

//inorder tree code
void Inorder (Node node){
if (node == null)
    return;

Inorder(node.left);
System.out.print(node.key + " -> ");
Inorder(node.right);
}
//preorder tree code
void Preorder (Node node){
    if (node == null)
        return;
    System.out.print(node.key + " -> ");
    Preorder(node.left);
    Preorder(node.right);
}
//postorder tree code
void Postorder(Node node){
    if (node == null)
        return;
    Postorder(node.left);
    Postorder(node.right);
    System.out.print(node.key + " -> ");
}
    /**these are wrappers for the recursive function, the data 
    isn't recognized as nodes without these*/
    void Postorder() { Postorder(root); }
    void Inorder() { Inorder(root); }
    void Preorder() { Preorder(root); }
    //driver
    public static void main(String[] args) {
        FEA2tree tree = new FEA2tree();
        tree.root = new Node(0050);
        tree.root.left = new Node(0040);
        tree.root.right = new Node(0060);
        tree.root.left.left = new Node(0037);
        tree.root.left.right = new Node(0045);
        tree.root.right.left = new Node(0055);
        tree.root.right.right = new Node(0070);
        tree.root.left.left.left = new Node(0025);
        tree.root.right.left.left = new Node(0054);
        tree.root.left.left.left.right = new Node(0027);
        //prints preorder
        System.out.println("Preorder traversal");
        tree.Preorder();
        System.out.println();
        System.out.println();
        //prints inorder
        System.out.println("Inorder traversal");
        tree.Inorder();
        System.out.println();
        System.out.println();
        //prints postorder
        System.out.println("Postorder traversal");
        tree.Postorder();
       
    } 
}