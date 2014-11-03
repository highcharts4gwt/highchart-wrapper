
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.array.api.ArrayNumber;

public interface Series {


    ArrayNumber data();

    Series data(ArrayNumber data);

    String dataURL();

    Series dataURL(String dataURL);

    String id();

    Series id(String id);

    double index();

    Series index(double index);

    double legendIndex();

    Series legendIndex(double legendIndex);

    String name();

    Series name(String name);

    String type();

    Series type(String type);

    double xAxisAsNumber();

    Series xAxisAsNumber(double xAxisAsNumber);

    String xAxisAsString();

    Series xAxisAsString(String xAxisAsString);

    double yAxisAsNumber();

    Series yAxisAsNumber(double yAxisAsNumber);

    String yAxisAsString();

    Series yAxisAsString(String yAxisAsString);

    double zIndex();

    Series zIndex(double zIndex);

}
