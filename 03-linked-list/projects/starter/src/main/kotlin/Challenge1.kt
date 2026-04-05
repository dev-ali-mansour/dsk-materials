
fun <t : Any> LinkedList<t>.printInReverse() {
    this.nodeAt(0)?.printInReverse()
}

fun <t : Any> Node<t>.printInReverse() {
    next?.printInReverse()
    if (next != null) {
        print(" <- ")
    }
    print(value.toString())
}