class BinarySearchTree<T : Comparable<T>> {

    private var rootNode: TreeNode<T>? = null
    private val nodesList: MutableList<TreeNode<T>> = mutableListOf()

    class TreeNode<T : Comparable<T>>(data: T) : Comparable<TreeNode<T>> {
        var key: T = data
        var rightNode: TreeNode<T>? = null
        var leftNode: TreeNode<T>? = null
        var parentNode: TreeNode<T>? = null

        override fun compareTo(other: TreeNode<T>): Int {
            if (key == other.key) {
                return 0
            } else if (key > other.key) {
                return 1
            }
            return -1
        }
    }

    fun searchFor(key: T): String {
        return searchFor(key, rootNode!!)
    }

    private fun searchFor(key: T, node: TreeNode<T>): String {
        if (key > node.key) {
            // search to the right of the node
            if (node.rightNode != null) return searchFor(key, node.rightNode!!)
            else return "Key not found"
        } else if (key < node.key) {
            // search to the left of the node
            if (node.leftNode != null) return searchFor(key, node.leftNode!!)
            else return "Key not found"
        } else return "Key found"

    }

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
        if (key > root.key) {
            // go to the right of the node
            if (root.rightNode == null) {
                root.rightNode = TreeNode(key)
                root.rightNode?.parentNode = root
                return
            } else {
                insertNode(key, root.rightNode!!)
            }
        } else if (key < root.key) {
            // go to the left of the node
            if (root.leftNode == null) {
                root.leftNode = TreeNode(key)
                root.leftNode?.parentNode = root
                return
            } else {
                insertNode(key, root.leftNode!!)
            }
        } else {
            // both keys are equal
        }
    }

}