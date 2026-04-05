data class Node<T : Any>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String = next?.let { "$value -> $it" } ?: "$value"
}
