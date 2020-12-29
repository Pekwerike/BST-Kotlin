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