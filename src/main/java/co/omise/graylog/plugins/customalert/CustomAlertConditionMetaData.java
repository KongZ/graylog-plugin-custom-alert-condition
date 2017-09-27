package co.omise.graylog.plugins.customalert;

import java.net.URI;
import java.util.Collections;
import java.util.Set;

import org.graylog2.plugin.PluginMetaData;
import org.graylog2.plugin.ServerStatus;
import org.graylog2.plugin.Version;

public class CustomAlertConditionMetaData implements PluginMetaData {
   private static final String PLUGIN_PROPERTIES = "co.omise.graylog.plugins.graylog-plugin-custom-alert-condition/graylog-plugin.properties";

   @Override
   public String getUniqueId() {
      return CustomAlertCondition.class.getName();
   }

   @Override
   public String getName() {
      return "Custom Alert Plugin";
   }

   @Override
   public String getAuthor() {
      return "Omise";
   }

   @Override
   public URI getURL() {
      return URI.create("https://github.com/omise/graylog-plugin-custom-alert-condition");
   }

   @Override
   public Version getVersion() {
      return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "version", Version.from(1, 0, 0, "unknown"));
   }

   @Override
   public String getDescription() {
      return "Alert plugin that trigger alarm when match with given criterias";
   }

   @Override
   public Version getRequiredVersion() {
      return Version.fromPluginProperties(getClass(), PLUGIN_PROPERTIES, "graylog.version", Version.from(2, 3, 0));
   }

   @Override
   public Set<ServerStatus.Capability> getRequiredCapabilities() {
      return Collections.emptySet();
   }
}
