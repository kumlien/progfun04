object Sheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  println("Welcome to the Scala worksheet");$skip(51); 
  
  def sum(xs: List[Int]): Int =
    iter(xs, 0);System.out.println("""sum: (xs: List[Int])Int""");$skip(140); 
   
    
  def iter(list: List[Int], totalSoFar: Int) : Int =
     if(list.isEmpty) totalSoFar else iter(list.tail, totalSoFar + list.head);System.out.println("""iter: (list: List[Int], totalSoFar: Int)Int""");$skip(19); val res$0 = 
  sum(List(1,2,3));System.out.println("""res0: Int = """ + $show(res$0));$skip(60); 
  
  
  def max(xs: List[Int]): Int = {
    iter2(xs,0)
  };System.out.println("""max: (xs: List[Int])Int""");$skip(166); 
  
  def iter2(list2: List[Int], maxSoFar: Int) : Int =
  	if(list2.isEmpty) maxSoFar else iter2(list2.tail,
  		if(maxSoFar > list2.head)  maxSoFar else list2.head);System.out.println("""iter2: (list2: List[Int], maxSoFar: Int)Int""");$skip(26); val res$1 = 
  	
  
  max(List(1,2,3));System.out.println("""res1: Int = """ + $show(res$1))}
}
