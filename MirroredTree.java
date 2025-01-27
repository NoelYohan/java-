class sample{
    static class TreeNode{
        int data;
        TreeNode left,right;
        TreeNode(int value)
        {
            data=value;
            left=right=null;
        }
    }
   public  static class binarytree {
       TreeNode root;
       void inorderTraversal(TreeNode node)
       {
           if(node==null)
               return;
           inorderTraversal(node.left);
           System.out.println(node.data+" ");
           inorderTraversal(node.right);
       }

       TreeNode mirror(TreeNode node) {
           if (node == null)
               return null;
           TreeNode left = mirror(node.left);
           TreeNode right = mirror(node.right);

           node.left = right;
           node.right = left;

           return node;
       }

       public static void main(String[] args) {
           binarytree tree = new binarytree();
           tree.root = new TreeNode(1);
           tree.root.left = new TreeNode(2);
           tree.root.right = new TreeNode(3);
           tree.root.left.left = new TreeNode(4);
           tree.root.left.right = new TreeNode(5);
           tree.root.right.left = new TreeNode(6);
           tree.root.right.right = new TreeNode(7);
           tree.root = tree.mirror(tree.root);
           System.out.println("Inorder traversal of mirrored tree");
           tree.inorderTraversal(tree.root);
           System.out.println();

       }
   }
}
