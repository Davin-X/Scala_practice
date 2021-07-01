import scala.collection.mutable.ListBuffer
import scala.util.matching.Regex

val l1 = 1 to 10
val l2 = 10 to 20
val l3 = List.fill(5)(4)


1 to 5
1 until 5
0 to 10 by 2

Range(1, 5)
Range(1, 10, 2)

l1.sum
l1.sum / l1.size
l1.head
l1.tail
l1.last

l1
l1.tail(7)
l1.indexOf(7)

val list1 = List("Red", "Blue", "Blue", "Green", "Black")
list1.indexOf("Green")
List().isEmpty
l1.isEmpty


(l1, l2).zipped.map(_ + _)
l1.zip(l2).map(x => x._1 + x._2)
val x = l1.zip(l2)

l1.reverse

List.concat(l1, l2)
l1 ++ l2
//l1 ::: l2

List.tabulate(5)(x => x * x * x)
(0 until 5).map(x => x * x * x)

List.tabulate(0)(x => x * x * x)

//rotate a lit by 1
l1.tail :+ l1.head

val str = "lookIntoThePond0"
val first = str.exists(_.isUpper)
val first = str.exists(_.isLower)
val first = str.exists(_.isDigit)

val list11 = List("Red", "Blue", "Blue", "Green", "Black")
val first = list11.contains("Blue")

if (str.contains("look"))
  println("yes")

println("Create a Scala List:")

println("Lisp style:")
val lisp_list = 100 :: 200 :: 300 :: Nil :: 400 :: Nil
println(lisp_list)

val xx = Nil

println("Java style:")
val nums = List(1, 2, 3, 4, 5, 6, 7)
println(nums)

println("Mixed type values in a list:")
val x = List[Number](100, 200, 110.20, 45d, 0x10)
println(x)

println("Range List:")
val y = List.range(1, 20)
println(y)

val z = List.range(0, 30, 3)
println(z)

println("Uniform  List:")
val s = List.fill(5)("Scala")
println(s)

val n = List.fill(3)(4)
println(n)

println("Tabulate List:")
val t = List.tabulate(10)(n => n * n * n)
println(t)

//As a List is immutable we use ListBuffer
var colors = new ListBuffer[String]()
println("Add Single element in the said list:")
colors += "Red"
colors += "Green"
colors += "Black"

println(colors)

println("Add multiple elements in the said list:")
colors ++= List("Orange", "Pink", "Black")
println(colors)

println("Convert the ListBuffer to a List:")
val colors_list = colors.toList
println(colors_list)

//As a List is immutable we use ListBuffer and finally convert the ListBuffer to list.
println("Original ListBuffer:")
println(colors)

println("Remove one element:")
colors -= "Red"
println(colors)

println("Remove multiple elements:")
println(colors)
colors --= Seq("Black", "Pink")

println("After removing two elements, final ListBuffer:")
println(colors)

println("Convert the ListBuffer to a List:")
val colors_list = colors.toList
println(colors_list)

val nums = List(1, 3, 5, 7, 9, 11, 14, 12)
println("Original list:")
println(nums)
//As scala List is immutable, so we can’t delete elements from it, but
//filter out element(s) as per requirement.
println("Filter out 3 from the above list:")
val nums1 = nums.filter(_ != 3)
println(nums1)

println("Filter out numbers which are greater than 10:")
val nums2 = nums.filter(_ > 10)
println(nums2)

val list1 = List("Red", "Blue", "Blue", "Green", "Black")
val list2 = List("Blue", "White")

println("Difference of the said two lists(list1-list2):")
val temp = list2.toSet
val result = list1.filterNot(temp)
println(result)

println("Difference of the said two lists(list2-list1):")
val temp1 = list1.toSet
val result1 = list2.filterNot(temp1)
println(result1)

val nums1 = List(1, 3, 5, 7, 9)
val nums2 = List(2, 4, 6, 8, 10)

println("Merge the said two lists using the ++ method:")
val nums_1 = nums1 ++ nums2
println(nums_1)

println("Using ::: way:")
val nums_2 = nums1 ::: nums2
println(nums_2)

println("Using concat method:")
val nums_3 = List.concat(nums1, nums2)
println(nums_3)

nums_3.takeRight(2) //.head
nums_3.take(3)
nums_3.takeWhile(x => x != 6)

var x = nums_2 flatMap { element => List.fill(element)(element) }

//Check list contains a sublist
nums_1.forall(nums_2.contains)

list1.groupBy(el => el).map(e => (e._1, e._2.length)).foreach(println)

list1.groupBy(identity).map(e => (e._1, e._2.length)).foreach(println)


nums_1.take(2)
nums_2.drop(2)
nums_3.dropWhile(x => x != 6)
nums_2.dropRight(2)

// Assigning values
val name = "GeeksforGeeks"
val articles = 32
// Applying StringContext with
// s-method
val result = StringContext("I have written ", " articles on ", ".").s(articles, name)

//regex
// Applying r() method
val portal = "GeeksforGeeks".r
val CS = "GeeksforGeeks is a CS portal."
// Displays the first match
println(portal findFirstIn CS)

// Applying Regex class
val x = new Regex("Nidhi")
val myself = "My name is Nidhi Singh."
// replaces first match with the // String given below
println(x replaceFirstIn(myself, "Rahul"))

// Applying Regex class
val Geeks = new Regex("(G|g)fG")
val y = "GfG is a CS portal. I like gfG"
// Displays all the matches separated // by a separator
println((Geeks findAllIn y).mkString(", "))

//StringBuilder in Scala
val x = new StringBuilder("Author")
// Appending character
val y = x += 's'
// Appending String
val yy = x ++= " of GeeksforGeeks"

val yyy = x.append(800)
// Resetting the content
val yyyy: Unit = x.clear()

val q = new StringBuilder("Computer Science")
// Deleting characters
val r = q.delete(1, 3)

val q = new StringBuilder("GfG CS portal")
// inserting strings
val r = q.insert(4, "is a ")

val rr = r.toString

