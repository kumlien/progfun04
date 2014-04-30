object Sheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def sum(xs: List[Int]): Int =
    iter(xs, 0)                                   //> sum: (xs: List[Int])Int
   
    
  def iter(list: List[Int], totalSoFar: Int) : Int =
     if(list.isEmpty) totalSoFar else iter(list.tail, totalSoFar + list.head)
                                                  //> iter: (list: List[Int], totalSoFar: Int)Int
  sum(List(1,2,3))                                //> res0: Int = 6
  
  
  def max(xs: List[Int]): Int = {
    iter2(xs,0)
  }                                               //> max: (xs: List[Int])Int
  
  def iter2(list2: List[Int], maxSoFar: Int) : Int =
  	if(list2.isEmpty) maxSoFar else iter2(list2.tail,
  		if(maxSoFar > list2.head)  maxSoFar else list2.head)
                                                  //> iter2: (list2: List[Int], maxSoFar: Int)Int
  	
  
  max(List(1,2,3))                                //> res1: Int = 3
}