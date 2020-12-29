class BinarySearchTree<T : Comparable<T>> {

    private var rootNode: TreeNode<T>? = null
    private val nodesList: MutableList<TreeNode<T>> = mutableListOf()

    class TreeNode<T : Comparable<T>>(data: T) : Comparable<TreeNode<T>> {
        var key: T = data
        var rightNode: TreeNode<T>? = null
        var leftNode: TreeNode<T>? = null

        override fun compareTo(other: TreeNode<T>): Int {
            if (key == other.key) {
                return 0
            } else if (key > other.key) {
                return 1
            }
            return -1
        }
    }

    fun searchFor(key: T){

    }

    private fun searchFor(key : T, node : TreeNode<T>)

    fun inOrderTraversal(): MutableList<TreeNode<T>> {
        inOrderTraverse(rootNode!!)
        return nodesList
    }

    private fun inOrderTraverse(node: TreeNode<T>) {
        // left -> root -> right
        if (node.leftNode != null) {
            inOrderTraverse(node.leftNode!!)
        }
        nodesList.add(node)
        if (node.rightNode != null) {
            inOrderTraverse(node.rightNode!!)
        }
    }

    fun insertNode(key: T) {
        if (rootNode == null) {
            rootNode = TreeNode(key)
        } else {
            insertNode(key, rootNode!!)
        }
    }

    private fun insertNode(key: T, root: TreeNode<T>) {
        if (key.compareTo(root.key) > 0) {
            // go to the right of the node
            if (root.rightNode == null) {
                root.rightNode = TreeNode(key)
                return
            } else {
                insertNode(key, root.rightNode!!)
            }
        } else if (key.compareTo(root.key) < 0) {
            // go to the left of the node
            if (root.leftNode == null) {
                root.leftNode = TreeNode(key)
                return
            } else {
                insertNode(key, root.leftNode!!)
            }
        } else {
            // both keys are equal
        }
    }

}