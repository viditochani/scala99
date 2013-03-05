object P12 {
    def decode[A](list: List[(Int, A)]): List[A] = 
        if(list.isEmpty) List()
        else {
            val headList= list.head
            if( headList._1 > 0) headList._2 :: decode((headList._1-1, headList._2) :: list.tail)
            else decode(list.tail)
        }
}
