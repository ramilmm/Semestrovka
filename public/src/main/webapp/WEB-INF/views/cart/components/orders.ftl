<#-- @ftlvariable name="Session.cart" type="mvc.common.CartInfo" -->
<#--@ftlvariable name="cart" type="java.util.List<mvc.common.Cart>"-->
<div class="orders">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <#--<table class="order-list">-->
                    <#--<tr class="top">-->
                        <#--<td colspan="2">Items</td>-->
                        <#--<td></td>-->
                        <#--<td>Cost</td>-->
                        <#--<td>Qty</td>-->
                        <#--<td>Total</td>-->
                    <#--</tr>-->
                <#--<#if (Session.cart.goods)??>-->
                    <#--<#list Session.cart.goods?keys as good>-->
                    <#--&lt;#&ndash;<#list cart as good>&ndash;&gt;-->
                        <#--<tr class="order">-->
                            <#--<td class="book_view">-->
                                <#--<a href="/good/${good.id}"><img src="${good.image}" alt="${good.name}"></a>-->
                            <#--</td>-->
                            <#--<td class="description">-->
                                <#--<p><a href="/good/${good.id}">${good.author} : ${good.name}</a>-->
                                    <#--<br/>-->
                            <#--<span class="delete_btn">-->
                                <#--<p class="js_deleteGood" data-id="${good.id}"><img-->
                                        <#--src="/resources/images/icons/delete_icon.png">-->
                                    <#--<span>Remove</span>-->
                                <#--</p>-->
                                <#--</span>-->
                             <#--</p>-->
                            <#--</td>-->
                            <#--<td></td>-->
                            <#--<td class="cost">-->
                                <#--<span data-id="${good.cost}">$${good.cost}</span>-->
                            <#--</td>-->
                            <#--<td class="item-quantity">-->
                                <#--<input type="text" class="form-control count simpleCart_input" value="${Session.cart.getCount(good)}"-->
                                       <#--name="count"/>-->
                            <#--</td>-->
                            <#--<td class="cost">-->
                                <#--<span class="total"></span>-->
                            <#--</td>-->
                        <#--</tr>-->
                    <#--&lt;#&ndash;</#list>&ndash;&gt;-->
                <#--</#list>-->
                <#--<#else>-->
                    <#--<tr>-->
                        <#--<td>-->
                            <#--<span>cart is empty.</span>-->
                        <#--</td>-->
                    <#--</tr>-->
                <#--</#if>-->
                <#--</table>-->
            <div class="simpleCart_items"></div>
                <div class="back_link">
                    <a href="/">
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
                        <p>Items <span id="items" class="simpleCart_quantity"></span></p>
                        <hr/>
                        <p id="subtotal">SUBTOTAL <br/>
                            <span class="simpleCart_total"></span></p>
                        <form action="/cart/interval" method="post">
                            <input type="text" style="display: none" class="total_quantity" name="total_quantity" value="1">
                            <input type="text" style="display: none" class="total_sum" name="total_sum" value="1">
                            <input type="submit" class="btn btn-default checkout" value="CHECKOUT">
                        </form>
                        <div class="dop_inf">
                            <p> 2 Million Experiences Sold <br/>
                                Free Exchange on Vounchers <br/>
                                Refuns Within 14 Days</p>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
