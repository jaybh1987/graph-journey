package domain.library.basicAlogs.queue

import scala.collection.mutable.ArrayBuffer

class Queue(size: Int) {
  var que = ArrayBuffer.empty[Int]
  var back:Int = -1
  var front:Int = 0

  def enqueue(elm: Int): Unit = {
    if(back == size-1){
      println(s"Queue is Full")
    } else {
      back += 1
      que.addOne(elm)
      println(s"$elm added to the queue")
    }
  }

  def dequeue(): Unit = {
    if(que.isEmpty){
      println(s"Queue is Empty")
    } else {
      front += 1
      que = que.drop(1)
      println(s"Element removed from the Queue")
    }
  }

  def print():Unit = {
    println(s"Elements in the Queue are $que")
  }
}
