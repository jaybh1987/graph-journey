package domain.library.basicAlogs.undirected_graph.image

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer


/*
We have five vertices A B C D E
As it is undirected graph all vertices can travel bidirectional.
So, edges would be { {A,B}, {A, C}, {A, D}, {B, D}, {E,D}, {E,C} }
 */

case class Node(nodeName: String, adjacencyList: List[String])
case class Graph(graphType: String = "Undirected") {

  var nodeList: ArrayBuffer[Node] = ArrayBuffer.empty
  def addNode(n: Node): Unit = {
    nodeList.addOne(n)
  }

  def listNodes: Unit = for{
    i <- nodeList.indices
  } yield {
    if(nodeList.isEmpty)
      println(nodeList(i))
    else
      println("Graph is empty.")
  }

  def getNode(nodeName: String): (Node, Int) = nodeList.zipWithIndex.find (_._1.nodeName == nodeName) match {
      case Some(n) => n
      case None => throw new Exception("Node does not exist.")
    }
  def removeNode(nodeName: String): Unit = {
    val (node, index) = getNode(nodeName)
    nodeList.remove(index)
    println(s"Node ${node.nodeName} is removed with adjacents ${node.adjacencyList}")
  }
}

val g = Graph()
g.addNode(Node("a", List("b","c","d")))
g.addNode(Node("b", List("c", "d")))
//object Graph {
//
//}
