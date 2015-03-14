
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.highcharts.option.api.Global;
import com.github.highcharts4gwt.model.highcharts.option.api.Lang;


/**
 * 
 */
public interface GlobalOptions {


    /**
     * Global options that don't apply to each chart. These options, like the <code>lang</code>
     * 		options, must be set using the <code>Highcharts.setOptions</code> method.
     * <pre>Highcharts.setOptions({
     * 	global: {
     * 		useUTC: false
     * 	}
     * });</pre>
     * 
     */
    Global global();

    /**
     * Global options that don't apply to each chart. These options, like the <code>lang</code>
     * 		options, must be set using the <code>Highcharts.setOptions</code> method.
     * <pre>Highcharts.setOptions({
     * 	global: {
     * 		useUTC: false
     * 	}
     * });</pre>
     * 
     */
    GlobalOptions global(Global global);

    /**
     * Language object. The language object is global and it can't
     * 		be set on each chart initiation. Instead, use <code>Highcharts.setOptions</code> to
     * 		set it before any chart is initiated. 
     * <pre>Highcharts.setOptions({
     * 	lang: {
     * 		months: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin',  'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
     * 		weekdays: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi']
     * 	}
     * });</pre>
     * 
     */
    Lang lang();

    /**
     * Language object. The language object is global and it can't
     * 		be set on each chart initiation. Instead, use <code>Highcharts.setOptions</code> to
     * 		set it before any chart is initiated. 
     * <pre>Highcharts.setOptions({
     * 	lang: {
     * 		months: ['Janvier', 'Février', 'Mars', 'Avril', 'Mai', 'Juin',  'Juillet', 'Août', 'Septembre', 'Octobre', 'Novembre', 'Décembre'],
     * 		weekdays: ['Dimanche', 'Lundi', 'Mardi', 'Mercredi', 'Jeudi', 'Vendredi', 'Samedi']
     * 	}
     * });</pre>
     * 
     */
    GlobalOptions lang(Lang lang);

    String getFieldAsJsonObject(String fieldName);

    GlobalOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    GlobalOptions setFunctionAsString(String fieldName, String functionAsString);

}
