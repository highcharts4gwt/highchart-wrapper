
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.array.api.Array;
import com.usesoft.highcharts4gwt.model.array.api.ArrayNumber;
import com.usesoft.highcharts4gwt.model.highcharts.api.series.Data;

public interface Series {


    Array<Data> dataAsArrayObject();

    Series dataAsArrayObject(Array<Data> dataAsArrayObject);

    ArrayNumber dataAsArrayNumber();

    Series dataAsArrayNumber(ArrayNumber dataAsArrayNumber);

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
