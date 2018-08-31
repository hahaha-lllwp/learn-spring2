package org.lwp.aopPackage;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "org.lwp.aopPackage.Performance+",
            defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;
}
