<#-- @ftlvariable name="Session.cart" type="mvc.common.CartInfo" -->

<div class="orders">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <table class="order-list">
                    <tr class="top">
                        <td colspan="2">Items</td>
                        <td></td>
                        <td>Cost</td>
                        <td>Qty</td>
                        <td>Total</td>
                    </tr>
                    <#if (Session.cart.goods)??>
                    <#list Session.cart.goods?keys as goodId>
                    <tr class="order">
                        <td class="book_view">
                            <a href="#"><img src="#"></a>
                        </td>
                        <td class="description">
                            <p><a href="#">${goodId.}${goodId}<!--span>${good.name}</span--></a>
                                <br/>
                                <span class="delete_btn">
                                    <a href="#"><img src="/resources/images/icons/delete_icon.png" alt="">
                                        <span>Remove</span>
                                    </a>
                                </span>
                            </p>
                        </td>
                        <td></td>
                        <td class="cost">
                            <span><!--${good.cost} -->$25.0</span>
                        </td>
                        <td>
                            <input type="text" class="form-control" value="1" name="count"/>
                        </td>
                        <td class="cost">
                            <span>$25.0</span>
                        </td>
                    </tr>
                    </#list>
                    <#else>
                    <tr>
                        <td>
                            <span>cart is empty.</span>
                        </td>
                    </tr>
                    </#if>
                </table>
                <div class="back_link">
                    <a href="#">
                        <img src="/resources/images/icons/back_icon.png" alt="back">
                        <span>Continue shopping</span>
                    </a>
                </div>
            </div>
            <div class="right-order-block">
                <div class="col-md-3">
                    <div class="summary">
                        <h3>Summary</h3>
                        <hr/>
                        <p>Items <span id="items">2</span></p>
                        <hr/>
                        <p id="subtotal">SUBTOTAL <span>$125.0</span></p>
                        <a href="#" class="checkout">CHECKOUT</a>
                        <div class="dop_inf">
                            <p>lalallalalallalalalala <br/>
                                lalalalalallalalalalla <br/>
                                lalalla;allalalallalalla</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>