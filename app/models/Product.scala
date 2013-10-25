package models

/**
 * Created with IntelliJ IDEA.
 * User: Fan
 * Date: 22/10/13
 * Time: 10:52 PM
 * To change this template use File | Settings | File Templates.
 */
case class Product (ean: Long, name: String, description: String)

object Product {

  var products = Set (
    Product(5010255079763L, "Paperclips", "Large plain pack of 100"),
    Product(5018206244666L, "Giant Paperclips", "Giant plain pack of 100"),
    Product(5018206244611L, "Zebra Paperclips", "Zebra length plain pack of 100")
  )

  // find all products
  def findAll() = this.products.toList.sortBy(_.ean)

  def findByEan(ean: Long) = this.products.find(_.ean == ean)
}




