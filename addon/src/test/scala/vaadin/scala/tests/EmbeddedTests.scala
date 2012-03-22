package vaadin.scala.tests

import vaadin.scala._
import org.scalatest.FunSuite

class EmbeddedTests extends FunSuite {

  implicit val testWr = new WrapperRegistry

  test("Types") {
    assert(Embedded.Type.objectType.id === com.vaadin.ui.Embedded.TYPE_OBJECT)
    assert(Embedded.Type.image.id === com.vaadin.ui.Embedded.TYPE_IMAGE)
    assert(Embedded.Type.browser.id === com.vaadin.ui.Embedded.TYPE_BROWSER)
  }

  test("objectType") {
    val embedded = new Embedded
    embedded.objectType = Embedded.Type.image
    assert(embedded.objectType === Embedded.Type.image)
  }

  ignore("source, Resource") {
    val embedded = new Embedded

    val res = new ThemeResource("img.png")
    embedded.source = res
    // Why this equals fails?
    assert(embedded.source === res)
  }

  test("source, None") {
    val embedded = new Embedded
    embedded.source = None
    assert(embedded.source === None)
  }

  test("codebase, String") {
    val embedded = new Embedded
    embedded.codebase = "codebase"
    assert(embedded.codebase.get === "codebase")
  }

  test("codebase, Option") {
    val embedded = new Embedded
    embedded.codebase = Option("codebase")
    assert(embedded.codebase.get === "codebase")
  }

  test("codebase, None") {
    val embedded = new Embedded
    embedded.codebase = None
    assert(embedded.codebase === None)
  }

  test("codetype, String") {
    val embedded = new Embedded
    embedded.codetype = "codetype"
    assert(embedded.codetype.get === "codetype")
  }

  test("codetype, Option") {
    val embedded = new Embedded
    embedded.codetype = Option("codetype")
    assert(embedded.codetype.get === "codetype")
  }

  test("codetype, None") {
    val embedded = new Embedded
    embedded.codetype = None
    assert(embedded.codetype === None)
  }

  test("standby, String") {
    val embedded = new Embedded
    embedded.standby = "standby"
    assert(embedded.standby.get === "standby")
  }

  test("standby, Option") {
    val embedded = new Embedded
    embedded.standby = Option("standby")
    assert(embedded.standby.get === "standby")
  }

  test("standby, None") {
    val embedded = new Embedded
    embedded.standby = None
    assert(embedded.standby === None)
  }

  test("classId, String") {
    val embedded = new Embedded
    embedded.classId = "classId"
    assert(embedded.classId.get === "classId")
  }

  test("classId, Option") {
    val embedded = new Embedded
    embedded.classId = Option("classId")
    assert(embedded.classId.get === "classId")
  }

  test("classId, None") {
    val embedded = new Embedded
    embedded.classId = None
    assert(embedded.classId === None)
  }

  test("archive, String") {
    val embedded = new Embedded
    embedded.archive = "archive"
    assert(embedded.archive.get === "archive")
  }

  test("archive, Option") {
    val embedded = new Embedded
    embedded.archive = Option("archive")
    assert(embedded.archive.get === "archive")
  }

  test("archive, None") {
    val embedded = new Embedded
    embedded.archive = None
    assert(embedded.archive === None)
  }
}