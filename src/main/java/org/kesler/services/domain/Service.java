package org.kesler.services.domain;


import java.util.Set;

public class Service {
    private String name;
    private Service parent;
    private OGV ogv;
    private Set<Filial> filials;

    private Set<ApplicatorType> applicatorTypes;

    private Set<ServiceDocument> serviceDocuments;
}

