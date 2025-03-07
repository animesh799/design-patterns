package com.scaler.lld.design.assignments.prototype;

import java.util.HashMap;

public class ConfigurationPrototypeRegistryImpl implements ConfigurationPrototypeRegistry{
    HashMap<ConfigurationType,Configuration> registry=new HashMap<>();
    @Override
    public void addPrototype(Configuration user) {
      registry.put(user.getType(),user);
    }

    @Override
    public Configuration getPrototype(ConfigurationType type) {
        return registry.get(type);
    }

    @Override
    public Configuration clone(ConfigurationType type) {
        return registry.get(type).cloneObject();
    }
}
