//package transform
//
//import org.apache.spark.sql.DataFrame
//import org.scalatest._
//import org.scalatest.flatspec.AnyFlatSpec
<<<<<<< HEAD
//
//class NullCheckTest extends AnyFlatSpec {
//  val castDataTypes= new CastDataTypesTest
//  var df1removenull: DataFrame = _
//  var df2removenull: DataFrame = _
//  "NullCheck object" should "do the following"
//
//  it should "remove null values" in{
//    val result = NullCheck.nullCheck(castDataTypes.df1cast,castDataTypes.df2cast)
//    df1removenull=result._1
//    df2removenull=result._2
=======
//import utils.spark_readDF_config_test
//
//class NullCheckTest extends AnyFlatSpec {
//
//  "NullCheck object" should "do the following"
//
//  it should "remove null values" in{
//    val (clickstreamDF, itemsetDF) = spark_readDF_config_test.readTestDF()
//    val (df1removenull, df2removenull) = NullCheck.nullCheck(clickstreamDF, itemsetDF)
//
//    assertResult(9)(df1removenull.select("id").count())
//    assertResult(10)(df2removenull.select("item_id").count())
//
>>>>>>> 796eb4f5e970f585283abe532eadc181e472c094
//    df1removenull.show()
//    df2removenull.show()
//  }
//}
