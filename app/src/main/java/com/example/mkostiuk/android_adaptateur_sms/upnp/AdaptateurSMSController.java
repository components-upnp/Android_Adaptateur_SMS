package com.example.mkostiuk.android_adaptateur_sms.upnp;

import org.fourthline.cling.binding.annotations.UpnpService;
import org.fourthline.cling.binding.annotations.UpnpServiceId;
import org.fourthline.cling.binding.annotations.UpnpServiceType;

import java.beans.PropertyChangeSupport;

/**
 * Created by mkostiuk on 02/05/2017.
 */


@UpnpService(
        serviceType = @UpnpServiceType(value = "AdaptateurSMSController"),
        serviceId = @UpnpServiceId("AdaptateurSMSController")
)
public class AdaptateurSMSController {

    private final PropertyChangeSupport propertyChangeSupport;

    public AdaptateurSMSController() {
        propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public PropertyChangeSupport getPropertyChangeSupport() {
        return propertyChangeSupport;
    }
}
