<#-- @ftlvariable name="Menu" type="java.util.List<mvc.common.MenuInfo>" -->

<div class="category">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <#list Menu as menu>
                    <#if menu.listCategory?has_content>
                    <ul id="top-nav">
                                <#list menu.listCategory as category>
                                    <li>
                                        <a href="#">${category.name}</a>
                                        <ul>
                                            <#list category.children as child>
                                                <li>
                                                    <a href="/catalog/${child.id}">${child.name}</a>
                                                </li>
                                            </#list>
                                        </ul>
                                    </li>
                            </#list>
                    </#if>
                </#list>
            </div>
        </div>
    </div>
    <hr>
</div>