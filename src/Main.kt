fun main(args: Array<String>) {
    val binarySearchTree: BinarySearchTree<Int> = BinarySearchTree()

    binarySearchTree.insertNode(13)
    binarySearchTree.insertNode(15)
    binarySearchTree.insertNode(8)
    binarySearchTree.insertNode(7)
    binarySearchTree.insertNode(1)
    binarySearchTree.insertNode(10)
    binarySearchTree.insertNode(120)
    binarySearchTree.insertNode(0)
    binarySearchTree.insertNode(-1)
    binarySearchTree.insertNode(9)
    binarySearchTree.insertNode(14)
    binarySearchTree.insertNode(3)
    binarySearchTree.insertNode(2)
    binarySearchTree.deleteNode(8)

    val nodes = binarySearchTree.inOrderTraversal()

    for(node in nodes){
     //   System.out.print("${node.key} ")
    }
    System.out.println("${binarySearchTree.searchFor(8)?.key ?: "Key doesn't exist in the BST"}")
}