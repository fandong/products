package controllers

import play.api.mvc.{Action, Controller}
import models.Product

/**
 * Created with IntelliJ IDEA.
 * User: Fan
 * Date: 23/10/13
 * Time: 10:03 PM
 * To change this template use File | Settings | File Templates.
 */
object Products extends Controller{
  def list = Action {
    implicit request =>
      val products = Product.findAll()
      Ok(views.html.products.list(products))
  }
}
