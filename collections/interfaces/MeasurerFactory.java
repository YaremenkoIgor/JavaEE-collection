package goIT.javaEE.collections.interfaces;


import goIT.javaEE.collections.abstracts.Measurer;

import java.util.Collection;

public interface MeasurerFactory {

    Measurer makeMeasurer(Collection collection);
}
