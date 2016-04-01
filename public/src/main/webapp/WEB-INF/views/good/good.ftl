<#-- @ftlvariable name="Session.cart" type="mvc.common.CartInfo" -->
<#-- @ftlvariable name="good" type="mvc.common.GoodInfo" -->
<#include "../template/template.ftl">
<@mainTemplate title="BookStore" styles=["css/product.css"] />
<#macro m_body>
<#include "components/nav_way.ftl" />
<div class="container">
    <div class="product_info">
        <div class="row">
            <#if good??>
            <div class="col-md-4">
                <div class="book_view">
                    <img src="${good.image}" alt="${good.name}">
                </div>
            </div>
            <div class="col-md-8">
                <h1>${good.name}</h1>
                <div class="description">
                    <span>${good.description}</span>
                </div>
                <div class="pay_description">
                    <p>Our price : <span>$${good.cost}.00</span>
                        <#if (Session.cart.goods)?? && Session.cart.containsGoodId(good.id)>
                            <a href="/cart" class="my_button">Go in cart</a>
                        <#else>
                            <a href="/cart" data-id="${good.id}" class="my_button add-to-cart">Add to cart</a></p><hr>
                        </#if>
                        <h7>Safe,Secure Shopping</h7><br>
                    <img src="/resources/images/paypal.png" alt="paypal">
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="mid_part">
            <div class="col-md-9">
                <div class="tabs">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#tab-1" data-toggle="tab">Interesting facts</a></li>
                        <li><a href="#tab-2" data-toggle="tab">Other Details</a></li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane fade in active" id="tab-1">
                            <p>${good.interesting_facts}</p>
                        </div>
                        <div class="tab-pane fade" id="tab-2">
                            <p>${good.description}</p>
                        </div>
                    </div>
                </div>
                <#include "components/comments.ftl" />
                </div>
            </div>
            <#include "components/popular.ftl" />
                <#else>
                <span>Sorry, book not found.</span>
            </#if>
        </div>
    </div>
</#macro>