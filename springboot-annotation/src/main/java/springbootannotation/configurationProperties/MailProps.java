package springbootannotation.configurationProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "mail")
@Data
@Component
public class MailProps {

	private String name;
	private String port;
}
