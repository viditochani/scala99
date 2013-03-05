object P15{
    def duplicateN[A](n: Int, list: List[A]): List[A] =
        list flatMap ( List.make(n,_))
}
