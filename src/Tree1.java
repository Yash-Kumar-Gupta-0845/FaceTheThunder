public class Tree1{
     static treenode root;
     static class treenode{
         treenode left;
         treenode right;
        int data;
        public treenode(int data){
            this.data=data;
        }
    }
    public static void createbinarytree(){
        treenode first=new treenode(1);
        treenode second=new treenode(2);
        treenode third=new treenode(3);
        treenode fourth=new treenode(4);
        treenode fifth=new treenode(5);
        treenode sixth=new treenode(6);
        treenode seventh=new treenode(7);
        treenode eighth=new treenode(8);
        treenode ninth =new treenode (9);

        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;
        fourth.left=eighth;
        fourth.right=ninth;
    }
    // preOrder printing
    public static void preOrder(treenode root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
         createbinarytree();
         preOrder(root);
    }
}


