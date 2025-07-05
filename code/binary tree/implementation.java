public class implementation {

    private treenode root;

    private static class treenode{
        private treenode left;
        private int data;
        private treenode right;

        public treenode(int val){
            this.data = val;
        }
    }

    public implementation(){
        this.root = null;
    }

    public void createBinaryTree() {
      treenode first = new treenode(1);
      treenode second = new treenode(2);
      treenode third = new treenode(3);
      treenode fourth = new treenode(4);
      treenode fifth = new treenode(5);
      treenode sixth = new treenode(6);
      treenode seventh = new treenode(7);

      root = first;
      first.left = second;
      first.right = third;
      second.left = fourth;
      second.right = fifth;
      third.left = sixth;
      third.right = seventh;
   }
    public static void main(String[] args) {
        implementation binarytree = new implementation();
        binarytree.createBinaryTree();
    }
}
