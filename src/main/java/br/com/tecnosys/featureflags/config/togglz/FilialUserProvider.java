package br.com.tecnosys.featureflags.config.togglz;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

public class FilialUserProvider implements UserProvider {

    @Override
    public FeatureUser getCurrentUser() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes == null) {
            return null;
        }

        String filialId = attributes.getRequest().getParameter("filialId");
        if (filialId == null) {
            return null;
        }

        SimpleFeatureUser user = new SimpleFeatureUser("user-" + filialId, false);
        user.setAttribute("filialId", Long.parseLong(filialId));
        return user;
    }
}