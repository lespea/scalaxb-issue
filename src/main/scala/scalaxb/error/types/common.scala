// Generated by <a href="http://scalaxb.org/">scalaxb</a>.
package scalaxb.error.types

/**
 * This is the XML schema for the Common Vulerability Reporting Framework's common data types.
 */

/**
 * String type with an optional language attribute.  The default language is English.
 */
trait LocalizedStringable {
  val value: String
  val xmllang: String
}

/**
 * String type with an optional language attribute.  The default language is English.
 */
case class LocalizedString(value: String,
    attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends LocalizedStringable {
  lazy val xmllang = attributes("@{http://www.w3.org/XML/1998/namespace}lang").as[String]
}

/**
 * Normalized string type with an optional language attribute.  The default language is English.  This string cannot be empty.
 */
trait LocalizedNormalizedStringable {
  val value: String
  val xmllang: String
}

/**
 * Normalized string type with an optional language attribute.  The default language is English.  This string cannot be empty.
 */
case class LocalizedNormalizedString(value: String,
    attributes: Map[String, scalaxb.DataRecord[Any]] = Map()) extends LocalizedNormalizedStringable {
  lazy val xmllang = attributes("@{http://www.w3.org/XML/1998/namespace}lang").as[String]
}

trait ReferenceTypeEnum

object ReferenceTypeEnum {
  def fromString(value: String, scope: scala.xml.NamespaceBinding): ReferenceTypeEnum = value match {
    case "External" ⇒ External
    case "Self"     ⇒ Self

  }
}

case object External extends ReferenceTypeEnum { override def toString = "External" }
case object Self extends ReferenceTypeEnum { override def toString = "Self" }

trait PublisherEnumType

object PublisherEnumType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding): PublisherEnumType = value match {
    case "Vendor"      ⇒ Vendor
    case "Discoverer"  ⇒ Discoverer
    case "Coordinator" ⇒ Coordinator
    case "User"        ⇒ User
    case "Other"       ⇒ OtherValue

  }
}

case object Vendor extends PublisherEnumType { override def toString = "Vendor" }
case object Discoverer extends PublisherEnumType { override def toString = "Discoverer" }
case object Coordinator extends PublisherEnumType { override def toString = "Coordinator" }
case object User extends PublisherEnumType { override def toString = "User" }
case object OtherValue extends PublisherEnumType { override def toString = "Other" }

trait NoteTypeEnumType

object NoteTypeEnumType {
  def fromString(value: String, scope: scala.xml.NamespaceBinding): NoteTypeEnumType = value match {
    case "General"          ⇒ General
    case "Details"          ⇒ Details
    case "Description"      ⇒ DescriptionValue
    case "Summary"          ⇒ Summary
    case "FAQ"              ⇒ FAQ
    case "Legal Disclaimer" ⇒ LegalDisclaimer
    case "Other"            ⇒ Other

  }
}

case object General extends NoteTypeEnumType { override def toString = "General" }
case object Details extends NoteTypeEnumType { override def toString = "Details" }
case object DescriptionValue extends NoteTypeEnumType { override def toString = "Description" }
case object Summary extends NoteTypeEnumType { override def toString = "Summary" }
case object FAQ extends NoteTypeEnumType { override def toString = "FAQ" }
case object LegalDisclaimer extends NoteTypeEnumType { override def toString = "Legal Disclaimer" }
case object Other extends NoteTypeEnumType { override def toString = "Other" }

