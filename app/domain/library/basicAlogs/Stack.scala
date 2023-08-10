package domain.library.basicAlogs

import scala.collection.mutable._

class Stack(size: Int){
  var arr = ArrayBuffer.empty[Int]
  var trackSize: Int = 0

  def truncate(): Unit = {
    arr = ArrayBuffer.empty[Int]
    trackSize = 0
  }

  def push(e: Int): Unit = {
    if (size == trackSize) {
      println("Stack max size is reached.")
    } else {
      trackSize = trackSize + 1
      arr.addOne(e)
      println(s"$e is added in the stack and now stack size is $trackSize")
    }
  }

    def pop(): Unit = {
      if (arr.isEmpty) {
        println("Stack is empty")
      } else {
        arr = arr.dropRight(1)
        trackSize = trackSize - 1
        println(s"Now stack size is $trackSize")
      }
    }

    def printStack(): Unit = {
      val l = arr.length - 1
      def fun(index: Int): Unit = index match {
        case pos if pos >= 0 =>
          println(arr(pos))
          fun(index - 1)
        case pos if pos < 0 => println("Empty Stack")
      }
      fun(l)

    }

  }