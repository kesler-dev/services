package org.kesler.services.domain;

import java.util.Set;

public class ServiceDocument {
    private Document document;
    private Set<DocumentType> documentTypes;
    private DocumentType defaultDocumentType;
    private ApplicatorType applicatorType;
    private Situation situation;

    private boolean canGetBySmev;
    private SMEVAdapter smevAdapter;
}
