object P13 {
    def encodeDirect[A](list: List[A]): List[(Int, A)] = 
        if(list.isEmpty) List()
        else {
            val (headList, tailList) = list span (_ == list.head)
            (headList.length, headList.head) :: encodeDirect(tailList)
        }
}
