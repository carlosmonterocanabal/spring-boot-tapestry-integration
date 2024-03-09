package ch.baurs.spring.integration.tapestry.itgtest.services;

import org.apache.tapestry5.ioc.ServiceBinder;
import org.apache.tapestry5.ioc.annotations.ImportModule;
import org.apache.tapestry5.modules.TapestryModule;

/**
 *
 */
@ImportModule(TapestryModule.class)
public class TapestryMainModule {

    public static void bind(ServiceBinder binder) {
        binder.bind(TestService.class, TestServiceImpl.class);
    }

}
