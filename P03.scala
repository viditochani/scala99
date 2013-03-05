object P03 {
    def nth[A](n:Int, list: List[A]):A =
       if(list.isEmpty) throw new NoSuchElementException()
       else if(n==0) list.head
       else nth(n-1, list.tail)
}
