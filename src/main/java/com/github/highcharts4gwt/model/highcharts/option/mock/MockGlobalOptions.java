
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Global;
import com.github.highcharts4gwt.model.highcharts.option.api.GlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Lang;

public class MockGlobalOptions
    implements GlobalOptions
{

    private Global global;
    private Lang lang;
    private String genericField;

    public Global global() {
        return global;
    }

    public MockGlobalOptions global(Global global) {
        this.global = global;
        return this;
    }

    public Lang lang() {
        return lang;
    }

    public MockGlobalOptions lang(Lang lang) {
        this.lang = lang;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockGlobalOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
