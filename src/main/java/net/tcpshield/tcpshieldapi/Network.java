package net.tcpshield.tcpshieldapi;

import java.util.Date;
import java.util.List;

public interface Network {

    int getID();

    String getName();

    void setName(String name);

    boolean isPremium();

    String getProtectedCNAME();

    String getTXTVerification();

    MitigationSettings getMitigationSettings();

    Date getUpdatedAt();

    Date getCreatedAt();

}
