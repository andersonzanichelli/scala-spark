import org.apache.spark.{SparkConf, SparkContext}

object WordCount {

  def main(args: Array[String]): Unit = {

    new SparkContext(new SparkConf().setAppName("Word Count"))
      .textFile(args(0))
      .flatMap(line => line.split("\\W+"))
      .map(word => (word, 1))
      .reduceByKey((acc, value) => acc + value)
      .sortBy(pair => pair._2, false)
      .saveAsTextFile(args(1))
  }
}
