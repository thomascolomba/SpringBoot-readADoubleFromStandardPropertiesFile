package readADoubleFromStandardPropertiesFile.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class MyConfigurationBean {
    private Double myDouble;
	public Double getMyDouble() {
		return myDouble;
	}
	public void setMyDouble(Double myDouble) {
		this.myDouble = myDouble;
	}
}