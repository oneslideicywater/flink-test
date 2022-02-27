import org.apache.flink.streaming.api.scala.StreamExecutionEnvironment

object HelloScala {
  def main(args: Array[String]): Unit = {
    var env=StreamExecutionEnvironment.getExecutionEnvironment
    import org.apache.flink.streaming.api.scala._
    val stream = env.fromCollection(Array(1,2,3,4,5))
    stream.print().setParallelism(1);
    env.execute("HelloScala")
  }
}