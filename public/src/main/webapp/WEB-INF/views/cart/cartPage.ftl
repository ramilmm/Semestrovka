<#include "../template/template.ftl">
<@mainTemplate title="Cart" styles=["css/cart.css"]/>
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
<#include "components/orders.ftl" />
</#macro>