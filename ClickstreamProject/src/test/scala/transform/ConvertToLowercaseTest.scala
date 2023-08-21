//package transform
//
//import org.apache.spark.sql.DataFrame
//import org.scalatest._
//import org.scalatest.flatspec.AnyFlatSpec
<<<<<<< HEAD
//
//class ConvertToLowercaseTest extends AnyFlatSpec {
//  val renameColumn= new RenameColumnTest
//  var df1lowercase: DataFrame = _
//  var df2lowercase: DataFrame = _
//  "ConvertToLowercase object" should "do the following"
//
//  it should "convert the specified column records to lowercase" in{
//    val result = ConvertToLowercase.convertToLowercase(renameColumn.df1rename,renameColumn.df2rename)
//    df1lowercase=result._1
//    df2lowercase=result._2
=======
//import utils.spark_readDF_config_test
//import org.apache.spark.sql.functions.{col, lower, upper}
//
//class ConvertToLowercaseTest extends AnyFlatSpec {
//
//  "ConvertToLowercase object" should "do the following"
//
//  it should "convert the specified column records to lowercase" in{
//    val (clickstreamDF, itemsetDF) = spark_readDF_config_test.readTestDF()
//    val (df1lowercase, df2lowercase) = ConvertToLowercase.convertToLowercase(clickstreamDF, itemsetDF)
//
//    assertResult(10)(df1lowercase.select("redirection_source").count())
//    assertResult(10)(df2lowercase.select("department_name").count())
//
>>>>>>> 796eb4f5e970f585283abe532eadc181e472c094
//    df1lowercase.show()
//    df2lowercase.show()
//  }
//}
