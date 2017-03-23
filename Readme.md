<p align="center">
  <img src="screnshot.jpg" />
</p>

## What is Automated Testing?
* Automated testing is a practice that we can use besides to the usual manual testing, as we all know, manual testing is performed by testers that design and execute tests on a system manually and without any use of external tools. *

Common automated testing tools

```
+-----------+---------------------------------------------------------------+
| Test       		   | Automated Tool                                 |
+-----------+---------------------------------------------------------------+
| Unit Testing   	   | TestNG, NUnit,xUnit…			    |
| Security Testing         | WireShark, WebInspect, fiddler….               |
| Penetration Testing  	   | CORE impact, Metasploit, Nessus, 		    |
|                            Retina,Sqlmap,Sqlninja,beEF,Hydra, Nagios,Nmap…|
| Performance Testing      | JMeter, LoadRunner, WebLoad, 	            |
|                            NeoLoad,Qtest,Loadster,Wapt….                  |
| Regresssion Testing      | TestCafe,QTP,vTest,Winrunner,TestComplete …    |
| Web Testing     	   | SoapUI,Ranorex, Selenium, Browsershots, IE Tab,|
|			     BrowserCam,Watir…	   			    |
| Mobile Testing   	   | Frank (iOS), iOS UI Automation (iOS), Robotium |
|			     (Android),Appium (Android/iOS)… 		    |
| Cloud Testing	           | SaltStack,Fabric, Chef, Puppet, Juju…          |
+-----------+---------------------------------------------------------------+
```

### WebdriverIO Syntax

```
browser.url('http://jobs.bg');
$('#txtarea').setValue('webdriver');
$('#btn1').click();
```

Far simpler than the original selenium webdriverjs

```
driver.get('http://jobs.bg');
driver.findElement(webdriver.By.id('txtarea')).sendKeys('webdriver');
driver.findElement(webdriver.By.id('btn1')).click();
```

And far easier than the traditional JS

```
browser
  .get("http://jobs.bg")
  .elementById('txtarea')
  .sendKeys('webdriver')
  .elementById('btn1')
  .click()
```