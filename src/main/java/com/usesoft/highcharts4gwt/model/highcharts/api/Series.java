
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.array.api.ArrayNumber;

public interface Series {


    ArrayNumber data();

    Series data(ArrayNumber data);

    String dataURL();

    Series dataURL(String dataURL);

    String id();

    Series id(String id);

    Number index();

    Series index(Number index);

    Number legendIndex();

    Series legendIndex(Number legendIndex);

    String name();

    Series name(String name);

    String type();

    Series type(String type);

    Number xAxisAsNumber();

    Series xAxisAsNumber(Number xAxisAsNumber);

    String xAxisAsString();

    Series xAxisAsString(String xAxisAsString);

    Number yAxisAsNumber();

    Series yAxisAsNumber(Number yAxisAsNumber);

    String yAxisAsString();

    Series yAxisAsString(String yAxisAsString);

    Number zIndex();

    Series zIndex(Number zIndex);

}
