package controllers

import play.api.mvc.{Action, Controller}
import play.api.data.Form
import play.api.data.Forms.{mapping, longNumber, nonEmptyText}
import play.api.i18n.Messages
import models.Product


/**
 * Created with IntelliJ IDEA.
 * User: Fan
 * Date: 23/10/13
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object Products extends Controller{

  //private val productForm: Form[Product]

  def list = Action { implicit request =>
      val products = Product.findAll()
      Ok(views.html.products.list(products))
  }

  def show(ean: Long) = Action { implicit request =>
      Product.findByEan(ean).map { product =>
        Ok(views.html.products.details(product))
      }.getOrElse(NotFound)
  }
}
