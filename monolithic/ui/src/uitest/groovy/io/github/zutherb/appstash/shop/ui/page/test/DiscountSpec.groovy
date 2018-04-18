package io.github.zutherb.appstash.shop.ui.page.test 
2 
 
3 import geb.Page 
4 import geb.spock.GebReportingSpec 
5 import org.openqa.selenium.remote.DesiredCapabilities 
6 import org.openqa.selenium.remote.RemoteWebDriver 
7 import io.github.zutherb.appstash.common.util.Config 
8 
 
9 class DiscountSpec extends GebReportingSpec { 
10     def "Check discount"() { 
11         when: 
12         to HomePage 
13         assert discountHeader.text() == "Save!" 
14         assert discountPercent.text() == Config.getProperty("GLOBAL_DISCOUNT") 
15         assert discountLabel.text() ==  "You save" 
16 
 
17         and: 
18         homeLink.click() 
19 
 
20         then: 
21         at HomePage 
22     } 
23 } 
