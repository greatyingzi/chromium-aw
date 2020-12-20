// GeolocationContext.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/device/public/mojom/geolocation_context.mojom
//

package org.chromium.device.mojom;


public interface GeolocationContext extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends GeolocationContext, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<GeolocationContext, GeolocationContext.Proxy> MANAGER = GeolocationContext_Internal.MANAGER;


    void bindGeolocation(
org.chromium.mojo.bindings.InterfaceRequest<Geolocation> receiver, org.chromium.url.mojom.Url origin);



    void setOverride(
Geoposition geoposition);



    void clearOverride(
);


}
