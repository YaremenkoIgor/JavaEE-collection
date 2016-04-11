package goIT.javaEE.collections.interfaces;

public interface ListOperationsMeasureAble {

    double measureAddByIndexOperationEfficiency();

    double measureGetByIndexOperationEfficiency();

    double measureRemoveByIndexOperationEfficiency();

    double measureIteratorAddOperationEfficiency();

    double measureIteratorRemoveOperationEfficiency();
}