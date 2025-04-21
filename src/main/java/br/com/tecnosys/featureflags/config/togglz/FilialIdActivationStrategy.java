package br.com.tecnosys.featureflags.config.togglz;

import org.togglz.core.activation.Parameter;
import org.togglz.core.activation.ParameterBuilder;
import org.togglz.core.repository.FeatureState;
import org.togglz.core.spi.ActivationStrategy;
import org.togglz.core.user.FeatureUser;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FilialIdActivationStrategy implements ActivationStrategy {

    public static final String ID = "filial-id-strategy";
    public static final String PARAM_FILIAL_IDS = "filialIds";

    @Override
    public String getId() {
        return ID;
    }

    @Override
    public String getName() {
        return "Ativo para IDs de Filiais";
    }

    @Override
    public boolean isActive(FeatureState featureState, FeatureUser user) {
        String filialIdsParam = featureState.getParameter(PARAM_FILIAL_IDS);
        if (filialIdsParam == null || user == null) {
            return false;
        }

        Set<Long> filialIds = Arrays.stream(filialIdsParam.split(","))
                .map(String::trim)
                .map(Long::parseLong)
                .collect(Collectors.toSet());

        Long currentFilialId = (Long) user.getAttribute("filialId");
        return currentFilialId != null && filialIds.contains(currentFilialId);
    }

    @Override
    public Parameter[] getParameters() {
        return new Parameter[] {
            ParameterBuilder.create(PARAM_FILIAL_IDS)
                .label("IDs das Filiais")
                .description("Lista de IDs das filiais separados por vírgula (ex: 1,2,3)")
                .optional()
        };
    }
}