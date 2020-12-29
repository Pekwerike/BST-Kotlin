interface BSTInterface<T : Comparable<T>> {
    var rootNode: BinarySearchTree.TreeNode<T>?
    val nodesList: MutableList<BinarySearchTree.TreeNode<T>>
    fun searchFor(key: T): BinarySearchTree.TreeNode<T>?
    fun searchFor(key: T, node: BinarySearchTree.TreeNode<T>): BinarySearchTree.TreeNode<T>?
    fun inOrderTraversal(): MutableList<BinarySearchTree.TreeNode<T>>
    fun inOrderTraverse(node: BinarySearchTree.TreeNode<T>)
    fun insertNode(key: T)
    fun insertNode(key: T, root: BinarySearchTree.TreeNode<T>)
    fun deleteNode(key : T)

}