import org.apache.spark.{SparkContext, SparkConf}

/**
 * Created by alexminnaar on 16-04-26.
 */
object HelloWorld extends App{
  val conf= new SparkConf()
  .setAppName("hello")
  .setMaster("local[2]")


  val sc=new SparkContext(conf)

  val r=sc.parallelize(Array(1,2,3,4))

  r.foreach(println)

  sc.stop()
}
