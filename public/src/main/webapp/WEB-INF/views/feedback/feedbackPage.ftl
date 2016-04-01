<#assign form=JspTaglibs["http://www.springframework.org/tags/form"]>
<#include "../template/template.ftl">
<@mainTemplate title="Обратная связь" styles=[""] />
<#macro m_body>
<div class="men">
    <div class="container">
        <div class="contact_form">
            <h2>Feedback</h2>
            <@form.form commandName="feedbackForm" action="/feedback"  acceptCharset="UTF-8" method="POST">
                <div class="col-md-6 to">
                    <div>
                        <@form.input path="firstName" placeholder="First name"/>
                        <@form.errors path="firstName" cssStyle= "color:red"/>
                    </div>
                    <div>
                        <@form.input path="secondName" placeholder="Second name"/>
                        <@form.errors path="secondName" cssStyle="color:red"/>
                    </div>
                    <div>
                        <@form.input path="email" placeholder="Email"/>
                        <@form.errors path="email" cssStyle="color:red"/>
                    </div>
                </div>
                <div class="col-md-6 text">
                    <@form.textarea path="subject" placeholder="Write feedback here" />
                    <@form.errors path="subject" cssStryle="color:red"/>
                </div>
                <div class="clearfix"></div>
                <div class="but__center"><input type="submit" value="Send message &gt;&gt;"></div>
            </@form.form>
        </div>
    </div>
</div>
</#macro>