
public class TestBST {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.InsertValue(60);
		bst.InsertValue(35);
		bst.InsertValue(75);
		bst.InsertValue(40);
		bst.InsertValue(20);
		bst.InsertValue(70);
		bst.InsertValue(85);
		bst.inorder();
	}

}
