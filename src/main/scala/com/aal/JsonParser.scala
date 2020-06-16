package com.aal

import org.json4s.jackson.JsonMethods._
import org.json4s.{JValue, _}

object JsonParser {

  def parseJson(jsonString: String, key: String): String = {

    parseOpt(jsonString) match {
      case Some(json) => {
        val path = key.split("/")
        val value = path.foldLeft[JValue](json)((acc, next) => render(acc \ next))
        value match {
          case JString(s) => s
          case JNothing =>   throw new IllegalArgumentException("No value returned")
          case _ =>  throw new IllegalArgumentException("This data structure is not supported")
        }
      }
      case None => throw new IllegalArgumentException("Unable to parse JSON")
    }
  }
}