How to read an Integer from the standard application.properties with Spring Boot.<br/>
<br/>
How to compile and execute :<br/>
mvn package<br/>
java -jar ./target/readADoubleFromStandardPropertiesFile-0.0.1-SNAPSHOT.jar<br/>
<br/>
<br/>
---application.properties<br/>
myDouble=3.14<br/>
---MyConfigurationBean.java<br/>
private Double myDouble;<br/>
+getter and setter<br/>
---The class who displays the value of the 'myDouble' configuration<br/>
@Autowired<br/>
MyConfigurationBean myConf;<br/>
...<br/>
System.out.println(myConf.getMyDouble());<br/>
<br/>
<br/>
The application will read the value '3.14' of the property myDouble in the standard application.properties configuration file then display it in the terminal.<br/>


