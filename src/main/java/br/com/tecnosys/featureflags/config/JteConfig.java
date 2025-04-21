package br.com.tecnosys.featureflags.config;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import gg.jte.resolve.ResourceCodeResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.nio.file.Path;

@Configuration
public class JteConfig {

    @Bean(name = "jteTemplateEngine")
    public TemplateEngine jteTemplateEngine() {
        if (isDevelopment()) {
            DirectoryCodeResolver codeResolver = new DirectoryCodeResolver(Path.of("src/main/resources/templates"));
            return TemplateEngine.create(codeResolver, ContentType.Html);
        }

        ResourceCodeResolver codeResolver = new ResourceCodeResolver("/templates");
        return TemplateEngine.create(codeResolver, ContentType.Html);
    }

    private boolean isDevelopment() {
        try {
            return new ClassPathResource("/templates").getFile().exists();
        } catch (IOException e) {
            return false;
        }
    }
}