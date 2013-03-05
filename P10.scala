object P10{
    def pack[A](list: List[A]): List[List[A]] = {
        if(list.isEmpty) List()
        else {
            val (headList, tailList) = list span (_==list.head)
            headList :: pack(tailList)
        }
    }
    def encode[A](list: List[A]) = 
        encodeList(pack(list))

    def encodeList[A](list: List[List[A]]): List[Any]= 
        if(list.isEmpty) List()
        else{
            val headList = list.head
            (headList.length, headList.head) :: encodeList(list.tail)
        }
}

