//package transform
//
//import org.apache.spark.sql.DataFrame
//import org.scalatest._
//import org.scalatest.flatspec.AnyFlatSpec
<<<<<<< HEAD
//
//class RemoveDuplicatesTest extends AnyFlatSpec {
//  val nullCheck= new NullCheckTest
//  var df1removeduplicates: DataFrame = _
//  var df2removeduplicates: DataFrame = _
//  "RemoveDuplicates object" should "do the following"
//
//  it should "remove duplicate values" in{
//    val result = RemoveDuplicates.removeDuplicates(nullCheck.df1removenull,nullCheck.df2removenull)
//    df1removeduplicates=result._1
//    df2removeduplicates=result._2
=======
//import utils.spark_readDF_config_test
//
//class RemoveDuplicatesTest extends AnyFlatSpec {
//
//  "RemoveDuplicates object" should "do the following"
//
//  it should "remove duplicate values" in{
//    val (clickstreamDF, itemsetDF) = spark_readDF_config_test.readTestDF()
//    val (df1removeduplicates, df2removeduplicates) = RemoveDuplicates.removeDuplicates(clickstreamDF, itemsetDF)
//
//    assertResult(9)(df1removeduplicates.select("id").count())
//    assertResult(8)(df2removeduplicates.select("item_id").count())
//
>>>>>>> 796eb4f5e970f585283abe532eadc181e472c094
//    df1removeduplicates.show()
//    df2removeduplicates.show()
//  }
//}
