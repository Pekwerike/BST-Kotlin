interface BSTInterface<T : Comparable<T>> {
    var rootNode: BinarySearchTree.TreeNode<T>?
    val nodesList: MutableList<BinarySearchTree.TreeNode<T>>
    fun searchFor(key: T): BinarySearchTree.TreeNode<T>?
    fun inOrderTraversal(): MutableList<BinarySearchTree.TreeNode<T>>
    fun insertNode(key: T)
    fun deleteNode(key : T)
    fun findSmallestNodeFrom(key: T) : BinarySearchTree.TreeNode<T>?

}