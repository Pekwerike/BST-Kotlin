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

    val nodes = binarySearchTree.inOrderTraversal()

    for(node in nodes){
     //   System.out.print("${node.key} ")
    }
    System.out.println("parent : ${binarySearchTree.searchFor(0)?.parentNode?.key ?: "No parent"}")
    System.out.println("key : ${binarySearchTree.searchFor(0)?.key}")
    System.out.println("right child : ${binarySearchTree.searchFor(0)?.rightNode?.key ?: "No right child"}")
    System.out.println("left child : ${binarySearchTree.searchFor(0)?.leftNode?.key ?: "No left child"} ")
}