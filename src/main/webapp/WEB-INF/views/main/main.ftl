<#-- @ftlvariable name="topGoods" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->
<#include "../template/template.ftl">
<@mainTemplate title="BookStore" styles=["css/home_page.css"]/>
<#macro m_body>
<#include "../template/components/headerCategoryList.ftl" />
<div class="slider">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div id="carousel" class="carousel">
                    <div> <a href="Product_page.html"><img src="/resources/images/carousel/carousel2.jpg" alt="alt"></a> </div>
                    <div><a href="Product_page.html"><img src="/resources/images/carousel/carousel1.jpg" alt="alt"></a> </div>
                </div>

            </div>
            <div class="col-md-3">
                <div class="deal_of_the_Month">
                    <h1>Deal of the Month</h1>
                        <h5>Tolstoy War and peace</h5>
                        <img src="/resources/images/voina_i_mir.jpg" alt="voina_and_mir">
                        <h4>Save 45% Today</h4>
                        <h3 id="price">$27.50</h3>
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
            <li><a href="#tab-4" data-toggle="tab">Special offers</a></li>
        </ul>
        <div class="tab-content">
            <div class="tab-pane fade in active" id="tab-1">
                <div class="good_list">
                    <div class="good_item">
                        <a href="/cart"><img src="/resources/images/books/Blok1.jpg" alt="Blok"></a>
                        <h4>Alexander Blok</h4>
                        <h5>Writings</h5>
                        <a href="/cart"><span>$50</span></a>
                    </div>
                    <div class="good_item">
                        <a href="/cart"><img src="/resources/images/books/Blok2.jpg" alt="Blok"></a>
                        <h4>Alexander Blok</h4>
                        <h5>Poetry and poems</h5>
                        <a href="/cart"><span>$67</span></a>
                    </div>
                    <div class="good_item">
                        <a href="#"><img src="/resources/images/books/Lermontov1.jpg" alt="Lermontov"></a>
                        <h4>Mikhail Lermontov</h4>
                        <h5>Tragedy in the Caucasus</h5>
                        <a href="#"><span>$23</span></a>
                    </div>
                    <div class="good_item">
                        <a href="#"><img src="/resources/images/books/Lermontov2.jpg" alt="Lermontov"></a>
                        <h4>Mikhail Lermontov</h4>
                        <h5>Heroes of our time</h5>
                        <a href="#"><span>$41</span></a>
                    </div>
                    <div class="good_item">
                        <a href="#"><img src="/resources/images/books/Lermontov3.jpg" alt="Lermontov"></a>
                        <h4>Mikhail Lermontov</h4>
                        <h5>Masquerade</h5>
                        <a href="#"><span>$87</span></a>
                    </div>
                    <div class="good_item">
                        <a href="#"><img src="/resources/images/books/Lermontov3.jpg" alt="Lermontov"></a>
                        <h4>Mikhail Lermontov</h4>
                        <h5>Masquerade</h5>
                        <a href="#"><span>$72</span></a>
                    </div>
                    <div class="good_item">
                        <a href="#"><img src="/resources/images/books/brodsky.jpg" alt="Blok"></a>
                        <h4>Joseph Brodsky</h4>
                        <h5>Poems</h5>
                        <a href="#"><span>$34</span></a>
                    </div>
                    <div class="good_item">
                        <a href="#"><img src="/resources/images/books/Dostoevsky1.jpg" alt="Blok"></a>
                        <h4>Fedor Dostoevsky</h4>
                        <h5>Zapisky</h5>
                        <a href="#"><span>$102</span></a>
                    </div>
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