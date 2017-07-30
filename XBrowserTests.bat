set projectLocation=C:\Users\ibeok_000\workspace\NasTest
cd C:\Users\ibeok_000\workspace\NasTest
set classpath=C:\Users\ibeok_000\workspace\NasTest\target; C:\Users\ibeok_000\workspace\NasTest\lib\*
java org.testng.TestNG C:\Users\ibeok_000\workspace\NasTest\CrossBrowserTests.xml
mvn clean test -CrossBrowserTests=NasTest/CrossBrowserTests.xml
pause