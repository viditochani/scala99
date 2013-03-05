object P07 {
    def flatten[A](list: List[A]): List[A] =
        if(list.isEmpty) List()
        else list.head match {
            case x:List[A] => flatten(x):::flatten(list.tail)
            case x:A => x :: flatten(list.tail)
        }
}
