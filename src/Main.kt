fun main(args: Array<String>) {
    val binarySearchTree: BinarySearchTree<String> = BinarySearchTree()

    binarySearchTree.insertNode("Prosper")
    binarySearchTree.insertNode("Ekwerike")
    binarySearchTree.insertNode("Rike")
    binarySearchTree.insertNode("Amaka")
    binarySearchTree.insertNode("Chibuzor")
    binarySearchTree.insertNode("Ty Othowora")
    binarySearchTree.insertNode("Young taba")
    binarySearchTree.insertNode("Lee")
    binarySearchTree.insertNode("Cristiano")
    binarySearchTree.insertNode("Ronaldo")

    val nodes = binarySearchTree.inOrderTraversal()

    for(node in nodes){
       System.out.print("${node.key} ")
    }
}