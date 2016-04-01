<#-- @ftlvariable name="deal" type="mvc.common.GoodInfo" -->
<#-- @ftlvariable name="topGoods" type="java.util.List<mvc.common.GoodInfo>" -->
<#include "../template/template.ftl">
<@mainTemplate title="BookStore" styles=["css/home_page.css", "css/ion.rangeSlider.css", "css/ion.rangeSlider.skinHTML5.css"]/>
<#macro m_body>
<#include "../template/components/headerCategoryList.ftl" />
<div class="slider">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div id="carousel" class="carousel">
                    <div> <img src="/resources/images/carousel/carousel2.jpg"></div>
                    <div><img src="/resources/images/carousel/carousel1.jpg" ></div>
                </div>

            </div>
            <div class="col-md-3">
                <div class="deal_of_the_Month">
                    <h1>Deal of the Month</h1>
                        <h5>${deal.name}</h5>
                        <img src="${deal.image}">
                        <h3 id="price">${deal.cost}</h3>
                        <a href="#">Buy now</a>
                </div>
            </div>
        </div>
    </div>
</div>
    <#include "../template/components/left-menu.ftl" />
<div class="container">
    <div class="row">
<div class="col-md-9">
    <div class="tabs">
        <ul class="nav nav-tabs">
            <li class="active"><a href="#tab-1" data-toggle="tab">Best sellers</a></li>
            <li><a href="#tab-2" data-toggle="tab">New arrivals</a></li>
            <li><a href="#tab-3" data-toggle="tab">Used Books</a></li>
            <li><a href="#tab-4" data-toggle="tab">Exclusive</a></li>
        </ul>
        <div class="tab-content">
            <div class="tab-pane fade in active" id="tab-1">
                <div class="row">
                <#list topGoods as good>
                    <div class="good_list">
                        <div class="good_item">
                            <a href="/cart"><img src="/resources/images/books/Blok1.jpg" alt="Blok"></a>
                            <h4>${good.author}</h4>
                            <h5>${good.name}</h5>
                            <a href="/cart"><span>$${good.cost}</span></a>
                        </div>
                    </div>
                </#list>
                </div>
            </div>
            <div class="tab-pane fade" id="tab-2">
                <div class="container">
                    <div class="row">
                        <div class="good_list">
                            .
                        </div>
                    </div>
                </div>
            </div>
            <div class="tab-pane fade" id="tab-3">
                <div class="container">
                    <div class="row">
                        <div class="good_list">
                            .
                        </div>
                    </div>
                </div>
            </div>
            <div class="tab-pane fade" id="tab-4">
                <div class="container">
                    <div class="row">
                        <div class="good_list">
                            .
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
    </div>
</div>
</#macro>