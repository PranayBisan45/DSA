
public class BinarySearchTree {
	private Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			left=null;
			right=null;
		}
	}
	BinarySearchTree(){
		this.root=null;
	}
	public void InsertValue(int value) {
		root=Insertvalrec(root,value);
	}
	private Node Insertvalrec(Node root, int value) {
		/*if the tree is empty, then return a new node*/
		if(root==null) {
			root=new Node(value);
			return root;
		}//add it in the left subtree
		if(value<root.data) {
			root.left=Insertvalrec(root.left,value);
		}//add it in the right subtree
		else {
			root.right=Insertvalrec(root.right,value);
		}
		return root;
	}
	//in-order traversal
	public void inorder() {
		inorderTraversal(root);
	}
	public void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.print(root.data+"->");
			inorderTraversal(root.right);
		}
	}
	public void preorder() {
		preorderTraversal(root);
	}
	public void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.print(root.data+"->");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	public void postorder() {
		postorderTraversal(root);
	}
	public void postorderTraversal(Node root) {
		if(root!=null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data+"->");
		}
	}
}
