package org.lwp.conditionBean;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LoadManCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment environment = conditionContext.getEnvironment();
        String[] profiles = environment.getDefaultProfiles();
        boolean profiles1 = environment.acceptsProfiles("dev");
        for (String profile : profiles) {
            if("dev".equals(profile)){
                return true;
            }
        }
        return false;
    }
}
