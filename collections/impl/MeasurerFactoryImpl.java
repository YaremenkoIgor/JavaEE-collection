package goIT.javaEE.collections.impl;


import goIT.javaEE.collections.abstracts.Measurer;
import goIT.javaEE.collections.exceptions.UnsupportedTypeOfCollectionMeasurerEfficiencyException;
import goIT.javaEE.collections.interfaces.MeasurerFactory;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class MeasurerFactoryImpl implements MeasurerFactory {

    @Override
    public Measurer makeMeasurer(Collection collection) {

        if (collection instanceof List) {
            return new ListMeasurerImpl((List<Integer>)collection);
        } else if (collection instanceof Set) {
            return new SetMeasurerImpl((Set<Integer>)collection);
        } else {
            throw new UnsupportedTypeOfCollectionMeasurerEfficiencyException();
        }
    }
}
