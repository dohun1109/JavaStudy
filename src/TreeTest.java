class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    void preOrder(TreeNode root) {  //전위 순회 (루트 - 좌 - 우 )
        if (root==null)return;

        // 루트 노드를 방문
        System.out.print(root.val + " ");

        //왼쪽 서브트리를 전위 순회
        preOrder(root.left);

        //오른쪽 서브트리를 전위 순회
        preOrder(root.right);
    }

    void inOrder(TreeNode root) { //중위 순위 (좌 - 루트 - 우)
        if (root ==null) return;

        //왼쪽 서브트리를 중위 순회
        inOrder(root.left);

        //루트 노드를 방문
        System.out.print(root.val+ " ");

        //오른쪽 서브트리를 중위 순회
        inOrder(root.right);
    }

    void postOrder(TreeNode root) {     //후위 순위 (좌 - 우 - 루트)
        if (root == null) return;

        //왼쪽 서브트리를 후위 순회
        postOrder(root.left);


        //오른쪽 서브트리를 후위 순회
        postOrder(root.right);

        //루트 노드를 방문
        System.out.print(root.val + " ");
    }

}

public class TreeTest {
    public static void main(String[] args) {

        // 이진 트리 생성
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        //전위 순회 출력 (root -> left -> right) 
        System.out.print("전위 :");
        root.preOrder(root);
        System.out.println();

        // 중위 순회 출력 ( left -> root -> right)
        System.out.print("중위 :");
        root.inOrder(root);
        System.out.println();

        //후위 순회 출력  ( left -> right -> root)
        System.out.print("후위 :");
        root.postOrder(root);
        System.out.println();

    }


}
