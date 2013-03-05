object P14 {
    def duplicate[A](list: List[A]): List[A] =
        if(list.isEmpty) List()
        else list.head :: list.head :: duplicate(list.tail)
}
