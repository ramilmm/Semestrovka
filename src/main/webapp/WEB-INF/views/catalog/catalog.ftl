<#-- @ftlvariable name="topGoods" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->
<#include "../template/template.ftl">
<@mainTemplate title="Catalog" styles=["css/catalog.css"]/>
<#macro m_body>
<#include "../template/components/headerCategoryList.ftl" />
<#include "../template/components/left-menu.ftl" />
<div class="col-md-9">
    <div class="tabs">
        <div class="good_list">
            <h1>Poetry</h1>
            <div class="good_item">
                <a href="Product_page.html"><img src="/resources/images/books/Blok1.jpg" alt="Blok"></a>
                <h4>Alexander Blok</h4>
                <h5>Writings</h5>
                <a href="Product_page.html"><span>$50</span></a>
            </div>
            <div class="good_item">
                <a href="Product_page.html"><img src="/resources/images/books/Blok2.jpg" alt="Blok"></a>
                <h4>Alexander Blok</h4>
                <h5>Poetry and poems</h5>
                <a href="Product_page.html"><span>$67</span></a>
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
</div>
</#macro>