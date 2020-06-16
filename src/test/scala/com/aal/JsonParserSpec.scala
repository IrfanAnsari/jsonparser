package com.aal

import org.scalatest.FreeSpec
import org.scalatest.matchers.should.Matchers


class JsonParserSpec extends FreeSpec with Matchers{
  "should parse the valid json" in {
    val jsonString =
      """{
        |"x":{
        |    "y":
        |        {
        |         "z":"a"
        |         }
        |     }
        | }
        |""".stripMargin

    val key = "x/y/z"
     JsonParser.parseJson(jsonString, key) shouldEqual "a"
  }

  "should thrown an IllegalArgumentException " in {
    the[IllegalArgumentException] thrownBy {
      val invalidJson =
        """{
          |"x":{
          |    "y":
          |        {
          |         "z":"a"
          |
          |     }
          | }
          |""".stripMargin

      val key = "x/y/z"
      JsonParser.parseJson(invalidJson, key)
    } should have message ("Unable to parse JSON")
  }

}




