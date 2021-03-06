package config;

import config.security.rest.RestApiSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @author cj
 * @date 2019/11/25
 */

@Configuration
//@ComponentScan({"com.service"})

//@Import({AChainSecurityConfig.class, BChainSecurityConfig.class})
//@Import({MultiChainSecurityConfig.class})
//@Import({SingleChainSecurityConfig.class})
@Import(RestApiSecurityConfig.class)
public class AppConfig {

}
