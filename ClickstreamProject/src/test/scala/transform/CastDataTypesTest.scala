//package transform
//
//import org.apache.spark.sql.DataFrame
//import org.scalatest._
//import org.scalatest.flatspec.AnyFlatSpec
<<<<<<< HEAD
//import service.FileReaderTest
//
//class CastDataTypesTest extends AnyFlatSpec {
//  val fileReader= new FileReaderTest
//  var df1cast: DataFrame = _
//  var df2cast: DataFrame = _
//  "CastDataTypes object" should "do the following"
//
//  it should "cast datatypes of columns to desired datatypes" in{
//    val result = CastDataTypes.castDataTypes(fileReader.clickstream_test_DF,fileReader.itemset_test_DF)
//    df1cast=result._1
//    df2cast=result._2
//    df1cast.show()
//    df2cast.show()
//  }
//}
//println(df.schema("name").dataType)
=======
//import utils.spark_readDF_config_test
//import org.apache.spark.sql.types.{StringType,TimestampType, DoubleType}
//
//class CastDataTypesTest extends AnyFlatSpec {
//
//  "CastDataTypes object" should "do the following"
//
//  it should "cast datatypes of columns to desired datatypes" in{
//    val (clickstreamDF,itemsetDF)=spark_readDF_config_test.readTestDF()
//    val (df1cast,df2cast) = CastDataTypes.castDataTypes(clickstreamDF,itemsetDF)
//
//    val str=df1cast.schema("event_timestamp").dataType
//    val double=df2cast.schema("item_price").dataType
//    // Assert datatype for timestamp column using assertResult
//    assertResult(str)(StringType)
//
//    // Assert datatype for double column using assertResult
//    assertResult(double)(DoubleType)
//
////    df1cast.show()
////    df2cast.show()
//  }
//}
>>>>>>> 796eb4f5e970f585283abe532eadc181e472c094
