object P09 {
    def pack[A](list: List[A]): List[List[A]] = {
        if(list.isEmpty) List()
        else {
            val (headList, tailList) = list span (_==list.head)
            headList :: pack(tailList)
        }
    }
}
