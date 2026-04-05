fun <T : Any> LinkedList<T>.printInReverse() {
    this.nodeAt(0)?.printInReverse()
}

fun <T : Any> Node<T>.printInReverse() {
    next?.printInReverse()
    if (next != null) {
        print(" <- ")
    }
    print(value.toString())
}