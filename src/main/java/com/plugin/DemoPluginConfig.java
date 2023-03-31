package com.plugin;

import com.plugin.api.PluginConfig;

public class DemoPluginConfig extends PluginConfig {
    @Override
    public String name() {
        return "测试插件";
    }

    @Override
    public String version() {
        return "自定义版本";
    }

    @Override
    public String desc() {
        return "demo plugin 插件";
    }

    @Override
    public String ip() {
        return null;
    }

    @Override
    public Integer port() {
        return null;
    }

    @Override
    public String protocol() {
        return null;
    }

    @Override
    public String parameter() {
        return null;
    }
}
