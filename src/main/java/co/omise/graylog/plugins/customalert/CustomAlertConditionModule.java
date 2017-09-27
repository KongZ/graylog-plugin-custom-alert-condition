package co.omise.graylog.plugins.customalert;

import java.util.Collections;
import java.util.Set;

import org.graylog2.plugin.PluginConfigBean;
import org.graylog2.plugin.PluginModule;

public class CustomAlertConditionModule extends PluginModule {

   @Override
   public Set<? extends PluginConfigBean> getConfigBeans() {
      return Collections.emptySet();
   }

   @Override
   protected void configure() {
      addAlertCondition(CustomAlertCondition.class.getCanonicalName(), CustomAlertCondition.class,
            CustomAlertCondition.Factory.class);
   }

}
