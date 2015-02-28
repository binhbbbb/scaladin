package vaadin.scala

import vaadin.scala.mixins.FieldMixin

package mixins {
  trait FieldMixin[T, V] extends ComponentMixin with BufferedValidatableMixin { self: com.vaadin.ui.Field[V] =>
    override def wrapper = super.wrapper.asInstanceOf[Field[T, V]]
  }
}

trait Field[T, V] extends Component with BufferedValidatable with Property[T, V] with Component.Focusable with Wrapper {

  def p: com.vaadin.ui.Field[V] with FieldMixin[T, V]

  //readOnly is inherited from Component and Property, needs override
  override def readOnly: Boolean = p.isReadOnly
  override def readOnly_=(readOnly: Boolean) { p.setReadOnly(readOnly) }

  def required: Boolean = p.isRequired
  def required_=(required: Boolean) { p.setRequired(required) }

  def requiredError: Option[String] = Option(p.getRequiredError)
  def requiredError_=(requiredError: String) { p.setRequiredError(requiredError) }
  def requiredError_=(requiredError: Option[String]) { p.setRequiredError(requiredError.orNull) }
}
