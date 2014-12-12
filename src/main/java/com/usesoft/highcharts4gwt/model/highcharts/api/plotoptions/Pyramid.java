
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Funnel;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.PyramidShowHandler;

public interface Pyramid
    extends Funnel
{


    void addPyramidAfterAnimateHandler(PyramidAfterAnimateHandler pyramidAfterAnimateHandler);

    void addPyramidCheckboxClickHandler(PyramidCheckboxClickHandler pyramidCheckboxClickHandler);

    void addPyramidClickHandler(PyramidClickHandler pyramidClickHandler);

    void addPyramidHideHandler(PyramidHideHandler pyramidHideHandler);

    void addPyramidLegendItemClickHandler(PyramidLegendItemClickHandler pyramidLegendItemClickHandler);

    void addPyramidMouseOutHandler(PyramidMouseOutHandler pyramidMouseOutHandler);

    void addPyramidMouseOverHandler(PyramidMouseOverHandler pyramidMouseOverHandler);

    void addPyramidShowHandler(PyramidShowHandler pyramidShowHandler);

}
