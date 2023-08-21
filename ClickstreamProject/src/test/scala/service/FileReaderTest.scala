package service

import org.apache.spark.sql.{DataFrame, SparkSession}
import org.scalatest.flatspec.AnyFlatSpec
import utils.sparksessiontest

class FileReaderTest extends AnyFlatSpec {

  "FileReader object" should "do the following"

  it should "read the files in the path" in {
    val spark = sparksessiontest.sparkSession()
    val clickstream_test_DF = FileReader.readDataFrame(spark,"C:/Target/ClickstreamProject/src/test/scala/test_data_in/Test_Sample_Clickstream.csv")
    val  itemset_test_DF = FileReader.readDataFrame(spark,"input.sample_path2")
    clickstream_test_DF.show()
    assert(clickstream_test_DF.count()>=1)
  assert(itemset_test_DF.count()>=1)
    val count=clickstream_test_DF.count()
 assertResult(12 )(count)
    clickstream_test_DF.show()
   // itemset_test_DF.show()
  }
}
