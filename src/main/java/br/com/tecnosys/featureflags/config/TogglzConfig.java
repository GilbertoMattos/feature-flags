package br.com.tecnosys.featureflags.config;

import br.com.tecnosys.featureflags.config.togglz.FilialIdActivationStrategy;
import br.com.tecnosys.featureflags.config.togglz.FilialUserProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.togglz.core.spi.ActivationStrategy;
import org.togglz.core.user.UserProvider;

@Configuration
public class TogglzConfig {

    @Bean
    public ActivationStrategy filialActivationStrategy() {
        return new FilialIdActivationStrategy();
    }

    @Bean
    public UserProvider userProvider() {
        return new FilialUserProvider();
    }
}