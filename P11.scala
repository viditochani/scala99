object P11{
    def pack[A](list: List[A]): List[List[A]] = {
        if(list.isEmpty) List()
        else {
            val (headList, tailList) = list span (_==list.head)
            headList :: pack(tailList)
        }
    }
    def encodeModified[A](list: List[A]) = 
        encodeList(pack(list))

    def encodeList[A](list: List[List[A]]): List[Any]= 
        if(list.isEmpty) List()
        else{
            val headList = list.head
            if(headList.length == 1) headList.head :: encodeList(list.tail)
            else (headList.length, headList.head) :: encodeList(list.tail)
        }
}
