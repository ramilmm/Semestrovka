<#include "../template/template.ftl">
<@mainTemplate title="Catalog" styles=["css/cart.css"]/>
<#macro m_body>
<#include "../template/components/headerCategoryList.ftl" />
<div class="main">
    <div class="shopping-list">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="head">
                        <h1>Your shopping cart</h1>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

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
                    <tr class="order">
                        <td class="book_view">
                            <a href="#"><img src="/resources/images/books/Dostoevsky1.jpg" alt="Dostoevskiy"></a>
                        </td>
                        <td class="description">
                            <p><a href="#">Fedor Dostoevskiy lalalala</a>
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
                            <span>$25.0</span>
                        </td>
                        <td>
                            <input type="text" class="form-control" value="1"/>
                        </td>
                        <td class="cost">
                            <span>$25.0</span>
                        </td>
                    </tr>
                    <tr class="order">
                        <td class="book_view">
                            <a href="#"><img src="/resources/images/books/Dostoevsky2.jpg" alt="Dostoevskiy"></a>
                        </td>
                        <td class="description">
                            <p><a href="#">Fedor Dostoevskiy Igrok</a>
                                <br/>
                                <span class="delete_btn">
                                    <a href="#"><img src="/resources/images/icons/delete_icon.png" alt="">
                                        <span>Remove</span>
                                    </a>
                                </span></p>
                        </td>
                        <td></td>
                        <td class="cost">
                            <span>$100.0</span>
                        </td>
                        <td>
                            <input type="text" class="form-control" value="1"/>
                        </td>
                        <td class="cost">
                            <span>$100.0</span>
                        </td>
                    </tr>
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
</#macro>