<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Already registered                    I_8452a9</name>
   <tag></tag>
   <elementGuidId>1b84ab2c-1038-46d2-8480-2a2373a95ca3</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//form[@id='login-form']/div/div[2]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>div.col-2.registered-users</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>col-2 registered-users</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
                
                    Already registered?
                    If you have an account with us, please log in.
                    * Required Fields
                    
                        
                            *Email Address
                            
                                
                            
                        
                        
                            *Password
                            
                                
                            
                        
                                                
                            Forgot Your Password?
                        
                                            
                    
    
        What's this?
        Close
    
    
        Checking &quot;Remember Me&quot; will let you access your shopping cart on this computer when you are logged out
        
            Close
        
    


//&lt;![CDATA[
function toggleRememberMePopup() {
    var formParent = jQuery(this).parents('form:first');
    formParent.find('.remember-me-box a').toggleClass('hide');
    formParent.find('.remember-me-popup').toggleClass('show');
    return false;
}
var rememberMeToggleSetup = false;
jQuery(document).ready(function(){
    if (!rememberMeToggleSetup) {
        jQuery('.remember-me-box a, .remember-me-popup a').on('click', toggleRememberMePopup);
        rememberMeToggleSetup = true;
    }
});
//]]>

                
                
                    Login
                
            </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;login-form&quot;)/div[@class=&quot;col2-set&quot;]/div[@class=&quot;col-2 registered-users&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//form[@id='login-form']/div/div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Create an Account'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='View and track orders and more'])[1]/following::div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//form/div/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
