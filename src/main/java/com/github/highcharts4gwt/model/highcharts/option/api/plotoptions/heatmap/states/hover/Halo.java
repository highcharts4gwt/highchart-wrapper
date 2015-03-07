
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.states.hover;


public interface Halo {


    String attributes();

    Halo attributes(String attributesAsJsonString);

    double opacity();

    Halo opacity(double opacity);

    double size();

    Halo size(double size);

    String getFieldAsJsonObject(String fieldName);

    Halo setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
