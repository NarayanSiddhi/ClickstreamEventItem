<<<<<<< HEAD
//package transform
//
//import org.apache.spark.sql.DataFrame
//import org.scalatest._
//import org.scalatest.flatspec.AnyFlatSpec
//import service.FileWriter
//
//class FileWriterTest extends AnyFlatSpec {
//  val convertToLowercase= new ConvertToLowercaseTest
//  var final_test_DF: DataFrame = _
//  "FileWriter object" should "do the following"
//
//  it should "join the two datasets" in{
//    final_test_DF = FileWriter.fileWriter(convertToLowercase.df1lowercase,convertToLowercase.df2lowercase)
//    final_test_DF.show()
//  }
//}
=======
package transform

import com.typesafe.config.ConfigFactory
import org.apache.spark.sql.DataFrame
import org.scalatest._
import org.scalatest.flatspec.AnyFlatSpec
import service.FileWriter
import utils.spark_readDF_config_test

class FileWriterTest extends AnyFlatSpec {

  "FileWriter object" should "do the following"

  it should "join the two datasets" in{
    val (clickstreamDF, itemsetDF) = spark_readDF_config_test.readTestDF()

    // Write processed data to output path
    val outputPath = ConfigFactory.load("test_application.conf").getString("output.sample_path")

    val final_test_DF = FileWriter.fileWriter(clickstreamDF,itemsetDF,outputPath)

    val finalDF_expected=Array("item_id","id","event_timestamp","device_type","session_id","visitor_id","redirection_source","item_price","product_type","department_name")

    assertResult(finalDF_expected)(final_test_DF.columns)
  }
}
>>>>>>> 796eb4f5e970f585283abe532eadc181e472c094
