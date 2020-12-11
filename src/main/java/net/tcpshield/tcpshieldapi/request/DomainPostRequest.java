package net.tcpshield.tcpshieldapi.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DomainPostRequest {

    @JsonProperty
    private final String name;
    @JsonProperty("backend_set_id")
    private final int backendSetID;
    @JsonProperty
    private final boolean bac;

    public DomainPostRequest(String name, int backendSetID, boolean bac) {
        this.name = name;
        this.backendSetID = backendSetID;
        this.bac = bac;
    }
}
