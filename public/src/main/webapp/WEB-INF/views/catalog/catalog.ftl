<#-- @ftlvariable name="Goods" type="java.util.List<mvc.common.GoodInfo>" -->
<#-- @ftlvariable name="Category" type="mvc.common.CategoryInfo" -->
<#include "../template/template.ftl">
<@mainTemplate title="Catalog" styles=["css/catalog.css"]/>
<#macro m_body>
<#include "../template/components/headerCategoryList.ftl" />
<#include "../template/components/left-menu.ftl" />
<div class="col-md-9">
    <div class="tabs">
        <div class="good_list">
            <h1>${Category.name}</h1>
            <#list Goods as good>
                <div class="good_item">
                    <a href=""><img src="${good.image}" alt="${good.name}"></a>
                    <h4>${good.author}</h4>
                    <h5>${good.name}</h5>
                    <a href="/good/${good.id}" data-id="${good.id}"><span>$${good.cost}.00</span></a>
                </div>
            </#list>
        </div>
    </div>
</div>
</#macro>