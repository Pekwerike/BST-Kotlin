interface BSTInterface<T : Comparable<T>> {
    var rootNode: TreeNode<T>?
    val nodesList: MutableList<TreeNode<T>>
    fun searchFor(key: T): TreeNode<T>?
    fun inOrderTraversal(): MutableList<TreeNode<T>>
    fun insertNode(key: T)
    fun deleteNode(key: T)
    fun findSmallestNodeFrom(key: T): TreeNode<T>?

}